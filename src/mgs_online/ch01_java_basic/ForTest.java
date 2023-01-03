package mgs_online.ch01_java_basic;

public class ForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        int num = 1;
        int total = 0;

        while (num < 10) {
            total += num++;
        }

        System.out.println(total);
    }
}