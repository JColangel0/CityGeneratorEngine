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

    public String getCoordinates() {
        return location.toString();
    }

    public Building getBuilding() {
        return building;
    }

    public boolean isEqualTo(CityNode node) {
        return node.getCoordinates().equals(this.getCoordinates());
    }
}