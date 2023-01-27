package bigDonalds;
import java.util.*;

/**
 * This class is a subclass of Food that stores Burgers and Wraps
 * @author G. Ge
 */

public class BurgersAndWraps extends Food {

    // Initialize variables
    private boolean boolIsWrap;
    private boolean boolIsBurger;
    private String strMeat;
    private int intNumPatties;
    private boolean boolIsCombo;
    private String strExtras;
    
    
    /**
     * Constructor to create a Burger or Wrap
     * @param strNewFood - Name of this Burger or Wrap
     * @param dblNewCost - Cost of this Burger or Wrap
     * @param intNewcalories - Calories of this food
     * @param intNewMenuNumber - The number of this food on the menu, used to identify the food
     * @param boolNewWrap - Is this food item a wrap
     * @param boolNewBurger - Is this food item a burger
     * @param strNewMeat - The type of meat of this Burger or wrap
     * @param intNewNumPatties - Number of patties in this burger
     * @param boolNewIsCombo - If this is a combo item
     * @param strNewExtras - The extra foods that this object contains if combo
     */

    public BurgersAndWraps(String strNewFood, double dblNewCost, int intNewcalories, int intNewMenuNumber, boolean boolNewWrap, boolean boolNewBurger, String strNewMeat, int intNewNumPatties,
    boolean boolNewIsCombo, String strNewExtras){

        super(strNewFood, dblNewCost, intNewcalories, intNewMenuNumber);
        this.boolIsWrap = boolNewWrap;
        this.boolIsBurger = boolNewBurger;
        this.strMeat = strNewMeat;
        this.intNumPatties = intNewNumPatties;
        this.boolIsCombo = boolNewIsCombo;
        this.strExtras = strNewExtras;
        Fries newFries = new Fries("Fries", 1.99, 200, 3 , "small", 50);
        Soda newSoda = new Soda("Soda", "small", 1.99, 120, 14, 15);
    
    }

    /**
     * Allows the user to set options about the Burger or Wrap they are ordering
     */
    public void setInfo(){
        // Initialize scanner obj
        Scanner scanner = new Scanner(System.in);
        
        // If object is burger
        if (this.boolIsBurger){

            // Allow user to customize type of meat
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String strNewMeat = scanner.nextLine();
            this.strMeat = strNewMeat;

            // Allow user to enter num of patties and set cost/calories depending on this
            System.out.println("Enter the number of patties you want: ");
            int newPatties = Integer.parseInt(scanner.nextLine());
            this.intNumPatties = newPatties;
            setCost(4 + (this.intNumPatties * 1.49));
            this.setCalories(300 + this.intNumPatties * 150);
        }

        // if object is wrap
        if (this.boolIsWrap){

            // Allow user to customize type of meat
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String strNewMeat = scanner.nextLine();
            this.strMeat = strNewMeat;
        }

        // Allow user to enter if they want a combo 
        System.out.println("Do you want this to be a combo? (yes or no) (Includes medium fries and soda): ");
        String boolNewIsCombo = scanner.nextLine();

        if (boolNewIsCombo.equalsIgnoreCase("yes")){
            this.boolIsCombo = true;
        }
        if (boolNewIsCombo.equalsIgnoreCase("no")){
            this.boolIsCombo = false;
        }
        
        // If user wants a combo add to the cost, and allow them to choose a choice of soda. 
        if (this.boolIsCombo){
            this.setCost(this.getCost() + 2.5);
            System.out.println("Enter brand of Soda: ");
            this.strExtras = scanner.nextLine();
            setCalories(300 + this.intNumPatties * 150 + 420);
        }
    }

    /**
     * Displays information about this object to the screen such as name, calories, etc. 
     * 
     */
    public void showInfo(){

        // If food item is a wrap
        if (this.boolIsWrap){
            
            // Display info about the food
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("Meat: " + this.strMeat);
            System.out.println("Cost: $" + getCost());
            if (this.boolIsCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + this.strExtras + " and medium fries.");
            }
            else{
                System.out.println("Combo: no");
            }
        }

        // if food item is a burger
        if (this.boolIsBurger){
            
            // Display info about the food
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("Meat: " + this.strMeat);
            System.out.println("Patties: " + this.intNumPatties);
            System.out.println("Cost: $" + getCost());
            if (this.boolIsCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + this.strExtras + " and medium fries.");
            }
            else {
                System.out.println("Combo: no");
            }
        }
    }
}
