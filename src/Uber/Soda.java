package Uber;

public class Soda extends Drink{

    int sugar;
    boolean isCombo;
    
    public Soda(String newName, String newSize, double newCost, int newCalories, int newMenuNumber, int newSugar, boolean isNewCombo){
        super(newName, newSize, newCost, newCalories, newMenuNumber);
        sugar = newSugar;
        isCombo = isNewCombo;
    }   
}
