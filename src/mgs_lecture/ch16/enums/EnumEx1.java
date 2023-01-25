package mgs_lecture.ch16.enums;

enum Colors {RED, ORANGE, YELLOW, GREEN, BLUE}

public class EnumEx1 {
    public static void main(String[] args) {
        Colors[] arr = Colors.values();
        for (Colors rb : arr) {
            System.out.println(rb);
        }
        System.out.println("-----------");
        Colors cols = Colors.valueOf("GREEN");
        System.out.println(cols);
    }
}
