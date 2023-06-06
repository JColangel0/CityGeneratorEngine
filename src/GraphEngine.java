public class GraphEngine {
    private StreetEdge[] edges;

    public GraphEngine(int numNodes) {
        int edgeSize = (numNodes / 2) + 1;
        this.edges = new StreetEdge[edgeSize];
    }

    public StreetEdge[] getEdges() {
        return edges;
    }
}