public class Bank extends Building {
    private double totalCash;
    private int numAccounts;

    public Bank(double totalCash, int numAccounts) {
        super("Stryker City Royal Bank", 50);
        this.totalCash = totalCash;
        this.numAccounts = numAccounts;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public int getNumAccounts() {
        return numAccounts;
    }
}