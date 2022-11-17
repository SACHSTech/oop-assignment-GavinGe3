package Uber;
import java.util.*;

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
    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of cookies you want: ");
        int setNumber = scanner.nextInt();
        number = setNumber;

        setCost(getCost() * number);
        setCalories(number * getCalories());
    }

   
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: " + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + sugarContent);
        System.out.println("Amount: " + number);
    }
}
