package mgs_lecture.ch15.map;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // put() 메소드를 이용한 요소의 저장
        treeMap.put(30, "삼십");
        treeMap.put(10, "십");
        treeMap.put(40, "사십");
        treeMap.put(20, "이십");
        System.out.println(treeMap);

        // remove() 메소드를 이용한 요소의 제거
        treeMap.remove(40);
        System.out.println(treeMap);

        // replace() 메소드를 이용한 요소의 수정
        treeMap.replace(20, "twenty");
        System.out.println(treeMap);

    }
}
