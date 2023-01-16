package mgs_algorithm.breadth_first_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BreadthFirstSearchTest {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> myGraph = new HashMap<>();
        myGraph.put("A", new ArrayList<>(List.of("B", "C")));
        myGraph.put("B", new ArrayList<>(List.of("A", "D")));
        myGraph.put("C", new ArrayList<>(List.of("A", "G", "H", "I")));
        myGraph.put("D", new ArrayList<>(List.of("B", "E", "F")));
        myGraph.put("E", new ArrayList<>(List.of("D")));
        myGraph.put("F", new ArrayList<>(List.of("D")));
        myGraph.put("G", new ArrayList<>(List.of("C")));
        myGraph.put("H", new ArrayList<>(List.of("C")));
        myGraph.put("I", new ArrayList<>(List.of("C", "J")));
        myGraph.put("J", new ArrayList<>(List.of("I")));

        System.out.println(myGraph);
        
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        System.out.println(breadthFirstSearch.bfsFunc(myGraph, "A"));

    }

}
