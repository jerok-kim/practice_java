package mgs_lecture.ch13.wrapper;

public class UnBoxing {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(20);
        int val1 = i.intValue();
        int val2 = i;
    }
}
