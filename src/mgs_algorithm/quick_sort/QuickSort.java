package mgs_algorithm.quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 퀵 정렬(quick sort)
 *
 * 1. 퀵 정렬(quick sort) 이란?
 * - 정렬 알고리즘의 꽃
 * - 기준점(pivot 이라고 부름)을 정해서, 기준점보다 작은 데이터는 왼쪽(left), 큰 데이터는 오른쪽(right) 으로 모으는 함수를 작성함
 * - 각 왼쪽(left), 오른쪽(right)은 재귀용법을 사용해서 다시 동일 함수를 호출하여 위 작업을 반복함
 * - 함수는 왼쪽(left) + 기준점(pivot) + 오른쪽(right)을 리턴함
 *
 * 2. 알고리즘 분석
 * - 병합정렬과 유사, 시간복잡도는 O(nln(n))
 *  - 단, 최악의 경우
 *      - 이미 정렬된 배열에서 pivot이 가장 크거나, 가장 작으면 가장 큰 시간이 소요됨
 *      - 모든 데이터를 비교하는 상황이 나옴
 *      - O(n^2)
 */
public class QuickSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }

        int pivot = dataList.get(0);
        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for (int index = 1; index < dataList.size(); index++) {
            if (dataList.get(index) > pivot) {
                rightArr.add(dataList.get(index));
            } else {
                leftArr.add(dataList.get(index));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(this.sort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr));

        return mergedArr;
    }

}
