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
     * @param newthis.intMenuNumber - The number of this drink on the menu, used to identify the drink
     */
    public Drink(String newName, String newSize, double newCost, int newCalories, int newintMenuNumber){
        this.strItemName = newName;
        this.strSize = newSize;
        this.dblCost = newCost;
        this.intCalories = newCalories;
        this.intMenuNumber = newintMenuNumber;
    }

    /**
     * Returns the cost of the drink
     * 
     * @return - Cost of drink
     */

    public double getCost(){
        return this.dblCost;
    }
    /**
     * Returns the name of the drink
     * 
     * @return - name of the drink
     */

    public String getName(){
        return this.strItemName;
    }

    /**
     * sets the name of the drink
     * 
     * @param newName - new name of drink
     */

    public void setName(String newName){
        this.strItemName = newName;
    }

    /**
     * Return size of drink
     * 
     * @return - size of drink
     */
    public String getSize(){
        return this.strSize;
    }
    
    /**
     * set size of drink
     * 
     * @param newSize - new size of drink
     */
    public void setSize(String newSize){
        this.strSize = newSize;
    }

    /**
     * set cost of drink
     * 
     * @param cost - new cost of drink
     */
    public void setCost(double cost){
        this.dblCost = cost;
    }
    
    /**
     * set calories of drink
     * 
     * @param newCalories new calories of drink
     */
    public void setCalories(double newCalories){
        this.intCalories = (int)newCalories;
    }

    /**
     * return calories of drink
     * 
     * @return this.intCalories - callories of the drink
     */
    public int getCalories(){
        return this.intCalories;
    }

    /**
     * to string method
     * 
     * @return this.intMenuNumber, this.strItemName - the item number and string 
     */
    public String toString(){
        return this.intMenuNumber + " - " + this.strItemName;
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
