package Uber;

public class Drink {
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
    
}
