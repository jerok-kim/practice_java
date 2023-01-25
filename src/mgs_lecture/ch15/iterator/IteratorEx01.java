package mgs_lecture.ch15.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx01 {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(4));
        list.add(Integer.valueOf(2));

        Iterator elements = list.iterator();
        while(elements.hasNext()) {
            System.out.println(elements.next());
        }
    }
}
