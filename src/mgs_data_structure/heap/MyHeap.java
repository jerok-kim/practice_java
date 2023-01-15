package mgs_data_structure.heap;

/*
 * 1. 힙(Heap) 이란?
 *  - 힙: 데이터에서 최대값과 최소값을 빠르게 찾기 위해 고안된 완전 이진 트리(Complete Binary Tree)
 *      - 완전 이진 트리: 노드를 삽입할 때 최하단 왼쪽 노드부터 차례대로 삽입하는 트리
 *  - 힙을 사용하는 이유
 *      - 배열에 데이터를 넣고, 최대값과 최소값을 찾으려면 O(n)이 걸림
 *      - 이에 반해, 힙에 데이터를 넣고, 최대값과 최소값을 찾으면, O(logn)이 걸림
 *      - 우선순위 큐와 같이 최대값 또는 최소값을 빠르게 찾아야 하는 자료구조 및 알고리즘 구현 등에 활용됨
 *
 * 2. 힙(Heap) 구조
 *  - 힙은 최대값을 구하기 위한 구조(최대 힙, Max Heap)와, 최소값을 구하기 위한 구조(최소 힙, Min Heap)로 분류할 수 있음
 *  - 힙은 다음과 같이 두 가지 조건을 가지고 있는 자료구조임
 *      1. 각 노드의 값을 해당 노드의 자식 노드가 가진 값보다 크거나 같다(최대 힙인 경우)
 *          - 최소 힙인 경우는 각 노드의 값은 해당 노드의 자식 노드가 가진 값보다 작거나 같음
 *      2. 완전 이진 트리 형태를 가짐
 *
 * 힙과 이진 탐색 트리의 공통점과 차이점
 *  - 공통점: 힙과 이진 탐색 트리는 모두 이진 트리임
 *  - 차이점:
 *      - 힙은 각 노드의 값이 자식 노드보다 크거나 같음(Max Heap의 경우)
 *      - 이진 탐색 트리는 왼쪽 자식 노드의 값이 가장 작고, 그 다음 부모 노드, 그 다음 오른쪽 자식 노드 값이 가장 큼
 *      - 힙은 이진 탐색 트리의 조건인 자식 노드에서 작은 값은 왼쪽, 큰 값은 오른쪽이라는 조건은 없음
 *          - 힙의 왼쪽 및 오른쪽 자식 노드의 값은 오른쪽이 클 수도 있고 왼쪽이 클 수도 있음
 *  - 이진 탐색 트리는 탐색을 위한 구조, 힙은 최대/최소값 검색을 위한 구조 중 하나로 이해하면 됨
 *
 * 힙에 데이터 삽입하기 - 기본 동작
 *  - 힙은 완전 이진 트리이므로, 삽입할 노드는 기본적으로 왼쪽 최하단부 노드부터 채워지는 형태로 삽입
 *
 * 힙에 데이터 삽입하기 - 삽입할 데이터가 힙의 데이터보다 클 경우 (Max Heap의 예)
 *  - 먼저 삽입된 데이터는 완전 이진 트리 구조에 맞추어, 최하단부 왼쪽 노드부터 채워짐
 *  - 채워진 노드 위치에서, 부모 노드보다 값이 클 경우, 부모 노드와 위치를 바꿔주는 작업을 반복함(swap)
 *
 * 힙의 데이터 삭제하기 (Max Heap의 예)
 *  - 보통 삭제는 최상단 노드(root 노드)를 삭제하는 것이 일반적임
 *      - 힙의 용도는 최대값 또는 최소값을 root노드에 놓아서, 최대값과 최소값을 바로 꺼내 쓸 수 있도록 하는 것임
 *  - 상단의 데이터 삭제시, 가장 최하단부 왼쪽에 위치한 노드(일반적으로 가장 마지막에 추가한 노드)를 root노드로 이동
 *  - root 노드의 값이 child node 보다 작을 경우, root 노드의 child node 중 가장 큰 값을 가진 노드와 root 노드 위치를 바꿔주는 작업을 반복함(swap)
 *
 * 힙 구현
 *
 * 힙과 배열
 *  - 일반적으로 힙 구현시 배열 자료구조를 활용함
 *  - 배열은 인덱스가 0번부터 시작하지만, 힙 구현의 편의를 위해, root 노드 인덱스 번호를 1로 지정하면, 구현이 좀 더 수월함
 *      - 부모 노드 인덱스 번호(parent node's index) = 자식 노드 인덱스 번호(child node's index) / 2
 *          - Java에서는 / 연산자로 몫을 구할 수 있음
 *      - 왼쪽 자식 노드 인덱스 번호(left child node's index) = 부모 노드 인덱스 번호(parent node's index) * 2
 *      - 오른쪽 자식 노드 인덱스 번호(right child node's index) = 부모 노드 인덱스 번호(parent node's index) * 2 + 1
 *
 */

/*
 * 특정 노드의 관련 노드 위치 알아내기
 *
 * - 부모 노드 인덱스 번호(parent node's index) = 자식 노드 인덱스 번호(child node's index) / 2
 * - 왼쪽 자식 노드 인덱스 번호(left child node's index) = 부모 노드 인덱스 번호(parent node's index) * 2
 * - 오른쪽 자식 노드 인덱스 번호(right child node's index) = 부모 노드 인덱스 번호(parent node's index) * 2 + 1
 *
 */

/*
 * 힙 구현에 사용된 Collections.swap() 메서드 사용법 이해하기
 *
 * - swap(스왑) 이란, 두 데이터의 위치를 맞바꾸는 것을 의미함
 * - swap 함수를 별도로 구현할 수도 있지만, Java에서는 Collections 패키지에서 swap() 메서드를 제공해주고 있음
 *      - 하나의 배열 안에 있는 두 데이터의 위치를 서로 맞바꾸고 싶을 때 사용 가능
 */

import java.util.ArrayList;
import java.util.Collections;

public class MyHeap {

    public ArrayList<Integer> heapArray = null;

    public MyHeap(Integer data) {
        heapArray = new ArrayList<Integer>();

        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean moveUp(Integer insertedIndex) {
        if (insertedIndex <= 1) {
            return false;
        }
        Integer parentIndex = insertedIndex / 2;
        if (this.heapArray.get(insertedIndex) > this.heapArray.get(parentIndex)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(Integer data) {
        Integer insertedIndex, parentIndex;

        if (heapArray == null) {
            heapArray = new ArrayList<Integer>();
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }

        this.heapArray.add(data);
        insertedIndex = this.heapArray.size() - 1;

        while (this.moveUp(insertedIndex)) {
            parentIndex = insertedIndex / 2;
            Collections.swap(this.heapArray, insertedIndex, parentIndex);
            insertedIndex = parentIndex;
        }
        return true;
    }

    public Integer pop() {
        Integer returnedData, poppedIndex, leftChildPoppedIndex, rightChildPoppedIndex;
        if (this.heapArray == null) {
            return null;
        } else {
            returnedData = this.heapArray.get(1);
            this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
            this.heapArray.remove(this.heapArray.size() - 1);
            poppedIndex = 1;

            while (this.moveDown(poppedIndex)) {
                leftChildPoppedIndex = poppedIndex * 2;
                rightChildPoppedIndex = poppedIndex * 2 + 1;

                // CASE2: 오른쪽 자식 노드만 없을 때
                if (rightChildPoppedIndex >= this.heapArray.size()) {
                    if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChildPoppedIndex)) {
                        Collections.swap(heapArray, poppedIndex, leftChildPoppedIndex);
                        poppedIndex = leftChildPoppedIndex;
                    }
                } else {
                    // CASE3: 왼쪽/오른쪽 자식 노드가 모두 있을 때
                    if (this.heapArray.get(leftChildPoppedIndex) < this.heapArray.get(rightChildPoppedIndex)) {
                        if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChildPoppedIndex)) {
                            Collections.swap(heapArray, poppedIndex, leftChildPoppedIndex);
                            poppedIndex = leftChildPoppedIndex;
                        }
                    } else {
                        if (this.heapArray.get(poppedIndex) < this.heapArray.get(rightChildPoppedIndex)) {
                            Collections.swap(heapArray, poppedIndex, rightChildPoppedIndex);
                            poppedIndex = rightChildPoppedIndex;
                        }
                    }
                }
            }

            return returnedData;
        }
    }

    public boolean moveDown(Integer poppedIndex) {
        Integer leftChildPoppedIndex, rightChildPoppedIndex;

        leftChildPoppedIndex = poppedIndex * 2;
        rightChildPoppedIndex = poppedIndex * 2 + 1;

        // CASE1: 왼쪽 자식 노드도 없을 때 (자식 노드가 하나도 없을 때)
        if (leftChildPoppedIndex >= this.heapArray.size()) {
            return false;
        } else if (rightChildPoppedIndex >= this.heapArray.size()) {
            // CASE2: 오른쪽 자식 노드만 없을 때
            if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChildPoppedIndex)) {
                return true;
            } else {
                return false;
            }
        } else {
            // CASE3: 왼쪽/오른쪽 자식 노드가 모두 있을 때
            if (this.heapArray.get(leftChildPoppedIndex) > this.heapArray.get(rightChildPoppedIndex)) {
                if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChildPoppedIndex)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (this.heapArray.get(poppedIndex) < this.heapArray.get(rightChildPoppedIndex)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
