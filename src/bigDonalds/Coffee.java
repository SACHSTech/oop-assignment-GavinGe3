package bigDonalds;
import java.util.*;

public class Coffee extends Drink{
    private int intMgCaffeine;
    private int intPercentMilk;

    public Coffee(String newName, String newSize, double newCost, int newCalories, int newMenuNumber, int newCaffeine, int newMilk){
        super(newName, newSize, newCost, newCalories, newMenuNumber);
        intMgCaffeine = newCaffeine;
        intPercentMilk = newMilk;
    }

    public void setInfo(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of drink do you want? (small, medium or large): ");

        String newSize = scanner.nextLine();
        if (newSize.equalsIgnoreCase("small")){
            setSize(newSize);
            setCost(1.99);
            intMgCaffeine = 20;
        }
        if (newSize.equalsIgnoreCase("medium")){
            setSize(newSize);
            setCost(2.49);
            setCalories(getCalories() * 1.5);
            intMgCaffeine *= 1.5;
        }
        if (newSize.equalsIgnoreCase("medium")){
            setSize(newSize);
            setCost(3.49);
            setCalories(getCalories() * 2);
            intMgCaffeine *= 2;
        }
    }
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Caffeine (mg): " + intMgCaffeine);
        System.out.println("Milk%: " + intPercentMilk);
        System.out.println("Size: " + getSize());
    }
    
}
