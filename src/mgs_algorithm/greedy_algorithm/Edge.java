package mgs_algorithm.greedy_algorithm;

public class Edge implements Comparable<Edge> {
    public Integer distance;
    public String node;

    public Edge(Integer distance, String node) {
        this.distance = distance;
        this.node = node;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }
}
