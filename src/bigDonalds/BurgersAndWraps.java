package bigDonalds;
import java.util.*;


public class BurgersAndWraps extends Food {
    private boolean boolIsWrap;
    private boolean boolIsBurger;
    private String strMeat;
    private int intNumPatties;
    private boolean boolIsCombo;
    private String strExtras;
    
    
    public BurgersAndWraps(String strNewFood, double newCost, int newCalories, int newMenuNumber, boolean newWrap, boolean newBurger, String newstrMeat, int newintNumPatties,
    boolean newboolIsCombo, String newstrExtras){

        super(strNewFood, newCost, newCalories, newMenuNumber);
        boolIsWrap = newWrap;
        boolIsBurger = newBurger;
        strMeat = newstrMeat;
        intNumPatties = newintNumPatties;
        boolIsCombo = newboolIsCombo;
        strExtras = newstrExtras;
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        
        if (boolIsBurger){
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String newstrMeat = scanner.nextLine();
            strMeat = newstrMeat;

            System.out.println("Enter the number of patties you want: ");
            int newPatties = Integer.parseInt(scanner.nextLine());
            intNumPatties = newPatties;
            setCost(4 + (intNumPatties * 1.49));
            this.setCalories(300 + intNumPatties * 150);
        }
        if (boolIsWrap){
            System.out.println("Enter the type of meat you want (Chicken or Beef): ");
            String newstrMeat = scanner.nextLine();
            strMeat = newstrMeat;
        }

        System.out.println("Do you want this to be a combo? (yes or no) (Includes medium fries and soda): ");
        String newboolIsCombo = scanner.nextLine();
        if (newboolIsCombo.equalsIgnoreCase("yes")){
            boolIsCombo = true;
        }
        if (newboolIsCombo.equalsIgnoreCase("no")){
            boolIsCombo = false;
        }
        
        if (boolIsCombo){
            this.setCost(this.getCost() + 2.5);
            System.out.println("Enter brand of Soda: ");
            strExtras = scanner.nextLine();
        }
    }

    public void getInfo(){
        if (boolIsWrap){
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("strMeat: " + strMeat);
            System.out.println("Cost: $" + getCost());
            if (boolIsCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + strExtras + " and medium fries.");
            }
            else{
                System.out.println("Combo: no");
            }
            
        }
        if (boolIsBurger){
            System.out.println("Name: " + getName());
            System.out.println("Calories: " + getCalories()); 
            System.out.println("strMeat: " + strMeat);
            System.out.println("Patties: " + intNumPatties);
            System.out.println("Cost: $" + getCost());
            if (boolIsCombo){
                System.out.println("Combo: yes");
                System.out.println("Includes: " + strExtras + " and medium fries.");
            }
            else {
                System.out.println("Combo: no");
            }
        }
    }
}
