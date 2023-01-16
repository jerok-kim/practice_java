package mgs_algorithm.quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            testData.add((int) (Math.random() * 100));
        }

        System.out.println(testData);
        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.sort(testData));
    }
}
