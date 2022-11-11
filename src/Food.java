abstract class Food {
    String strItemName;
    int intCost;
    int intCalories;
    int menuNumber;

    public Food(String newName, int newCost, int newCalories, int newMenuNumber){
        strItemName = newName;
        intCost = newCost;
        intCalories = newCalories;
        menuNumber = newMenuNumber;
    }

    public abstract String getInfo();

    public int getCost(){
        return intCost;
    }

    public void addToOrder(){
        return add
    }
}
