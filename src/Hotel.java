public class Hotel extends Building {
    private int numRooms;
    private int totalPopulation;

    public Hotel(int numRooms) {
        super("Stryker City Hotel", 45);
        this.numRooms = numRooms;
        this.totalPopulation = (numRooms / 2) * 4 + (numRooms / 2) * 2;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public int getTotalPopulation() {
        return totalPopulation;
    }
}