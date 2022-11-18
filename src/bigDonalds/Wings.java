package bigDonalds;
import java.util.*;

public class Wings extends Food {
    private int intSaltContent;
    private int intNumber;
    private boolean boolBreaded;

    public Wings(String newFood, double newCost, int newCalories, int newMenuintNumber, int newSalt, int newintNumber, boolean newboolBreaded){
        super(newFood, newCost, newCalories, newMenuintNumber);
        intSaltContent = newSalt;
        intNumber = newintNumber;
        boolBreaded = newboolBreaded;
    }

    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many wings do you want:");
        int setintNumber = Integer.parseInt(scanner.nextLine());
        intNumber = setintNumber;
        setCalories(intNumber * 75);
        intSaltContent = intNumber * intSaltContent;

        System.out.println("Do you want breaded wings? (yes or no): ");
        String isboolBreaded = scanner.nextLine();

        if (isboolBreaded.equalsIgnoreCase("yes")){
            boolBreaded = true;
            setCalories(intNumber * 100);

        }
        if (isboolBreaded.equalsIgnoreCase("no")){
            setCalories(intNumber * 100);
        }

        this.setCost(intNumber*this.getCost());
    }

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Cost: $" + getCost());
        System.out.println("Calories: " + getCalories()); 
        System.out.println("Salt (g): " + intSaltContent);
        System.out.println("Amount: " + intNumber);
        System.out.println("boolBreaded: " + boolBreaded);
    }
}

