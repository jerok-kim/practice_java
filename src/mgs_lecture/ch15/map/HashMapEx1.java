package mgs_lecture.ch15.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Geeks");
        hashMap.put(2, "For");
        hashMap.put(3, "Geeks");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hashMap.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
