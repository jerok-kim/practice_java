package mgs_lecture.ch13.wrapper;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(15);  // 박싱
        int n = num.intValue();  // 언박싱
        System.out.println(n);

        Character ch = 'X';
        char c = ch;
        System.out.println(c);

        Integer num1 = Integer.valueOf(7);
        Integer num2 = Integer.valueOf(3);

        int int1 = num1.intValue();
        int int2 = num2.intValue();

        Integer result1 = num1 + num2;
        Integer result2 = int1 - int2;
    }
}
