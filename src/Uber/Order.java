package Uber;
import java.util.*;

public class Order {
    int totalCost;
    Customer customer;
    ArrayList<Food> listOfFoods = new ArrayList<Food>();


    public Order(ArrayList<Food> newListOfFoods, int newTotalCost, Customer newCustomer){
        listOfFoods = newListOfFoods;
        totalCost = newTotalCost;
        customer = newCustomer;
    }

    public void addToOrder(Food newFood){
        listOfFoods.add(newFood);
    }
    



}

    

    

