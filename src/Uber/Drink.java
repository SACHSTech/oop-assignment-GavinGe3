package Uber;

public abstract class Drink {
    private String strItemName;
    private String strSize;
    private double intCost;
    private int intCalories;
    private int menuNumber;
    
    public Drink(String newName, String newSize, double newCost, int newCalories, int newMenuNumber){
        strItemName = newName;
        strSize = newSize;
        intCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }

    public double getCost(){
        return intCost;
    }

    public String getName(){
        return strItemName;
    }

    public String getSize(){
        return strSize;
    }
    public void setSize(String newSize){
        strSize = newSize;
    }

    public void setCost(double cost){
        intCost = cost;
    }
    
    public void setCalories(int newCalories){
        intCalories = newCalories;
    }
    public int getCalories(){
        return intCalories;
    }

    public String toString(){
        return menuNumber + " - " + strItemName;
    }

    public abstract void getInfo();

    public abstract void setInfo();

    
    
}
