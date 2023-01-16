package mgs_algorithm.insertion_sort;

import java.util.ArrayList;

public class InsertionSortTest {
    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testData.add((int) (Math.random() * 100));
        }
        System.out.println(testData);

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(insertionSort.sort(testData));
    }
}
