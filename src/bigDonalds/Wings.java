package bigDonalds;
import java.util.*;

/**
 * Wings Class File, which extends drink
 * @author: G. Ge
 */

public class Wings extends Food {
    // instance variables
    private int intSaltContent;
    private int intNumber;
    private boolean boolBreaded;
    /**
     * Constructor method for wings
     * 
     * @param strNewFood - name of wing(s)
     * @param dblNewCost - cost of wing(s)
     * @param intNewCalories - calories of wing(s)
     * @param intNewMenuNumber - The number of this food on the menu, used to identify the food
     * @param intNewSalt - salt of wing(s) in grams
     * @param intNewNumber - number of wing(s)
     * @param boolNewBreaded - if wings are breaded
     */

    public Wings(String strNewFood, double dblNewCost, int intNewCalories, int intNewMenuNumber, int intNewSalt, int intNewNumber, boolean boolNewBreaded){
        super(strNewFood, dblNewCost, intNewCalories, intNewMenuNumber);
        this.intSaltContent = intNewSalt;
        this.intNumber = intNewNumber;
        this.boolBreaded = boolNewBreaded;
    }

    /**
     * Allows user to customize their wings
     * 
     */
    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        // Prompts user for num of wings
        System.out.println("How many wings do you want:");
        int setintNumber = Integer.parseInt(scanner.nextLine());
        this.intNumber = setintNumber;

        // Changes wings salt content attributes based on num
        this.intSaltContent = this.intNumber * this.intSaltContent;

        // prompts user if they want breaded wings
        System.out.println("Do you want breaded wings? (yes or no): ");
        String isboolBreaded = scanner.nextLine();

        // Changes calories of wings based on if breaded
        if (isboolBreaded.equalsIgnoreCase("yes")){
            this.boolBreaded = true;
            setCalories(this.intNumber * 100);
        }
        if (isboolBreaded.equalsIgnoreCase("no")){
            setCalories(this.intNumber * 75);
        }
        
        // Changes cost of wings based on amount
        this.setCost(this.intNumber * this.getCost());
    }

    /**
     * Displays to customer the info of their wings
     * 
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + this.intSaltContent);
        System.out.println("Amount: " + this.intNumber);
        System.out.println("Breaded: " + this.boolBreaded);
    }
}

