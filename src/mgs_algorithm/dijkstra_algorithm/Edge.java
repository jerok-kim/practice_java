package mgs_algorithm.dijkstra_algorithm;

public class Edge implements Comparable<Edge> {
    public int distance;
    public String node;

    public Edge(int distance, String node) {
        this.distance = distance;
        this.node = node;
    }

    // System.out.println() 으로 객체 자체 출력시,
    public String toString() {
        return "node: " + this.node + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }
}
