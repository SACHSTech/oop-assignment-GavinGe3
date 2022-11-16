package Uber;

public class Icecream extends Food{

    boolean withCone;
    String flavor;
    int sugarContent;

    public Icecream(String newFood, double newCost, int newCalories, int newMenuNumber, boolean newWithCone, int newSugar, String newFlavor){
        super(newFood, newCost, newCalories, newMenuNumber);
        withCone = newWithCone;
        sugarContent = newSugar;
        flavor = newFlavor;
    }
}
    

