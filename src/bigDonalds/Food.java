package bigDonalds;

public abstract class Food{
    private String strItemName;
    private double dblCost;
    private int intCalories;
    private int menuNumber;

    public Food(String newFood, double newCost, int newCalories, int newMenuNumber){
        strItemName = newFood;
        dblCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }

    public double getCost(){
        return dblCost;
    }
    public String getName(){
        return strItemName;
    }

    public String toString(){
        return menuNumber + " - " + strItemName;
    }

    public void setCost(double cost){
        dblCost = cost;
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
