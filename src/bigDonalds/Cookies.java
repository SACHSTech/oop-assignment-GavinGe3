package bigDonalds;
import java.util.*;

/**
 * Subclass of Food that denotes Cookies
 * @author G. Ge
 * 
 */

public class Cookies extends Food{
    private int intNumber;
    private int intSugarContent;

    /**
     * Constructor that creates a cookie object
     * 
     * @param strNewFood - name of cookie(s)
     * @param dblNewCost - cost of cookie(s)
     * @param intNewCalories - calories of cookie(s)
     * @param intNewMenuNumber - The number of this food on the menu, used to identify the food
     * @param intNewAmount - number of cookie(s)
     * @param intNewSugar - sugar content of cookie(s) in grams
     */

    public Cookies(String strNewFood, double dblNewCost, int intNewCalories, int intNewMenuNumber, int intNewAmount, int intNewSugar){
        super(strNewFood, dblNewCost, intNewCalories, intNewMenuNumber);
        this.intNumber = intNewAmount;
        this.intSugarContent = intNewSugar;
    }
    /**
     *  Allows user to set the number of cookies they want
     */
    public void setInfo(){
        // initialize scanner obj
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of cookies you want: ");
        int setIntNumber = scanner.nextInt();
        this.intNumber = setIntNumber;

        // Change object info based on # of cookies
        this.intSugarContent = this.intNumber * this.intSugarContent;
        setCost(getCost() * this.intNumber);
        setCalories(this.intNumber * getCalories());
    }

    /**
     * Displays info about cookies object to the screen
     */
    
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Sugar (g): " + this.intSugarContent);
        System.out.println("Amount: " + this.intNumber);
    }
}
