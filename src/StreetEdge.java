public class StreetEdge {
    private CityNode src;
    private CityNode dest;

    public StreetEdge(CityNode src, CityNode dest) {
        this.src = src;
        this.dest = dest;
    }

    public CityNode getSource() {
        return src;
    }

    public CityNode getDestination() {
        return dest;
    }

    @Override
    public String toString() {
        return (src.getCoordinates() + " -> " + dest.getCoordinates());
    }

    public boolean isEqualTo(StreetEdge edge) {
        return (this.src.isEqualTo(edge.getSource()) && this.dest.isEqualTo(edge.getDestination()));
    }
}