package mgs_online.ch01_java_basic;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int age = 7;

        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        } else {
            System.out.println("학교에 다니지 않습니다");
        }
    }
}