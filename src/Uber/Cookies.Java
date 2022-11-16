package Uber;

public class Cookies extends Food{
    int number;
    int sugarContent;
    boolean hasNuts;

    public Cookies(String newFood, double newCost, int newCalories, int newMenuNumber, int newNumber, int newSugar, boolean newHasNuts){
        super(newFood, newCost, newCalories, newMenuNumber);
        number = newNumber;
        sugarContent = newSugar;
        hasNuts = newHasNuts;
    }
    public void setNumber(int setNumber){
        number = setNumber;
    }
}
