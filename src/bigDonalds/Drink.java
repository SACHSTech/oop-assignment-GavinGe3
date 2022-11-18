package bigDonalds;

/**
 * Abstract drink class
 * @author G. Ge
 * 
 */

public abstract class Drink {
    private String strItemName;
    private String strSize;
    private double dblCost;
    private int intCalories;
    private int intMenuNumber;
    
    /**
     * Constructor - creates instance of drink class
     * 
     * @param newName - name of drink
     * @param newSize - size of drink
     * @param newCost - cost of drink
     * @param newCalories - calories of drink
     * @param newintMenuNumber - The number of this drink on the menu, used to identify the drink
     */
    public Drink(String newName, String newSize, double newCost, int newCalories, int newintMenuNumber){
        strItemName = newName;
        strSize = newSize;
        dblCost = newCost;
        intCalories = newCalories;
        intMenuNumber = newintMenuNumber;
    }

    /**
     * Returns the cost of the drink
     * 
     * @return - Cost of drink
     */

    public double getCost(){
        return dblCost;
    }
    /**
     * Returns the name of the drink
     * 
     * @return - name of the drink
     */

    public String getName(){
        return strItemName;
    }

    /**
     * sets the name of the drink
     * 
     * @param newName - new name of drink
     */

    public void setName(String newName){
        strItemName = newName;
    }

    /**
     * Return size of drink
     * 
     * @return - size of drink
     */
    public String getSize(){
        return strSize;
    }
    
    /**
     * set size of drink
     * 
     * @param newSize - new size of drink
     */
    public void setSize(String newSize){
        strSize = newSize;
    }

    /**
     * set cost of drink
     * 
     * @param cost - new cost of drink
     */
    public void setCost(double cost){
        dblCost = cost;
    }
    
    /**
     * set calories of drink
     * 
     * @param newCalories new calories of drink
     */
    public void setCalories(double newCalories){
        intCalories = (int)newCalories;
    }

    /**
     * return calories of drink
     * 
     * @return intCalories - callories of the drink
     */
    public int getCalories(){
        return intCalories;
    }

    /**
     * to string method
     * 
     * @return intMenuNumber, strItemName - the item number and string 
     */
    public String toString(){
        return intMenuNumber + " - " + strItemName;
    }

    /**
     * Abstract method to set info of class
     * 
     */
    public abstract void setInfo();

    /**
     * Abstract method to show Info about class
     * 
     */
    public abstract void showInfo();
 
    
    
}
