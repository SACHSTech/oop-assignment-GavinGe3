package Uber;
import java.util.*;

public class BurgersAndWraps extends Food {
    private boolean isWrap;
    private boolean isBurger;
    private String meat;
    private int numPatties;
    private boolean extraMeat;
    
    
    public BurgersAndWraps(String strNewFood, double newCost, int newCalories, int newMenuNumber, boolean newWrap, boolean newBurger, String newMeat, int newNumPatties, 
    boolean newExtraMeat){

        super(strNewFood, newCost, newCalories, newMenuNumber);
        isWrap = newWrap;
        isBurger = newBurger;
        meat = newMeat;
        numPatties = newNumPatties;
        extraMeat = newExtraMeat;
    }

    public void setInfo(int newNumPatties, String typeMeat){
        numPatties = newNumPatties;
        meat = typeMeat;
        this.setCalories(300 + newNumPatties * 150);
    }

    public String getInfo(){
        if (isWrap){
            return meat + "wrap: " + 
        }
        
    }
}
