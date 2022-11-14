package Uber;

public class Wings extends Food {
    private int saltContent;
    private int number;
    private boolean breaded;
    private String sauce;

    public Wings(String newFood, double newCost, int newCalories, int newMenuNumber, int newSalt, int newNumber, boolean newBreaded, String newSauce){
        super(newFood, newCost, newCalories, newMenuNumber);
        saltContent = newSalt;
        number = newNumber;
        breaded = newBreaded;
        sauce = newSauce;
    }
    public void setNumber(int setNumber){
        number = setNumber;
    }
}
