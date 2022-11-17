package Uber;
import java.util.*;


public class BurgersAndWraps extends Food {
    private boolean isWrap;
    private boolean isBurger;
    private String meat;
    private int numPatties;
    private boolean isCombo;
    private String extras;
    
    
    public BurgersAndWraps(String strNewFood, double newCost, int newCalories, int newMenuNumber, boolean newWrap, boolean newBurger, String newMeat, int newNumPatties,
    boolean newIsCombo, String newExtras){

        super(strNewFood, newCost, newCalories, newMenuNumber);
        isWrap = newWrap;
        isBurger = newBurger;
        meat = newMeat;
        numPatties = newNumPatties;
        isCombo = newIsCombo;
        extras = newExtras;
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        
        if (isBurger){
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String newMeat = scanner.nextLine();
            meat = newMeat;

            System.out.println("Enter the number of patties you want: ");
            int newPatties = scanner.nextInt();
            numPatties = newPatties;

            this.setCalories(300 + numPatties * 150);
        }
        if (isWrap){
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String newMeat = scanner.nextLine();
            meat = newMeat;
        }

        System.out.println("Do you want this to be a combo? (true or false) (Includes medium fries and soda): ");
        boolean newIsCombo = scanner.nextBoolean();
        isCombo = newIsCombo;
        
        if (isCombo){
            this.setCost(this.getCost() + 2.5);
            System.out.println("Enter type of Soda: ");
            extras = scanner.nextLine();
        }
    }

    public void getInfo(){
        if (isWrap){
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("Meat: " + meat);
            System.out.println("Cost: " + getCost());
            if (isCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + extras + "fries.");
            }
            else{
                System.out.println("Combo: no");
            }
            
        }
        if (isBurger){
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("Meat: " + meat);
            System.out.println("Patties:" + numPatties);
            System.out.println("Cost: " + getCost());
            if (isCombo){
                System.out.println("Combo: yes");
            }
            else{
                System.out.println("Combo: no");
            }
        }
    }
}
