package mgs_algorithm.sequential_search;

import java.util.ArrayList;

/*
 * 탐색 알고리즘1: 순차 탐색(Sequential Search)
 *
 * 1. 순차 탐색(Sequential Search) 이란?
 *  - 탐색은 여러 데이터 중에서 원하는 데이터를 찾아내는 것을 의미
 *  - 데이터가 담겨있는 리스트를 앞에서부터 하나씩 비교해서 원하는 데이터를 찾는 방법
 *
 * 2. 알고리즘 분석
 *  - 최악의 경우 리스트 길이가 n일 때, n번 비교해야 함
 *      - O(n)
 */
public class SequentialSearch {

    public Integer searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) == searchItem) {
                return i;
            }
        }
        return -1;
    }

}
