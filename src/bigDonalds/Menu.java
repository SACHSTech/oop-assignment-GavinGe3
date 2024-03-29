package bigDonalds;
import java.util.*;

/**
 * Menu Class File 
 * @author: G. Ge
 * 
 */

public class Menu{

    // Instance variables
    
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();

    // All food items on menu
    
    private Fries blank = new Fries("Fries", 2.49, 350, 0 , "medium", 100);

    // Define wraps and burgers objs
    private BurgersAndWraps burger = new BurgersAndWraps("BigDonalds Burger", 0.00, 450, 1, false, true, "beef", 1, false,"");
    private BurgersAndWraps wrap = new BurgersAndWraps("BigDoanlds Wrap", 7.99, 500, 
    2, true, false, "chicken", 0, false,"");

    // Define fries obj
    private Fries fries = new Fries("Fries", 1.99, 200, 3 , "small", 50);

    // Define wings objs
    private Wings buffaloWings = new Wings("Bufallo Wings", 0.75, 75, 4, 7, 0, false);
    private Wings honeyGarlicWings = new Wings("Honey Garlic Wings", 0.75, 75, 5, 7, 0, false);

    // Define cookies objs
    private Cookies chocolateChip = new Cookies("Chocolate Chip Cookies", 1.00, 150, 6, 0, 15);
    private Cookies oatmeal = new Cookies("Oatmeal Cookies", 1.00, 125, 7, 0, 5);   

    // Define icecream Objs
    private Icecream chocIcecream = new Icecream("Chocolate Icecream", 2.00, 300, 8, false, 50);
    private Icecream vanillaIcecream = new Icecream("Vanilla Icecream", 2.00, 325, 9, false, 50);
    private Icecream GTIcecream = new Icecream("Green Tea Icecream", 2.00, 250, 10, false, 30);

    // Define Drink objs
    private Coffee expresso = new Coffee("Expresso", "", 0.00, 100, 11, 30, 0);
    private Coffee cappucino = new Coffee("Cappucino", "", 0.00, 200, 12, 15,40);
    private Coffee latte = new Coffee("Latte", "", 0.00, 175, 13, 15, 50 );
    private Soda soda = new Soda("Soda", "small", 1.99, 120, 14, 15);
    

    /**
     * Constructor for menu
     */
    public Menu(){
        // Add Foods to foods arraylist
        this.listOfFoods.add(this.blank);
        this.listOfFoods.add(this.burger);
        this.listOfFoods.add(this.wrap);
        this.listOfFoods.add(this.fries);
        this.listOfFoods.add(this.buffaloWings);
        this.listOfFoods.add(this.honeyGarlicWings);
        this.listOfFoods.add(this.chocolateChip);
        this.listOfFoods.add(this.oatmeal);
        this.listOfFoods.add(this.chocIcecream);
        this.listOfFoods.add(this.vanillaIcecream);
        this.listOfFoods.add(this.GTIcecream);

        // Add Drinks to drinks arraylist
        this.listOfDrinks.add(this.expresso);
        this.listOfDrinks.add(this.cappucino);
        this.listOfDrinks.add(this.latte);
        this.listOfDrinks.add(this.soda);

    }

    /**
     * Method to display the menu onto the screen
     * 
     */
    public void getInfo(){
        System.out.println("---Foods---");
        for (int i = 1; i < this.listOfFoods.size(); i++){
            System.out.println(this.listOfFoods.get(i));
        }
        System.out.println("---Drinks---");
        for (int i = 0; i < this.listOfDrinks.size(); i++){
            System.out.println(this.listOfDrinks.get(i));
        }
    }

    /**
     * Method to get a food item from the menu
     * 
     * @param i the desired item number 
     * @return the desired food item
     */
    public Food getFood(int i){
        return this.listOfFoods.get(i);
    }

    /**
     * Method to get a drink item from the menu
     * 
     * @param i the desired item number 
     * @return the desired drink item
     */
    public Drink getDrink(int i){
        return this.listOfDrinks.get((i - 11));
    }
}
