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

    public void setInfo(String newSize){
        size = newSize;
        if (size == "small"){
            this.setCalories(150);
            saltContent = 10;
        }
        if (size == "medium"){
            this.setCalories(300);
            saltContent = 20;

        }
        if (size == "large"){
            this.setCalories(450);
            saltContent = 30;

        }
    }
    public String getInfo(){
        return size + "Fries have " + saltContent + "grams of salt and " + getCalories() + "calories.";
    }
}
