public class Bar extends Restaurant {
    private int numDrinkTypes;

    public Bar(int numDrinkTypes) {
        super(200, 17, 2);
        this.numDrinkTypes = numDrinkTypes;
    }

    public int getNumDrinkTypes() {
        return numDrinkTypes;
    }
}