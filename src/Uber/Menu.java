package Uber;
import java.util.*;


public class Menu{
    
    ArrayList<Food> listOfFoods = new ArrayList<Food>();
    ArrayList<Drink> listOfDrinks = new ArrayList<Drink>();
    Food Bigmac = new Food("Bigmac", 6.99, 500, 13);
    BurgersAndWraps chickenWrap = new BurgersAndWraps("Chikcen Wrap", 7.99, 500, 
    12, true, false, "chicken", 2, true, new String[] {"Chicken"});


    public Menu(){
        listOfFoods.add(Bigmac);
        listOfFoods.add(chickenWrap);

    }

    public String toString(){
        return ("Foods:" + listOfFoods.get(0).getCost() + listOfFoods.get(1).getCost());

    }
}
