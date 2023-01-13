package playground;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (inputNumber > count) {
            sum += ++count;
        }

        System.out.println(sum);
    }
}
