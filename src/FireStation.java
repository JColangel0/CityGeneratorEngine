public class FireStation extends Building {
    private int numFireEngines;
    private int numFightersOnShift;

    public FireStation(int numFireEngines) {
        super("Stryker City Fire Station", 35);
        this.numFireEngines = numFireEngines;
        this.numFightersOnShift = numFireEngines * 8;
    }

    public int getNumFireEngines() {
        return numFireEngines;
    }

    public int getNumFightersOnShift() {
        return numFightersOnShift;
    }
}