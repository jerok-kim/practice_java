package mgs_algorithm.binary_search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchTest {

    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }

        Collections.sort(testData);
        System.out.println(testData);

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.searchFunc(testData, 77));

    }

}
