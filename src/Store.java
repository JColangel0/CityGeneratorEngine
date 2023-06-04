public class Store extends Building {
    private double totalProfitToday;
    private int peopleInStore;

    public Store(double totalProfitToday, int peopleInStore) {
        super("Stryker City Store", 30);
        this.totalProfitToday = totalProfitToday;
        this.peopleInStore = peopleInStore;
    }

    public double totalProfitToday() {
        return totalProfitToday;
    }

    public int getPeopleInStore() {
        return peopleInStore;
    }
}