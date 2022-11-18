package bigDonalds;
import java.util.*;

public class Cookies extends Food{
    int intNumber;
    int intSugarContent;

    public Cookies(String newFood, double newCost, int newCalories, int newMenuintNumber, int newintNumber, int newSugar){
        super(newFood, newCost, newCalories, newMenuintNumber);
        intNumber = newintNumber;
        intSugarContent = newSugar;
    }
    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of cookies you want: ");
        int setintNumber = scanner.nextInt();
        intNumber = setintNumber;
        intSugarContent = intNumber * intSugarContent;
        setCost(getCost() * intNumber);
        setCalories(intNumber * getCalories());
    }

   
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Sugar (g): " + intSugarContent);
        System.out.println("Amount: " + intNumber);
    }
}
