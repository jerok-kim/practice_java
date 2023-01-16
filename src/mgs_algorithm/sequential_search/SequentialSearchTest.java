package mgs_algorithm.sequential_search;

import java.util.ArrayList;

public class SequentialSearchTest {
    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }

        System.out.println(testData);

        SequentialSearch sequentialSearch = new SequentialSearch();
        Integer n = 19;
        System.out.print("n: " + n + " -> index: " + sequentialSearch.searchFunc(testData, n));
        
    }
}
