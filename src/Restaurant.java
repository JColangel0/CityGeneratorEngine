public class Restaurant extends Building {
    private int seats;
    private double opensAt;
    private double closesAt;

    public Restaurant(int seats, double opensAt, double closesAt) {
        super("Stryker City Restaurant", 20);
        this.seats = seats;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
    }

    public int getSeats() {
        return seats;
    }

    public double getOpenTime() {
        return opensAt;
    }

    public double getClosingTime() {
        return closesAt;
    }

    public double getHours() {
        return (24 - opensAt) + closesAt;
    }
}