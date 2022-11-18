package bigDonalds;
import java.util.*;


public class Menu{
    
    private ArrayList<Food> listOfFoods = new ArrayList<Food>();
    private ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();
    
    Fries blank = new Fries("Fries", 2.49, 350, 0 , "medium", 100);

    BurgersAndWraps burger = new BurgersAndWraps("BigDonalds Burger", 0.00, 450, 1, false, true, "beef", 1, false,"");
    BurgersAndWraps wrap = new BurgersAndWraps("BigDoanlds Wrap", 7.99, 500, 
    2, true, false, "chicken", 0, false,"");

    Fries fries = new Fries("Fries", 1.99, 200, 3 , "small", 50);

    Wings buffaloWings = new Wings("Bufallo Wings", 0.75, 75, 4, 7, 0, false);
    Wings honeyGarlicWings = new Wings("Honey Garlic Wings", 0.75, 75, 5, 7, 0, false);

    Cookies chocolateChip = new Cookies("Chocolate Chip Cookies", 1.00, 150, 6, 0, 15);
    Cookies oatmeal = new Cookies("Oatmeal Cookies", 1.00, 125, 7, 0, 5);   

    Icecream chocIcecream = new Icecream("Chocolate Icecream", 2.00, 300, 8, false, 50, "chocolate");
    Icecream vanillaIcecream = new Icecream("Vanilla Icecream", 2.00, 325, 9, false, 50, "vanilla");
    Icecream GTIcecream = new Icecream("Green Tea Icecream", 2.00, 250, 10, false, 30, "green tea");

    // Define Drinks
    Coffee expresso = new Coffee("Expresso", "", 0.00, 100, 11, 30, 0);
    Coffee cappucino = new Coffee("Cappucino", "", 0.00, 200, 12, 15,40);
    Coffee latte = new Coffee("Latte", "", 0.00, 175, 13, 15, 50 );

    Soda soda = new Soda("Soda", "small", 1.99, 120, 14, 15);
    

    public Menu(){
        // Add Foods
        listOfFoods.add(blank);
        listOfFoods.add(burger);
        listOfFoods.add(wrap);
        listOfFoods.add(fries);
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
        for (int i = 1; i < listOfFoods.size(); i++){
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
        return listOfDrinks.get((i - 11));
    }
}
