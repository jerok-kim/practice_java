package mgs_algorithm.greedy_algorithm;

/*
 * 탐욕 알고리즘의 이해
 *
 * 1. 탐욕 알고리즘 이란?
 *  - Greedy algorithm 또는 탐욕 알고리즘 이라고 불리움
 *  - 최적의 해에 가까운 값을 구하기 위해 사용됨
 *  - 여러 경우 중 하나를 결정해야할 때마다, 매순간 최적이라고 생각되는 경우를 선택하는 방식으로 진행해서, 최종적인 값을 구하는 방식
 *
 * 2. 탐욕 알고리즘 예
 *  - 동전 문제
 *  - knapsack problem
 *
 * * Comparable과 Comparator 인터페이스
 *  - Comparable와 Comparator는 둘 다 인터페이스로, 정렬 기준을 구현하기 위해 사용됨
 *      - Comparable 인터페이스는 compareTo() 메서드를 override 해서 구현
 *          - 일반적으로는 정렬할 객체에 implements로 Comparable 인터페이스를 추가하여 구현
 *      - Comparator 인터페이스는 compare() 메서드를 override 해서 구현
 *          - 일반적으로는 별도 클래스를 정의해서 구현하며, 따라서, 동일 객체에 다양한 정렬 기준을 가진 클래스를 작성 가능
 *
 * * Arrays.sort() 와 Comparator
 *  - Arrays.sort() 메서드는 인자를 두 개 받아서, 두 번째 인자에 Comparator 클래스를 넣어줄 수도 있음
 *      - Edge 객체에 Comparable 인터페이스가 정의되어 있다하더라도, Comparator 클래스의 정렬 기준으로 정렬이 됨
 *
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm {

    public void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCount = 0;
        Integer coinNum = 0;
        ArrayList<Integer> details = new ArrayList<>();

        for (int index = 0; index < coinList.size(); index++) {
            coinNum = price / coinList.get(index);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(index);
            details.add(coinNum);
            System.out.println(coinList.get(index) + "원: " + coinNum + "개");
        }

        System.out.println("총 동전 갯수: " + totalCoinCount);
    }

    public void knapsackFunc(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1] / o2[0]) - (o1[1] / o1[0]);
            }
        });

        for (int i = 0; i < objectList.length; i++) {
            if ((capacity - (double) objectList[i][0]) > 0) {
                capacity -= (double) objectList[i][0];
                totalValue += (double) objectList[i][1];
                System.out.println("무게:" + objectList[i][0] + ", 가치:" + objectList[i][1]);
            } else {
                fraction = capacity / (double) objectList[i][0];
                totalValue += (double) objectList[i][1] * fraction;
                System.out.println("무게:" + objectList[i][0] + ", 가치:" + objectList[i][1] + ", 비율:" + fraction);
                break;
            }
        }

        System.out.println("총 담을 수 있는 가치: " + totalValue);
    }

}
