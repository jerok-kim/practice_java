package mgs_online.ch01_java_basic;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);
    }
}
