package Uber;
import java.util.*;

public class Fries extends Food {
    String size;
    int saltContent;
    boolean isPoutine;

    public Fries(String newFood, double newCost, int newCalories, int newMenuNumber, String newSize, int newSalt, boolean newIsPoutine){
        super(newFood, newCost, newCalories, newMenuNumber);
        size = newSize;
        saltContent = newSalt;
        isPoutine = newIsPoutine;
    }

    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of your fries (small, medium, or large): ");
        String newSize = scanner.nextLine();

        size = newSize;
        if (size == "small"){
            this.setCalories(150);
            saltContent = 10;
        }
        if (size == "medium"){
            this.setCalories(300);
            saltContent = 20;

        }
        if (size == "large"){
            this.setCalories(450);
            saltContent = 30;
        }
    }
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: " + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + saltContent);
        System.out.println("Size (g): " + size);
    }
}
