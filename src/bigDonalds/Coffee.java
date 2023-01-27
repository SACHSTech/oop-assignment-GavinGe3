package bigDonalds;
import java.util.*;

/**
 * Subclass of Drink that denotes coffee
 * @author G. Ge
 * 
 */

public class Coffee extends Drink{
    private int intMgCaffeine;
    private int intPercentMilk;

    /**
     * Constructor - creates an instance of coffee class
     * 
     * @param strNewName - name of coffee
     * @param strNewSize - size of coffee
     * @param dblNewCost - cost of coffee
     * @param intNewCalories - calories of the coffee
     * @param intNewMenuNumber - The number of this drink on the menu, used to identify the drink
     * @param intNewCaffeine - mg of caffeine
     * @param intNewMilk - %milk 
     */

    public Coffee(String strNewName, String strNewSize, double dblNewCost, int intNewCalories, int intNewMenuNumber, int intNewCaffeine, int intNewMilk){
        super(strNewName, strNewSize, dblNewCost, intNewCalories, intNewMenuNumber);
        this.intMgCaffeine = intNewCaffeine;
        this.intPercentMilk = intNewMilk;
    }

    /**
     * Allows user to customize their coffee
     * 
     */
    public void setInfo(){

        // Prompts user to set the size of their coffee

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of drink do you want? (small, medium or large): ");
        String strNewSize = scanner.nextLine();

        // If size is small set size to small and adjust coffee variables
        if (strNewSize.equalsIgnoreCase("small")){
            setSize(strNewSize);
            setCost(1.99);
            this.intMgCaffeine = 20;
        }

        // If size is small set size to small and adjust coffee variables
        if (strNewSize.equalsIgnoreCase("medium")){
            setSize(strNewSize);
            setCost(2.49);
            setCalories(getCalories() * 1.5);
            this.intMgCaffeine *= 1.5;
        }

        // If size is small set size to small and adjust coffee variables
        if (strNewSize.equalsIgnoreCase("large")){
            setSize(strNewSize);
            setCost(3.49);
            setCalories(getCalories() * 2);
            this.intMgCaffeine *= 2;
        }
    }

    /**
     * Displays info of the coffee to the screen
     * 
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Caffeine (mg): " + this.intMgCaffeine);
        System.out.println("Milk%: " + this.intPercentMilk);
        System.out.println("Size: " + getSize());
    }
    
}
