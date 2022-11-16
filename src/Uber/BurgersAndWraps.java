package Uber;
import java.util.*;

public class BurgersAndWraps extends Food {
    boolean isWrap;
    boolean isBurger;
    String meat;
    int numPatties;
    boolean extraMeat;
    ArrayList<String> toppings;
    
    public BurgersAndWraps(String newFood, double newCost, int newCalories, int newMenuNumber, boolean newWrap, boolean newBurger, String newMeat, int newNumPatties, 
    boolean newExtraMeat, ArrayList<String> newToppings){

        super(newFood, newCost, newCalories, newMenuNumber);
        isWrap = newWrap;
        isBurger = newBurger;
        meat = newMeat;
        numPatties = newNumPatties;
        extraMeat = newExtraMeat;
        toppings = newToppings;
    }
}
