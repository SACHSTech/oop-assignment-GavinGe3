package bigDonalds;
import java.io.*;
import java.util.*;

/**
 * Main Class File 
 * @author: G. Ge
 */

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        
        // Intialize Menu, Order and variables to operate the program
        Order newOrder = new Order();
        int numFoods = 0;
        int numDrinks = 0;
        int intContinueOrder = 2;
        boolean ordering = true;
        int removeNumDrink;
        int removeNumFood;
        

        // Welcome the user to the menu
        System.out.println("Welcome to BigDonalds, the best fast food in the business.");
        System.out.println("Here is the preview of our menu.");

        // While the User wants to order
        while(ordering){

           
            // While the user wants to add an item
            while (intContinueOrder == 2){

                // Display the menu
                Menu newMenu = new Menu();
                newMenu.getInfo();

                // User inputs the item they want to order based on menu number
                System.out.println("Enter the Menu Number of your desired item.");
                int currentOrder = Integer.parseInt(scanner.nextLine());

                // If customer orders food, allow them to customize the food, and add it to the order
                if (currentOrder < 11){
                    newMenu.getFood(currentOrder).setInfo();
                    newOrder.addFoodToOrder(newMenu.getFood(currentOrder));
                    numFoods += 1;
                }

                // If customer orders Drink, allow them to customize the food, and add it to the order
                if (currentOrder > 10){
                    newMenu.getDrink(currentOrder).setInfo();
                    newOrder.addDrinkToOrder(newMenu.getDrink(currentOrder));
                    numDrinks += 1;
                }

                // Display the Order summary
                newOrder.showOrder(numFoods, numDrinks);

                // Allow user to decide on their next action
                System.out.println("Enter 0 to complete your order. Enter 1 to remove items from your order. Enter 2 to continue ordering: ");
                intContinueOrder = Integer.parseInt(scanner.nextLine());
            }
            
            // While the user wants to checkout their order and the order has items
            while (intContinueOrder == 0 && (numFoods > 0 || numDrinks > 0)){

                // Checkout the order by having the user enter their personal info and break out of loop
                System.out.println();
                newOrder.checkOut();
                ordering = false;
                break;
            }

            // While the user wants to checkout their order and the order has no items
            while (intContinueOrder == 0 && numFoods == 0 && numDrinks == 0){

                System.out.println("You have no items in your cart. Are you sure you want to checkout. (Yes or No)");
                String nullCheckout = scanner.nextLine();
                
                // If the user has confirmed they want to checkout
                if (nullCheckout.equalsIgnoreCase("yes")){
                    System.out.println("Thank you for considering shopping at BigDonalds");
                    ordering = false;
                    break;
                }
                // If the user wants to continue ordering
                if (nullCheckout.equalsIgnoreCase("no")){
                    intContinueOrder = 2;
                }
            }

            // While the user wants to remove items their order
            while (intContinueOrder == 1){

                // Asks customer if they desire to remove Food or Drink
                System.out.println("Do you want to remove a food or drink? (Enter food or drink)");
                String remove = scanner.nextLine();

                // Show the customer the order summary
                newOrder.showOrder(numFoods, numDrinks);

                // If the user wants to remove a Food
                if(remove.equalsIgnoreCase("food")){
                    // Asks the user the Food Item number they want to remove, remove it from the order, and subtract its price
                    System.out.println("Enter the number of Food item you want to remove shown on the Order Summary.");
                    removeNumFood = Integer.parseInt(scanner.nextLine());
                    newOrder.removeFoodFromOrder(removeNumFood-1);
                    numFoods -= 1;
                    
                }
                // If the user wants to remove a Drink
                if(remove.equalsIgnoreCase("drink")){
                    // Asks the user the Drink Item number they want to remove, and remove it from the order, and subtract its price
                    System.out.println("Enter the number of drink item you want to remove shown on the Order Summary.");
                    removeNumDrink = Integer.parseInt(scanner.nextLine());
                    newOrder.removeDrinkFromOrder(removeNumDrink-1);
                    numDrinks -= 1;
                }

                // Show the user their order summary again
                newOrder.showOrder(numFoods, numDrinks);


                // If the user has no items in their order
                if (numFoods == 0 && numDrinks == 0){
                    System.out.println("Enter 0 to stop ordering. Enter 2 to continue Ordering");
                    intContinueOrder = Integer.parseInt(scanner.nextLine());
                }

                // If the user has items in their order
                if (numFoods > 0 || numDrinks > 0){
                    System.out.println("Enter 0 to complete your order. Enter 1 to continue removing items from your order. Enter 2 to continue ordering.");
                    intContinueOrder = Integer.parseInt(scanner.nextLine());
                }
            }
             // Check that the user has inputted a correct option for order state
             if (intContinueOrder != 0 && intContinueOrder != 1 && intContinueOrder != 2){
                if (numFoods == 0 && numDrinks == 0){
                    System.out.println("Invalid number! Enter 0 to stop ordering. Enter 2 to continue Ordering");
                    intContinueOrder = Integer.parseInt(scanner.nextLine());
                }
                else{
                    System.out.println("Invalid number! Enter 0 to stop ordering. Enter 1 to remove an item from your order. Enter 2 to continue Ordering.");
                    intContinueOrder = Integer.parseInt(scanner.nextLine());
                }
            }
        }
    }
}
