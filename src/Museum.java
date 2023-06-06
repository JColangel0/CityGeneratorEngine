public class Museum extends Building {
    private int numExhibits;
    private int capacity;

    public Museum(int numExhibits, int capacity) {
        super("Stryker City Museum", 30);
        this.numExhibits = numExhibits;
        this.capacity = capacity;
    }

    public int getNumExhibits() {
        return numExhibits;
    }

    public int getCapacity() {
        return capacity;
    }
}