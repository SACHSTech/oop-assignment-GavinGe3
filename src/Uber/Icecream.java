package Uber;

public class Icecream extends food{

    boolean withCone;
    int sugarContent;

    public Icecream(String newFood, double newCost, int newCalories, int newMenuNumber, boolean newWithCone, int newSugar){
        super(newFood, newCost, newCalories, newMenuNumber);
        withCone = newWithCone;
        sugarContent = newSugar;
    }
}
    

