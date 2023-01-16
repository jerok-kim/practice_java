package mgs_algorithm.merge_sort;

import java.util.ArrayList;

/*
 * 병합 정렬(merge sort)
 *
 * 1. 병합 정렬(merge sort)
 *  - 재귀용법을 활용한 정렬 알고리즘
 *      1. 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
 *      2. 각 부분 리스트를 재귀적으로 합병 정렬을 이용해 정렬한다.
 *      3. 두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다.
 *
 * mergeSplitFunc 메서드 틀 만들기(재귀용법 틀 만들기)
 *
 * - 만약 배열 갯수가 한개이면 해당 값 리턴
 * - 그렇지 않으면, 배열을 앞 뒤, 두 개로 나누기
 * - leftArr = mergeSplitFunc(앞)
 * - rightArr = mergeSplitFunc(뒤)
 * - return mergeFunc(leftArr, rightArr) 라는 아직 정의되지 않은 메서드 호출하여, 리턴하기
 *
 * mergeFunc 메서드 만들기
 *
 * - 목표: leftList와 rightList의 배열 데이터를 정렬하며 합쳐서, mergedList라는 이름으로 return 하기
 * - leftList와 rightList는 이미 정렬된 상태 또는 데이터가 하나임
 *
 * - ArrayList 만들기
 * - leftPoint, rightPoint = 0
 * - CASE1: leftList, rightList 둘 다 있을 때
 *      - while (leftList.size() > leftPoint && rightList.size() > rightPoint)
 *          - 만약 leftPoint나 rightPoint가 이미 leftList 또는 rightList 배열을 다 순회했다면,
 *            그 반대쪽 데이터를 그대로 넣고, 해당 인덱스 1 증가
 *          - if(leftList.get(leftPoint) > rightList.get(rightPoint))
 *              - mergedList.add(rightList.get(rightPoint));
 *              - rightPoint += 1;
 *          - else:
 *              - mergedList.add(leftList.get(leftPoint));
 *              - leftPoint += 1;
 * - CASE2: rightList 만 없을 때: 나머지 leftList에 있는 데이터를 그대로 mergedList 뒤에 넣음
 * - CASE3: leftList 만 없을 때: 나머지 rightList에 있는 데이터를 그대로 mergedList 뒤에 넣음
 *
 * 4. 알고리즘 분석
 *  - 알고리즘 분석은 쉽지 않음, 이 부분은 참고로만 알아두자.
 *      - 다음을 보고 이해해보자.
 *          - 몇 단계 깊이까지 만들어지는지를 depth라고 하고 i로 놓자. 맨 위 단계는 0으로 놓자.
 *              - 각 분리된 배열을 노드라고 부르기로 하조, n/(2^2) 는 2단계 깊이를 의미한다.
 *              - 각 단계에 있는 하나의 노드 안의 배열 길이는 n/(2^i)가 된다.
 *              - 각 단계에는 2^i개의 노드가 있다.
 *          - 각 단계의 각 노드 안의 배열 데이터는 한번씩은 체크되므로, 각 단계는 각각 (2^i) * n/(2^i) = O(n) 시간 복잡도를 가짐
 *          - 단계는 항상 ln(n) 개 만큼 만들어짐, 시간 복잡도는 결국 O(ln(n)), 2는 역시 상수이므로 삭제
 *          - 따라서, 단계별 시간 복잡도 O(n) * O(ln(n)) = O(nln(n))
 * 
 */

public class MergeSort {
    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();


        leftArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium))); // 0부터 medium - 1 인덱스 번호까지 해당 배열 아이템을 서브 배열로 추출
        rightArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        return this.mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;

        // CASE1: left/right 둘 다 있을 때
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        // CASE2: right 데이터가 없을 때
        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        // CASE3: left 데이터가 없을 때
        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }
}
