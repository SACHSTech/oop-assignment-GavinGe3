package bigDonalds;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        // Intialize Menu and variables
        
        Menu newMenu = new Menu();
        Order newOrder = new Order();
        int numFoods = 0;
        int numDrinks = 0;
        int intContinueOrder = 2;
        boolean ordering = true;


        System.out.println("Welcome to BigDonalds, the best fast food in the business.");
        System.out.println("Here is the preview of our menu.");

        while(ordering){

            while (intContinueOrder == 2){
                newMenu.getInfo();

                System.out.println("Enter the Menu Number of your desired item.");
                int currentOrder = scanner.nextInt();

                if (currentOrder < 11){
                    newMenu.getFood(currentOrder).setInfo();
                    newOrder.addFoodToOrder(newMenu.getFood(currentOrder));
                    numFoods += 1;
                }
                if (currentOrder > 10){
                    newMenu.getDrink(currentOrder).setInfo();
                    newOrder.addDrinkToOrder(newMenu.getDrink(currentOrder));
                    numDrinks += 1;
                }

                newOrder.showOrder(numFoods, numDrinks);

                System.out.println("Enter 0 to complete your order. Enter 1 to remove items from your order. Enter 2 or any other number to continue ordering: ");
                intContinueOrder = scanner.nextInt();
            }
            
            while (intContinueOrder == 0 && (numFoods > 0 || numDrinks > 0)){
                System.out.println();
                newOrder.checkOut();
                ordering = false;
                break;
            }
            while (intContinueOrder == 0 && numFoods == 0 && numDrinks == 0){
                System.out.println("You have no items in your cart. Are you sure you want to checkout.");
                String nullCheckout = scanner.nextLine();
                if (nullCheckout.equalsIgnoreCase("yes")){
                    System.out.println("Thank you for considering shopping at BigDonalds");
                    ordering = false;
                    break;
                }
            }
            while (intContinueOrder == 1){
                System.out.println("Do you want to remove a food or drink?");
                scanner.nextLine();
                String remove = scanner.nextLine();

                newOrder.showOrder(numFoods, numDrinks);

                if(remove.equalsIgnoreCase("food")){
                    System.out.println("Enter the number of food item you want to remove?");
                    int removeNumFood = Integer.parseInt(scanner.nextLine());
                    newOrder.removeFoodFromOrder(removeNumFood-1);
                    numFoods -= 1;
                    
                }
                if(remove.equalsIgnoreCase("drink")){
                    System.out.println("Enter the number of drink item you want to remove?");
                    int removeNumDrink = Integer.parseInt(scanner.nextLine());
                    newOrder.removeDrinkFromOrder(removeNumDrink-1);
                    numDrinks -= 1;
                }

                newOrder.showOrder(numFoods, numDrinks);

                if (numFoods == 0 && numDrinks == 0){
                    System.out.println("Enter 0 to stop ordering. Enter 2 to continue Ordering");
                    intContinueOrder = Integer.parseInt(scanner.nextLine());
                }
                if (numFoods > 0 || numDrinks > 0){
                    System.out.println("Enter 0 to complete your order. Enter 1 to continue removing items from your order. Enter 2 or any other number to continue ordering");
                    intContinueOrder = Integer.parseInt(scanner.nextLine());
                
                }
            }
        }
    }
}
