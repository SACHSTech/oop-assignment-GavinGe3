package bigDonalds;

public abstract class Drink {
    private String strItemName;
    private String strSize;
    private double dblCost;
    private int intCalories;
    private int intMenuNumber;
    
    public Drink(String newName, String newSize, double newCost, int newCalories, int newintMenuNumber){
        strItemName = newName;
        strSize = newSize;
        dblCost = newCost;
        intCalories = newCalories;
        intMenuNumber = newintMenuNumber;
    }

    public double getCost(){
        return dblCost;
    }

    public String getName(){
        return strItemName;
    }
    public void setName(String newName){
        strItemName = newName;
    }

    public String getSize(){
        return strSize;
    }
     
    public void setSize(String newSize){
        strSize = newSize;
    }

    public void setCost(double cost){
        dblCost = cost;
    }
    
    public void setCalories(double newCalories){
        intCalories = (int)newCalories;
    }
    public int getCalories(){
        return intCalories;
    }

    public String toString(){
        return intMenuNumber + " - " + strItemName;
    }

    public abstract void getInfo();

    public abstract void setInfo();

    
    
}
