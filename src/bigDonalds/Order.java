package bigDonalds;
import java.util.*;

public class Order {
    private double dblSubtotal;
    private double dblTotal;
    private Customer customer;
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();

    public Order(){
        
    }

    public void addFoodToOrder(Food newFood){
        listOfFoods.add(newFood);
        dblSubtotal += newFood.getCost();
    }

    public void addDrinkToOrder(Drink newDrink){
        listOfDrinks.add(newDrink);
        dblSubtotal += newDrink.getCost();
    }

    public void removeFoodFromOrder(int i){
        dblSubtotal -= listOfFoods.get(i).getCost();
        listOfFoods.remove(i);

    }
    public void removeDrinkFromOrder(int i){
        dblSubtotal -= listOfDrinks.get(i).getCost();
        listOfDrinks.remove(i);
        
    }
    public double getCost(){
        return dblSubtotal;
    }

    public void showOrder(int intFoods, int intDrinks){
        System.out.println("-----Order Summary-----");
        System.out.println();

        for (int i = 0; i < intFoods; i++){
            System.out.println("---Food Item " + (i + 1) + "---");
            listOfFoods.get(i).getInfo();
            System.out.println();
        }
        for (int i = 0;i < intDrinks; i++){
            System.out.println("---Drink Item " + (i + 1) + "---");
            listOfDrinks.get(i).getInfo();
            System.out.println();
        }

        System.out.println("Your subtotal is: $" + Math.round(dblSubtotal * 100.0) / 100.0);
        dblTotal = (dblSubtotal + 5) * 1.13;
        System.out.println("Your total with tax and delivery ($5) is: $" + Math.round(dblTotal * 100.0) / 100.0);
    }

    public void checkOut(){

        Scanner scanner = new Scanner(System.in);

        this.showOrder(listOfFoods.size(), listOfDrinks.size());

        System.out.println("Enter your personal information to complete your order.");

        customer.setInfo();

        System.out.println("Thank you for your order. It will be arriving in approximately 30 minutes.");
    }

}

    

    

