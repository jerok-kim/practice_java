package mgs_algorithm.bubble_sort;

/*
 * 1. 정렬(sorting) 이란?
 *
 *  - 정렬(sorting): 어떤 데이터들이 주어졌을 때 이를 정해진 순서대로 나열하는 것
 *  - 정렬은 프로그램 작성시 빈번하게 필요로 함
 *  - 다양한 알고리즘이 고안되었으며, 알고리즘 학습의 필수
 *
 * 2. 버블 정렬(bubble sort) 이란?
 *  - 두 인접한 데이터를 비교해서, 앞에 있는 데이터가 뒤에 있는 데이터보다 크면, 자리를 바꾸는 정렬 알고리즘
 */

import java.util.ArrayList;

public class BubbleSortTest {

    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(testData);
        System.out.println(testData);

    }

}
