package mgs_lecture.ch15.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // add() 메소드를 이용한 요소의 저장
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        System.out.println("1->" + arrayList);

        // remove() 메소드를 이용한 요소의 제거
        arrayList.remove(1);
        System.out.println("2->" + arrayList);

        // Collections.sort(arrList);
        Collections.sort(arrayList);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        System.out.println("3->");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        arrayList.set(0, 20);
        System.out.println("4->" + arrayList);

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("5-> 리스트의 크기 : " + arrayList.size());
        
        Vector vector = new Vector();
    }
}
