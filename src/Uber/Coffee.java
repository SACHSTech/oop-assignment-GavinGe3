package Uber;

public class Coffee extends Drink{
    String flavor;
    int mgCaffeine;
    int percentMilk;

    public Coffee(String newName, String newSize, double newCost, int newCalories, int newMenuNumber, int newCaffeine, int newMilk){
        super(newName, newSize, newCost, newCalories, newMenuNumber);
        mgCaffeine = newCaffeine;
        percentMilk = newMilk;
    }

    
}
