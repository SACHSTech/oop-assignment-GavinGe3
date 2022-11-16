package Uber;

public class Fries extends Food {
    String size;
    int saltContent;
    boolean isPoutine;

    public Fries(String newFood, double newCost, int newCalories, int newMenuNumber, String newSize, int newSalt, boolean newIsPoutine){
        super(newFood, newCost, newCalories, newMenuNumber);
        size = newSize;
        saltContent = newSalt;
        isPoutine = newIsPoutine;
    }
}
