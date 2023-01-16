package mgs_algorithm.greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GreedyAlgorithmTest {
    public static void main(String[] args) {

        // 동전 문제
        GreedyAlgorithm coinTest = new GreedyAlgorithm();
        ArrayList<Integer> coinList = new ArrayList<>(List.of(500, 100, 50, 1));
        coinTest.coinFunc(4720, coinList);


        // 부분 배낭 문제 (Fractional Knapsack Problem)
        // Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        // System.out.println(objectList.length);
        //
        // Integer[] iArray = new Integer[]{1, 10, 4, 3, 2};
        // Arrays.sort(iArray);
        // System.out.println(Arrays.toString(iArray));
        //
        // Edge edge1 = new Edge(12, "A");
        // Edge edge2 = new Edge(10, "A");
        // Edge edge3 = new Edge(13, "A");
        // Edge[] edges = new Edge[]{edge1, edge2, edge3};
        // Arrays.sort(edges, new Comparator<Edge>() {
        //     @Override
        //     public int compare(Edge o1, Edge o2) {
        //         return o2.distance - o1.distance;
        //     }
        // });
        //
        // for (int i = 0; i < edges.length; i++) {
        //     System.out.println(edges[i].distance);
        // }

        // 부분 배낭 문제 (Fractional Knapsack Problem)
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        greedyAlgorithm.knapsackFunc(objectList, 30.0);


    }
}
