package mgs_lecture.ch15.list;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1000000000L);
        arrayList.add(123.456778F);
        arrayList.add(123.2342);
        arrayList.add("sajkfjkfjakslfjlajflkjaflkjl");
        System.out.println(arrayList);
    }
    
}
