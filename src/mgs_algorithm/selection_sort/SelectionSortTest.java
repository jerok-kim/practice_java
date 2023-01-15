package mgs_algorithm.selection_sort;

import java.util.ArrayList;

public class SelectionSortTest {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testList.add((int) (Math.random() * 100));
        }

        System.out.println(testList);
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(selectionSort.sort(testList));

    }
}
