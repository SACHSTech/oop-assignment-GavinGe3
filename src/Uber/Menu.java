package Uber;
import java.util.*;


public class Menu{
    
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();

    BurgersAndWraps burger = new BurgersAndWraps("Burger", 6.99, 450, 1, false, true, "beef", 1, false);
    BurgersAndWraps wrap = new BurgersAndWraps("Wrap", 7.99, 500, 
    2, true, false, "chicken", 0, false);

    Fries fries = new Fries("Fries", 1.99, 200, 3 , "small", 50, false);
    //Fries mediumFries = new Fries("Fries", 2.49, 350, 3 , "medium", 100, false);
    //Fries largeFries = new Fries("Fries", 2.99, 500, 3 , "large", 200, false);

    Fries poutine = new Fries("Poutine", 4.99, 700, 4, "medium", 125, true);
    //Fries largePoutine = new Fries("Poutine", 6.99, 1000, 4, "Large", 200, true);

    Wings buffaloWings = new Wings("Bufallo Wings", 0.75, 75, 5, 7, 0, false);
    Wings honeyGarlicWings = new Wings("Honey Garlic Wings", 0.75, 75, 6, 7, 0, false);

    Cookies chocolateChip = new Cookies("Chocolate Chip Cookies", 1.00, 150, 7, 0, 15, false);
    Cookies oatmeal = new Cookies("Oatmeal Cookies", 1.00, 125, 8, 0, 5, false);   

    Icecream chocIcecream = new Icecream("Chocolate Icecream", 2.00, 300, 9, false, 50, "chocolate");
    Icecream vanillaIcecream = new Icecream("Vanilla Icecream", 2.00, 300, 10, false, 50, "vanilla");
    Icecream GTIcecream = new Icecream("Green Tea Icecream", 2.00, 300, 11, false, 50, "green tea");

    Coffee expresso = new Coffee("Expresso", "", 0.00, 0, 12, 0, 0);
    Coffee cappucino = new Coffee("Cappucino", "", 0.00, 0, 13, 0,0);
    Coffee latte = new Coffee("Latte", "", 0.00, 0, 14, 0, 0 );

    Soda soda = new Soda("Soda", "small", 1.99, 120, 15, 15);

    public Menu(){
        // Add Foods
        listOfFoods.add(burger);
        listOfFoods.add(wrap);
        listOfFoods.add(fries);
        listOfFoods.add(poutine);
        listOfFoods.add(buffaloWings);
        listOfFoods.add(honeyGarlicWings);
        listOfFoods.add(chocolateChip);
        listOfFoods.add(oatmeal);
        listOfFoods.add(chocIcecream);
        listOfFoods.add(vanillaIcecream);
        listOfFoods.add(GTIcecream);

        // Add Drinks
        listOfDrinks.add(expresso);
        listOfDrinks.add(cappucino);
        listOfDrinks.add(latte);
        listOfDrinks.add(soda);

    }

    public void getInfo(){
        System.out.println("---Foods---");
        for (int i=0; i< listOfFoods.size(); i++){
            System.out.println(listOfFoods.get(i));
        }
        System.out.println("---Drinks---");
        for (int i = 0; i < listOfDrinks.size(); i++){
            System.out.println(listOfDrinks.get(i));
        }
    }

    public Food getFood(int i){
        return listOfFoods.get(i);
    }
    public Drink getDrink(int i){
        return listOfDrinks.get(i);
    }
}
