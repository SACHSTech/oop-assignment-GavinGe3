package Uber;

public abstract class Food{
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
    public String getName(){
        return strItemName;
    }

    public String toString(){
        return menuNumber + " - " + strItemName;
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

    public abstract void getInfo();

    public abstract void setInfo();
}

