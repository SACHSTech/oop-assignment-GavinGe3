package bigDonalds;
import java.io.IOException;
import java.util.*;
/**
 * Soda Class File, which extends drink
 * @author: G. Ge
 */

public class Soda extends Drink{

    private int intSugar;

    /**
     * Constructor method for soda
     * 
     * @param strNewName - name of soda
     * @param strNewSize - size of soda
     * @param intNewCost - cost of soda
     * @param intNewCalories - calories of soda
     * @param intNewMenuNumber - The number of this food on the menu, used to identify the food
     * @param intNewSugar - grams of sugar the soda has
     */
    
    public Soda(String strNewName, String strNewSize, double intNewCost, int intNewCalories, int intNewMenuNumber, int intNewSugar){
        super(strNewName, strNewSize, intNewCost, intNewCalories, intNewMenuNumber);
        this.intSugar = intNewSugar;
    }   

    /**
     * Displays info about the soda obj to the user
     * 
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Size: " + getSize());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Sugar (g): " + this.intSugar);
    }

    /**
     * Allows user to set info of soda obj
     * 
     */
    public void setInfo() { 
        Scanner scanner = new Scanner(System.in);

        // Prompts user for type of soda
        System.out.println("What brand of soda do you want? ");
        String newSoda = scanner.nextLine();
        setName(newSoda);

        // Prompts user for size of soda
        System.out.println("What size of drink you want? (medium or large)");
        String strNewSize = scanner.nextLine();

        // Changes soda attributes based on user selectins
        if (strNewSize.equalsIgnoreCase("medium")){
            setSize(strNewSize);
            setCost(1.99);
        }
        if (strNewSize.equalsIgnoreCase("large")){
            setSize(strNewSize);
            setCost(2.50);
            this.intSugar *= 1.5;
        }
    }
}
