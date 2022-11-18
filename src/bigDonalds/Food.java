package bigDonalds;

/**
 * Abstract Food class
 * @author G. Ge
 * 
 */

public abstract class Food{

    // Instance variables
    private String strItemName;
    private double dblCost;
    private int intCalories;
    private int menuNumber;

    /**
     * Constructor method for food
     * 
     * @param newFood - name of Food
     * @param newCost - cost of Food
     * @param newCalories - Calories of food
     * @param newMenuNumber - The number of this food on the menu, used to identify the food
     */
    public Food(String newFood, double newCost, int newCalories, int newMenuNumber){

        strItemName = newFood;
        dblCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }

    /**
     * Returns the cost of the food
     * 
     * @return Cost of food
     */
    public double getCost(){
        return dblCost;
    }

    /**
     * Returns the name of the food
     * 
     * @return name of food
     */
    public String getName(){
        return strItemName;
    }
    /**
     * Decides what to print out when printing the class
     * 
     * @return the menu Number and name of the food
     */
    public String toString(){
        return menuNumber + " - " + strItemName;
    }

    /**
     * set cost of food
     * 
     * @param cost - new cost of food
     */

    public void setCost(double cost){
        dblCost = cost;
    }

    /**
     * set calories of food
     * 
     * @param newCalories - new cost of food
     */
    public void setCalories(int newCalories){
        intCalories = newCalories;
    }

    /**
     * Returns the calories of the food
     * 
     * @return calories of food
     */
    public int getCalories(){
        return intCalories;
    }
    
    /**
     * Abstract method to show Info about class
     * 
     */
    public abstract void showInfo();

    /**
     * Abstract method to set info of class
     * 
     */
    public abstract void setInfo();
}

