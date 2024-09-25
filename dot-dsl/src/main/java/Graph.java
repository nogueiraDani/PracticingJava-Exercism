import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private final Collection<Node> nodes;
    private final Collection<Edge> edges;
    private final Map<String, String> graphAttributes;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.graphAttributes = new HashMap<>();
    }

    public Graph(Map<String, String> attributes) {
        this();
        this.graphAttributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return this.nodes;
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        Node newNode = new Node(name);
        this.nodes.add(newNode);
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node newNode = new Node(name, attributes);
        this.nodes.add(newNode);
        return this;
    }

    public Graph edge(String start, String end) {
        Edge newEdge = new Edge(start, end);
        this.edges.add(newEdge);
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge newEdge = new Edge(start, end, attributes);
        this.edges.add(newEdge);
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.graphAttributes;
    }
}
