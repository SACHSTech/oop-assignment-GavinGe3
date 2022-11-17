package Uber;
import java.util.*;

public class Wings extends Food {
    private int saltContent;
    private int number;
    private boolean breaded;

    public Wings(String newFood, double newCost, int newCalories, int newMenuNumber, int newSalt, int newNumber, boolean newBreaded){
        super(newFood, newCost, newCalories, newMenuNumber);
        saltContent = newSalt;
        number = newNumber;
        breaded = newBreaded;
    }

    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many wings do you want:");
        int setNumber = scanner.nextInt();
        number = setNumber;

        System.out.println("Do you want breaded wings? (yes or no): ");
        
        String isBreaded = scanner.nextLine();
        if (isBreaded == "yes"){
            breaded = true;
        }
        if (isBreaded == "no"){
            breaded = false;
        }

        this.setCost(number*this.getCost());
    }

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: " + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + saltContent);
        System.out.println("Amount: " + number);
    }
}

