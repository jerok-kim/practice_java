package mgs_algorithm.depth_first_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DepthFirstSearchTest {

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
        
        DepthFristSearch depthFristSearch = new DepthFristSearch();
        System.out.println(depthFristSearch.dfsFunc(myGraph, "A"));
        
    }
    
}
