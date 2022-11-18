package bigDonalds;
import java.util.*;

public class Fries extends Food {
    String strSize;
    int intSaltContent;

    public Fries(String newFood, double newCost, int newCalories, int newMenuNumber, String newstrSize, int newSalt){
        super(newFood, newCost, newCalories, newMenuNumber);
        strSize = newstrSize;
        intSaltContent = newSalt;
    }

    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the strSize of your fries (small, medium, or large): ");
        String newstrSize = scanner.nextLine();

        strSize = newstrSize;
        if (strSize == "small"){
            this.setCalories(150);
            intSaltContent = 10;
        }
        if (strSize == "medium"){
            this.setCalories(300);
            intSaltContent = 20;

        }
        if (strSize == "large"){
            this.setCalories(450);
            intSaltContent = 30;
        }
    }
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + intSaltContent);
        System.out.println("strSize (g): " + strSize);
    }
}
