package Uber;
import java.util.*;

public class Soda extends Drink{

    int sugar;
    
    public Soda(String newName, String newSize, double newCost, int newCalories, int newMenuNumber, int newSugar){
        super(newName, newSize, newCost, newCalories, newMenuNumber);
        sugar = newSugar;
    }   

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: " + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Sugar (g): " + sugar);
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of drink you want? (medium or large)");
        String newSize = scanner.nextLine();
        if (newSize == "medium"){
            setSize(newSize);
            setCost(1.99);
            
        }
        if (newSize == "large"){
            setSize(newSize);
            setCost(2.50);
            sugar *= 1.5;
        }

    }
}
