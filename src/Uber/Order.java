package Uber;
import java.util.*;

public class Order {
    private int totalCost;
    private Customer customer;
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();


    public Order(ArrayList<Food> newListOfFoods, int newTotalCost, Customer newCustomer){
        listOfFoods = newListOfFoods;
        totalCost = newTotalCost;
        customer = newCustomer;
    }

    public void addToOrder(Food newFood){
        listOfFoods.add(newFood);
        totalCost += newFood.getCost();
    }

    public double getCost(){
        return totalCost;
    }
    



}

    

    

