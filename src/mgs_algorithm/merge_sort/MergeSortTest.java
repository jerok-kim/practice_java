package mgs_algorithm.merge_sort;

import java.util.ArrayList;

public class MergeSortTest {
    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            testData.add((int) (Math.random() * 100));
        }

        System.out.println(testData);
        MergeSort mergeSort = new MergeSort();
        System.out.println(mergeSort.mergeSplitFunc(testData));

    }
}
