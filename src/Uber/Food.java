package Uber;

public abstract class Food {
    private String strItemName;
    private int intCost;
    private int intCalories;
    private int menuNumber;

    public Food(String newName, int newCost, int newCalories, int newMenuNumber){
        strItemName = newName;
        intCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }

    public abstract String getInfo();

    public int getCost(){
        return intCost;
    }
}

