package Uber;

public class Coffee extends Drink{
    String flavor;
    int mgCaffeine;
    int percentMilk;

    public Coffee(String newName, String newSize, int newCost, int newCalories, int newMenuNumber, int newCaffeine, String newFlavor, int mgCaffeine, int newMilk){
        super(newName, newSize, newCost, newCalories, newMenuNumber);
        flavor = newFlavor;
        mgCaffeine = newCaffeine;
        percentMilk = newMilk;
    }

    
}
