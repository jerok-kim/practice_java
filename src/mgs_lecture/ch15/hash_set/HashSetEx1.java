package mgs_lecture.ch15.hash_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {

        Object[] objects = {"1", Integer.valueOf(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();  // 순서-x, 중복-x 순서를 유지하려면 LinkedHashSet 사용

        for (int i = 0; i < objects.length; i++) {
            set.add(objects[i]);
        }

        System.out.println(set);

    }
}
