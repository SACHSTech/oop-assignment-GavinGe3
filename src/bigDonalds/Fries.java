package bigDonalds;
import java.util.*;

/**
 * Fries class file - extends abstract Food class
 * @author G. Ge
 * 
 */

public class Fries extends Food {
    // Instance variables
    private String strSize;
    private int intSaltContent;

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
        this.strSize = strNewSize;
        this.intSaltContent = intNewSalt;
    }

    /**
     * Allows the user to set options of the fries
     */
    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        // Allow user to enter size of fries
        System.out.println("Enter the this.strSize of your fries (small, medium, or large): ");
        String strNewSize = scanner.nextLine();
        this.strSize = strNewSize;

        // Change attributes of fries based on user choice
        if (this.strSize == "small"){
            this.setCalories(150);
            this.intSaltContent = 10;
            setCost(1.99);
        }
        if (this.strSize == "medium"){
            this.setCalories(300);
            this.intSaltContent = 20;
            setCost(2.49);

        }
        if (this.strSize == "large"){
            this.setCalories(450);
            this.intSaltContent = 30;
            setCost(2.99);
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
        System.out.println("Salt (g): " + this.intSaltContent);
        System.out.println("Size (g): " + this.strSize);
    }
}
