package Uber;
import java.util.*;


public class Menu{
    
    ArrayList<Food> listOfFoods = new ArrayList<Food>();
    ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();
    ArrayList<String> toppings = new ArrayList<String>();

    Food Bigmac = new Food("Bigmac", 6.99, 500, 13);
    BurgersAndWraps chickenWrap = new BurgersAndWraps("Chicken Wrap", 7.99, 500, 
    12, true, false, "chicken", 2, true, toppings);

    Fries smallFries = new Fries("Fries", 1.99, 200, 3 , "small", 50, false);
    Fries mediumFries = new Fries("Fries", 2.49, 350, 3 , "medium", 100, false);
    Fries largeFries = new Fries("Fries", 2.99, 500, 3 , "large", 200, false);

    Fries mediumPoutine = new Fries("Poutine", 4.99, 700, 4, "medium", 125, true);
    Fries largePoutine = new Fries("Poutine", 6.99, 1000, 4, "Large", 200, true);

    Wings buffaloWings = new Wings("Bufallo Wings", 0.75, 75, 10, 7, 0, false);
    Wings honeyGarlicWings = new Wings("Honey Garlic Wings", 0.75, 75, 10, 7, 0, false);

    Cookies chocolateChip = new Cookies("Chocolate Chip Cookies", 1.00, 150, 11, 0, 15, false);
    Cookies oatmeal = new Cookies("Oatmeal Cookies", 1.00, 125, 12, 0, 5, false);   

    Icecream chocIcecream = new Icecream("Icecream", 2.00, 300, 13, false, 50, "chocolate");
    Icecream vanillaIcecream = new Icecream("Icecream", 2.00, 300, 13, false, 50, "vanilla");
    Icecream GTIcecream = new Icecream("Icecream", 2.00, 300, 13, false, 50, "green tea");

    Coffee expresso = new Coffee("Expresso", "", 0.00, 0, 15, 0, 0);
    Coffee cappucino = new Coffee("Cappucino", "", 0.00, 0, 16, 0,0);
    Coffee latte = new Coffee("Latte", "", 0.00, 0, 17, 0, 0 );

    Soda soda = new Soda("coke", "small", 1.99, 120, 18, 15, false);

    public Menu(){
        listOfFoods.add(Bigmac);
        listOfFoods.add(chickenWrap);
        listOfFoods.add(smallFries);
        listOfFoods.add(mediumPoutine);
        listOfFoods.add(buffaloWings);

    }

    public void getInfo(){
        for (int i=0; i< listOfFoods.size(); i++){
            System.out.println("Foods:" + listOfFoods.get(i).getCost());

            

        }
    }
}
