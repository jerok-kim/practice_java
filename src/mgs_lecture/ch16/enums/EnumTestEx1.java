package mgs_lecture.ch16.enums;

enum Color {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

public class EnumTestEx1 {
    public static void main(String[] args) {
        Color[] arr = Color.values();
        for (Color c : arr) {
            System.out.println(c);
        }

        Color cs = Color.valueOf("GREEN");
        System.out.println(cs);

        int idx = Color.YELLOW.ordinal();
        System.out.println(idx);
    }
}
