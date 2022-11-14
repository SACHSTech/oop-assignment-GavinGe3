package Uber;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        // Intialize Menu

        //ArrayList<Food> newFoods = new ArrayList<Food>();
        Customer newCustomer;
        int totalCost;
        Menu newMenu = new Menu();
        //Order newOrder = newOrder(newFoods, totalCost, Customer newCustomer);

        Food Bigmac = new Food("Bigmac", 6.99, 500, 13);

        

        System.out.println("Welcome to BigDonalds, the best fast food in the business.");
        System.out.println("Here is the preview of our menu.");
        
        System.out.println(newMenu.toString());

    }
}
