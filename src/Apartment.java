public class Apartment extends Building {
    private double rent;
    private int tenants;

    public Apartment(double rent, int tenants) {
        super("Stryker City Apartment Complex", 35);
        this.rent = rent;
        this.tenants = tenants;
    }

    public double getRent() {
        return rent;
    }

    public int getTenants() {
        return tenants;
    }
}