public class Supermarket extends Store {
    private int numFoodItems;

    public Supermarket(int numFoodItems) {
        super(3000, 200);
        this.numFoodItems = numFoodItems;
    }

    public int getNumFoodItems() {
        return numFoodItems;
    }
}