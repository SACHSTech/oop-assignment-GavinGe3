package Uber;
import java.util.*;

public class Order {
    private double totalCost;
    private Customer customer;
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();

    public Order(){
        ArrayList<Food> listOfFoods = new ArrayList<Food>();
        ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();
        Customer newCustomer = new Customer();
        customer = newCustomer;
        double totalCost;
    }

    public void addFoodToOrder(Food newFood){
        listOfFoods.add(newFood);
        totalCost += newFood.getCost();
    }

    public void addDrinkToOrder(Drink newDrink){
        listOfDrinks.add(newDrink);
        totalCost += newDrink.getCost();
    }

    public double getCost(){
        return totalCost;
    }

    public void getOrder(int intFoods, int intDrinks){
        System.out.println("-----Order Summary-----");
        System.out.println();

        for (int i = 0;i < intFoods; i++){
            System.out.println("---Food Item " + (i + 1) + "---");
            listOfFoods.get(i).getInfo();
            System.out.println();
        }
        for (int i = 0;i < intDrinks; i++){
            System.out.println("---Drink Item " + (i + 1) + "---");
            listOfDrinks.get(i).getInfo();
            System.out.println();
        }

        System.out.println("Your subtotal is: " + totalCost);
    }

    public void checkOut(){

        Scanner scanner = new Scanner(System.in);

        this.getOrder(listOfFoods.size(), listOfDrinks.size());

        customer.setInfo();

        System.out.println("Thank you for your order. It will be arriving in approximately 30 minutes.");
    }

}

    

    

