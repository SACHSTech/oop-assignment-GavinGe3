package bigDonalds;
import java.util.*;

public class Icecream extends Food{

    boolean withCone;
    int intSugarContent;

    public Icecream(String newFood, double newCost, int newCalories, int newMenuNumber, boolean newWithCone, int newSugar, String newFlavor){
        super(newFood, newCost, newCalories, newMenuNumber);
        withCone = newWithCone;
        intSugarContent = newSugar;
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a cone? (yes or no): ");

        String newWithCone = scanner.nextLine();

        if (newWithCone == "yes"){
            withCone = true;
            setCalories(getCalories() + 50);
        }
        if (newWithCone == "no"){
            withCone = false;
            setCalories(getCalories() + 50);

        }

        this.setCalories(this.getCalories()+50);
    }
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Sugar (g): " + intSugarContent);
        System.out.println("With Cone?: " + withCone);
    }
}
    

