package Uber;
import java.util.*;

public class Coffee extends Drink{
    private int mgCaffeine;
    private int percentMilk;

    public Coffee(String newName, String newSize, double newCost, int newCalories, int newMenuNumber, int newCaffeine, int newMilk){
        super(newName, newSize, newCost, newCalories, newMenuNumber);
        mgCaffeine = newCaffeine;
        percentMilk = newMilk;
    }

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: " + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Caffeine (mg): " + mgCaffeine);
        System.out.println("Milk%: " + percentMilk);
        System.out.println("Size: " + getSize());
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of drink you want? (small, medium or large)");
        String newSize = scanner.nextLine();
        if (newSize == "small"){
            setSize(newSize);
            setCost(1.99);
        }
        if (newSize == "medium"){
            setSize(newSize);
            setCost(2.49);
            mgCaffeine *= 1.5;
        }
        if (newSize == "large"){
            setSize(newSize);
            setCost(3.49);
            mgCaffeine *= 2;

        }
    }
    
}
