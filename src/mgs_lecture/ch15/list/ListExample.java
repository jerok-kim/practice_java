package mgs_lecture.ch15.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add(Integer.valueOf(4));
        list.add(Float.valueOf(5.0F));
        list.add("second");
        list.add(Integer.valueOf(4));
        list.add(1);
        list.add(1.1F);

        System.out.println(list);
    }
}
