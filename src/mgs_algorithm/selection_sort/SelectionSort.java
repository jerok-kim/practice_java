package mgs_algorithm.selection_sort;

/*
 * 선택정렬(Selection Sort)
 *
 * 알고리즘 분석
 *  - 반복문이 두 개 O(n^2)
 *      - 실제로 상세하게 계산하면, ( n * ( n - 1 ) ) / 2
 */

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < dataList.size(); j++) {
                if (dataList.get(j) < dataList.get(smallestIndex)) {
                    smallestIndex = j;
                }
            }
            Collections.swap(dataList, i, smallestIndex);
        }
        return dataList;
    }

}
