package mgs_lecture.ch15.map;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("김자바", Integer.valueOf(90));
        hashMap.put("김자바", Integer.valueOf(100));
        hashMap.put("이자바", Integer.valueOf(100));
        hashMap.put("강자바", Integer.valueOf(80));
        hashMap.put("안자바", Integer.valueOf(90));

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("이름 : " + entry.getKey() + ", 점수 : " + entry.getValue());
        }

        set = hashMap.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = hashMap.values();
        iterator = values.iterator();

        int total = 0;
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            total += integer.intValue();
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
