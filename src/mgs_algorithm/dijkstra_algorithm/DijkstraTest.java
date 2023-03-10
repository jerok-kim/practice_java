package mgs_algorithm.dijkstra_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DijkstraTest {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();
        graph.put("A", new ArrayList<>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<>(Arrays.asList(new Edge(5, "A"))));

        Dijkstra dijkstra = new Dijkstra();
        System.out.println(dijkstra.dijkstraFunc(graph, "A"));

    }
}
