package Uber;
import java.util.*;

public class BurgersAndWraps extends Food {
    private boolean isWrap;
    private boolean isBurger;
    private String meat;
    private int numPatties;
    private boolean isCombo;
    
    
    public BurgersAndWraps(String strNewFood, double newCost, int newCalories, int newMenuNumber, boolean newWrap, boolean newBurger, String newMeat, int newNumPatties,
    boolean newIsCombo){

        super(strNewFood, newCost, newCalories, newMenuNumber);
        isWrap = newWrap;
        isBurger = newBurger;
        meat = newMeat;
        numPatties = newNumPatties;
        isCombo = newIsCombo;
    }

    public void setInfo(int newNumPatties, String typeMeat, boolean newIsCombo){
        numPatties = newNumPatties;
        meat = typeMeat;
        if (isBurger){
            this.setCalories(300 + newNumPatties * 150);
        }
        if (isCombo){
            this.setCost(this.getCost() + 2.5);
        }
    }

    public String getInfo(){
        if (isWrap){
            return meat + "wrap has" + this.getCalories() + " calories.";
        }
        if (isBurger){
            return meat + "burger with " + numPatties + " patties has" + this.getCalories() + " calories.";
        }
        return "cool";
    }
}
