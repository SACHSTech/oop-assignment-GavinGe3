package Uber;
import java.util.*;

public class Order {
    private int totalCost;
    private Customer customer;
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();

    public Order(){
        ArrayList<Food> listOfFoods = new ArrayList<Food>();
        ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();
        Customer customer;
        int totalCost;

        
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
}

    

    

