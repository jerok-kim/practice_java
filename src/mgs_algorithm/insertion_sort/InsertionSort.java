package mgs_algorithm.insertion_sort;

/*
 * 1. 삽입 정렬 (insertion sort) 이란?
 *  - 삽입 정렬은 두 번째 인덱스부터 시작
 *  - 해당 인덱스(key 값) 앞에 있는 데이터(B)부터 비교해서 key 값이 더 작으면, B값을 뒤 인덱스로 복사
 *  - 이를 key 값이 더 큰 데이터를 만날때까지 반복, 그리고 큰 데이터를 만난 위치 바로 뒤에 key 값을 이동
 * 
 * 2. 알고리즘 분석
 *  - 반복문이 두 개 O(n^2)
 *      - 최악의 경우, ( n * ( n - 1 ) ) / 2
 *  - 완전 정렬이 되어 있는 상태라면 최선은 O(n)
 * 
 */

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (dataList.get(j) < dataList.get(j - 1)) {
                    Collections.swap(dataList, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return dataList;
    }
}
