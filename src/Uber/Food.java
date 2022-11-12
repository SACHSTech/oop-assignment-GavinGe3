package Uber;

public class Food {
    private String strItemName;
    private double intCost;
    private int intCalories;
    private int menuNumber;

    public Food(String newFood, double newCost, int newCalories, int newMenuNumber){
        strItemName = newFood;
        intCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }

    public double getCost(){
        return intCost;
    }
}

