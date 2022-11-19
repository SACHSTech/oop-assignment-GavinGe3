package bigDonalds;
import java.util.*;

/**
 * Fries class file - extends abstract Food class
 * @author G. Ge
 * 
 */

public class Fries extends Food {
    // Instance variables
    String strSize;
    int intSaltContent;

    /**
     * Constructor method for food
     * 
     * @param strNewFood - name of food
     * @param intNewCost - cost of fries
     * @param intNewCalories - calories of fries
     * @param intNewMenNumber - The number of this food on the menu, used to identify the food
     * @param strNewSize - size of fries
     * @param intNewSalt - amount of salt in fries (g)
     */

    public Fries(String strNewFood, double intNewCost, int intNewCalories, int intNewMenNumber, String strNewSize, int intNewSalt){
        super(strNewFood, intNewCost, intNewCalories, intNewMenNumber);
        strSize = strNewSize;
        intSaltContent = intNewSalt;
    }

    /**
     * Allows the user to set options of the fries
     */
    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        // Allow user to enter size of fries
        System.out.println("Enter the strSize of your fries (small, medium, or large): ");
        String strNewSize = scanner.nextLine();
        strSize = strNewSize;

        // Change attributes of fries based on user choice
        if (strSize == "small"){
            this.setCalories(150);
            intSaltContent = 10;
        }
        if (strSize == "medium"){
            this.setCalories(300);
            intSaltContent = 20;

        }
        if (strSize == "large"){
            this.setCalories(450);
            intSaltContent = 30;
        }
    }

    /**
     * Displays info of fries to screen
     * 
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + intSaltContent);
        System.out.println("Size (g): " + strSize);
    }
}
