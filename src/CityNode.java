public class CityNode {
    private Location location; // compositional relationship
    private Building building; // compositional relationship

    public CityNode(Location location, Building building) {
        this.location = location;
        this.building = building;
    }

    public Location getLocation() {
        return location;
    }

    public Building getBuilding() {
        return building;
    }
}