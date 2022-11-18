package bigDonalds;
import java.util.*;

/**
 * Icecream class file - extends abstract Food class
 * @author G. Ge
 * 
 */

public class Icecream extends Food{

    boolean withCone;
    int intSugarContent;

    /**
     * Constructor method for Icecream
     * @param newFood - name of icecream
     * @param newCost - cost of icecream
     * @param newCalories - calories of icecream
     * @param newMenuNumber - The number of this food on the menu, used to identify the food
     * @param newWithCone - If icecream has cone
     * @param newSugar - sugar content of icecream (g)
     */

    public Icecream(String newFood, double newCost, int newCalories, int newMenuNumber, boolean newWithCone, int newSugar){
        super(newFood, newCost, newCalories, newMenuNumber);
        withCone = newWithCone;
        intSugarContent = newSugar;
    }

    /**
     * Allows the user to set options of the icecream
     */
    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want a cone? (yes or no): ");
        String newWithCone = scanner.nextLine();

        // Change info of icecream based on user selection
        if (newWithCone == "yes"){
            withCone = true;
            setCalories(getCalories() + 50);
        }
        if (newWithCone == "no"){
            withCone = false;
            setCalories(getCalories() + 50);

        }

        this.setCalories(this.getCalories()+50);
    }

    /**
     * Displays info of icecream to screen
     * 
     */
    public void showInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Sugar (g): " + intSugarContent);
        System.out.println("With Cone?: " + withCone);
    }
}
    

