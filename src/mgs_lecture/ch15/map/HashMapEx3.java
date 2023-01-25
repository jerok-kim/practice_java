package mgs_lecture.ch15.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx3 {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        // put() 메소드를 이용한 요소의 저장
        hashMap.put("삼십", 30);
        hashMap.put("십", 10);
        hashMap.put("사십", 40);
        hashMap.put("이십", 20);

        System.out.println("맵에 저장된 키들의 집합 : " + hashMap.keySet());
        for (String key : hashMap.keySet()) {
            System.out.println(String.format(
                    "Key : %s, Value : %s", key, hashMap.get(key)
            ));
        }

        // remove() 메소드를 이용한 요소의 제거
        hashMap.remove("사십");

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<String> keys = hashMap.keySet().iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format(
                    "Key : %s, Value : %s", key, hashMap.get(key)
            ));
        }

        // replace() 메소드를 이용한 요소의 수정
        hashMap.replace("이십", 200);
        System.out.println(hashMap);

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : " + hashMap.size());

    }

}
