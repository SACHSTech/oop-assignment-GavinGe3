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
        boolIsWrap = boolNewWrap;
        boolIsBurger = boolNewBurger;
        strMeat = strNewMeat;
        intNumPatties = intNewNumPatties;
        boolIsCombo = boolNewIsCombo;
        strExtras = strNewExtras;
    }

    /**
     * Allows the user to set options about the Burger or Wrap they are ordering
     */
    public void setInfo(){
        // Initialize scanner obj
        Scanner scanner = new Scanner(System.in);
        
        // If object is burger
        if (boolIsBurger){

            // Allow user to customize type of meat
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String strNewMeat = scanner.nextLine();
            strMeat = strNewMeat;

            // Allow user to enter num of patties and set cost/calories depending on this
            System.out.println("Enter the number of patties you want: ");
            int newPatties = Integer.parseInt(scanner.nextLine());
            intNumPatties = newPatties;
            setCost(4 + (intNumPatties * 1.49));
            this.setCalories(300 + intNumPatties * 150);
        }

        // if object is wrap
        if (boolIsWrap){

            // Allow user to customize type of meat
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String strNewMeat = scanner.nextLine();
            strMeat = strNewMeat;
        }

        // Allow user to enter if they want a combo 
        System.out.println("Do you want this to be a combo? (yes or no) (Includes medium fries and soda): ");
        String boolNewIsCombo = scanner.nextLine();

        if (boolNewIsCombo.equalsIgnoreCase("yes")){
            boolIsCombo = true;
        }
        if (boolNewIsCombo.equalsIgnoreCase("no")){
            boolIsCombo = false;
        }
        
        // If user wants a combo add to the cost, and allow them to choose a choice of soda. 
        if (boolIsCombo){
            this.setCost(this.getCost() + 2.5);
            System.out.println("Enter brand of Soda: ");
            strExtras = scanner.nextLine();
        }
    }

    /**
     * Displays information about this object to the screen such as name, calories, etc. 
     * 
     */
    public void showInfo(){

        // If food item is a wrap
        if (boolIsWrap){
            
            // Display info about the food
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("strMeat: " + strMeat);
            System.out.println("Cost: $" + getCost());
            if (boolIsCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + strExtras + " and medium fries.");
            }
            else{
                System.out.println("Combo: no");
            }
        }

        // if food item is a burger
        if (boolIsBurger){
            
            // Display info about the food
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("strMeat: " + strMeat);
            System.out.println("Patties: " + intNumPatties);
            System.out.println("Cost: $" + getCost());
            if (boolIsCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + strExtras + " and medium fries.");
            }
            else {
                System.out.println("Combo: no");
            }
        }
    }
}
