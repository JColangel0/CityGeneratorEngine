import java.util.ArrayList;
import java.util.List;

public class GraphEngine {
    private ArrayList<StreetEdge> edges;
    private ArrayList<CityNode> nodes;

    public GraphEngine() {
        this.edges = new ArrayList<StreetEdge>();
        this.nodes = new ArrayList<CityNode>();
    }

    public List<StreetEdge> getEdges() {
        return edges;
    }

    public List<CityNode> getNodes() {
        return nodes;
    }

    public void addNode(CityNode node) {
        for (CityNode n : nodes) {
            if (n.isEqualTo(node)) {
                return;
            }
        }
        nodes.add(node);
    }

    public void addEdges(StreetEdge edge) {
        addNode(edge.getSource());
        addNode(edge.getDestination());
        for (StreetEdge e : edges) {
            if (e.isEqualTo(edge)) {
                return;
            }
        }
        edges.add(edge);
    }
}