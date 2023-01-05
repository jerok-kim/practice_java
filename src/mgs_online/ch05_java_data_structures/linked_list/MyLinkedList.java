package mgs_online.ch05_java_data_structures.linked_list;

/**
 * LinkedList 특징
 * <p>
 * - 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
 * - 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
 * - 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함(정해진 크기가 없음)
 * - 연결 리스트의 i번째 요소를 찾는데 걸리는 시간은 요소의 개수에 비례: O(n)
 * - jdk 클래스: LinkedList
 */

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode;
        if (head == null) {  // 맨 처음일때
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while (temp.next != null) {  // 맨 뒤로 가서
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;

        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null;
        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {  // 맨 앞으로 들어가는 경우
            newNode.next = head;
            head = newNode;
        } else {
            for (i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;

        return newNode;
    }

    public MyListNode removeElement(int position) {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if (position >= count) {
            System.out.println("삭제 할 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {  // 맨 앞을 삭제하는
            head = tempNode.next;
        } else {
            for (i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    public String getElement(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return new String("error");
        }

        if (position == 0) {  // 맨 처음인 경우
            return head.getData();
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {  // 맨 처음인 경우
            return head;
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

}
