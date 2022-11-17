package Uber;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);

        // Intialize Menu
        
        Menu newMenu = new Menu();
        Order newOrder = new Order();


        System.out.println("Welcome to BigDonalds, the best fast food in the business.");
        System.out.println("Here is the preview of our menu.");

        while(true){
            newMenu.getInfo();

            System.out.println("Enter the Menu Number of your desired item.");
            int currentOrder = scanner.nextInt();

            if (currentOrder < 12){
                newMenu.getFood(currentOrder).setInfo();
                newOrder.addFoodToOrder(newMenu.getFood(currentOrder));
            }
            if (currentOrder > 11){
                newMenu.getDrink(currentOrder).setInfo();
                newOrder.addDrinkToOrder(newMenu.getDrink(currentOrder));
            }
        }
        
    }
}
