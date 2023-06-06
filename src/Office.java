public class Office extends Building {
    private int numWorkers;
    private int branchNumber;

    public Office(int numWorkers, int branchNumber) {
        super("Stryker City Office Building", 65);
        this.numWorkers = numWorkers;
        this.branchNumber = branchNumber;
    }

    public int getNumWorkers() {
        return numWorkers;
    }

    public int getBranchNumber() {
        return branchNumber;
    }
}