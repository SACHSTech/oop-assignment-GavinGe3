package Uber;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);

        // Intialize Menu
        
        ArrayList<Food> newFoods = new ArrayList<Food>();
        int totalCost = 0;
        Customer newCustomer = new Customer("as", 2,"a",5,"d");

        Menu newMenu = new Menu();

        Order newOrder = new Order(newFoods, totalCost, newCustomer);

        System.out.println("Welcome to BigDonalds, the best fast food in the business.");
        System.out.println("Here is the preview of our menu.");
        
        newMenu.getInfo();

        System.out.println("Enter the Menu Number of your desired item.");
        int currentOrder = scanner.nextInt();

        newMenu.getFood(currentOrder).setInfo();


    }
}
