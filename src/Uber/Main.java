package Uber;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);

        // Intialize Menu
        
        Menu newMenu = new Menu();
        Order newOrder = new Order();
        int numFoods = 0;
        int numDrinks = 0;


        System.out.println("Welcome to BigDonalds, the best fast food in the business.");
        System.out.println("Here is the preview of our menu.");

        while(true){

            newMenu.getInfo();

            System.out.println("Enter the Menu Number of your desired item.");
            int currentOrder = scanner.nextInt();

            if (currentOrder < 12){
                newMenu.getFood(currentOrder).setInfo();
                newOrder.addFoodToOrder(newMenu.getFood(currentOrder));
                numFoods += 1;
            }
            if (currentOrder > 11){
                newMenu.getDrink(currentOrder).setInfo();
                newOrder.addDrinkToOrder(newMenu.getDrink(currentOrder));
                numDrinks += 1;
            }

            newOrder.getOrder(numFoods, numDrinks);

            System.out.println("Enter 0 to complete your order. Enter 1 to continue ordering");
            int continueOrder = scanner.nextInt();
            if (continueOrder == 0){
                break;
            }

        }
    }
}
