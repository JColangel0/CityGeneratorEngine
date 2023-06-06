public class Hospital extends Building {
    private int bedsAvailable;
    private int numPatients;
    private int totalBeds;

    public Hospital(int bedsAvailable, int numPatients) {
        super("Stryker City Hospital", 30);
        this.bedsAvailable = bedsAvailable;
        this.numPatients = numPatients;
        this.totalBeds = bedsAvailable + numPatients + 10;
    }

    public int getBedsAvailable() {
        return bedsAvailable;
    }

    public int getNumPatients() {
        return numPatients;
    }

    public int getTotalBeds() {
        return totalBeds;
    }
}