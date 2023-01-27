package bigDonalds;
import java.util.*;

/**
 * Order Class File 
 * @author: G. Ge
 */

public class Order {
    
    // Instance variables
    private double dblSubtotal;
    private double dblTotal;
    private Customer customer;
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();

    /**
     * Constructor for Order class
     * 
     */
    public Order(){
        this.customer = new Customer();
        
    }

    /**
     * Method to add food item to order
     * 
     * @param newFood a food object
     */
    public void addFoodToOrder(Food newFood){
        listOfFoods.add(newFood);
        this.dblSubtotal += newFood.getCost();
    }

    /**
     * Method to add drink item to order
     * 
     * @param newDrink a drink object
     */
    public void addDrinkToOrder(Drink newDrink){
        listOfDrinks.add(newDrink);
        this.dblSubtotal += newDrink.getCost();
    }

    /**
     * method to remove food item from order
     * 
     * @param i the number of the food item to be removed
     */
    public void removeFoodFromOrder(int i){
        this.dblSubtotal -= listOfFoods.get(i).getCost();
        listOfFoods.remove(i);
    }

    /**
     * method to remove drink item from order
     * 
     * @param i the number of the drink item to be removed
     */
    public void removeDrinkFromOrder(int i){
        this.dblSubtotal -= listOfDrinks.get(i).getCost();
        listOfDrinks.remove(i);
    }
    /**
     * Returns subtotal of the order
     * @return subtotal or order
     */
    public double getCost(){
        return this.dblSubtotal;
    }

    /**
     * Displays an order summary to the user, which includes all food and drinks and their info
     * 
     * @param intFoods num of foods within order
     * @param intDrinks num of drinks within order
     */
    public void showOrder(int intFoods, int intDrinks){
        System.out.println("-----Order Summary-----");
        System.out.println();

        // Displays all foods and their info to the screen
        for (int i = 0; i < intFoods; i++){
            System.out.println("---Food Item " + (i + 1) + "---");
            listOfFoods.get(i).showInfo();
            System.out.println();
        }

        // Displays all drinks and their info to the screen
        for (int i = 0;i < intDrinks; i++){
            System.out.println("---Drink Item " + (i + 1) + "---");
            listOfDrinks.get(i).showInfo();
            System.out.println();
        }

        // Displays the subtotal and total cost of customers order
        System.out.println("---Cost---");
        System.out.println("Your subtotal is: $" + Math.round(this.dblSubtotal * 100.0) / 100.0);
        this.dblTotal = (this.dblSubtotal + 5) * 1.13;
        System.out.println("Your total with tax and delivery ($5) is: $" + Math.round(this.dblTotal * 100.0) / 100.0);
    }

    /**
     * A method used for the customer to "checkout" their order
     */

    public void checkOut(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Checkout---");

        System.out.println("Enter your personal information to complete your order.");

        // Prompts customer for their user info
        this.customer.setInfo();

        // Displays to the screen the customers order and info
        this.showOrder(listOfFoods.size(), listOfDrinks.size());
        System.out.println();
        this.customer.showInfo();
        System.out.println("Thank you for your order. It will be arriving in approximately 30 minutes.");
    }

}

    

    

