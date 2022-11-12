package Uber;

public abstract class Drink {
    private String strItemName;
    private String strSize;
    private int intCost;
    private int intCalories;
    private int menuNumber;
    
    public Drink(String newName, String newSize, int newCost, int newCalories, int newMenuNumber){
        strItemName = newName;
        strSize = newSize;
        intCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }
    
}
