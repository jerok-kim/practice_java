package mgs_online.ch01;

public class BitTest {
    public static void main(String[] args) {
        int num1 = 5;   // 0000 0101
        int num2 = 10;  // 0000 1010

        System.out.println(num1 | num2);  // 0000 1111 = 15
        System.out.println(num1 & num2);  // 0000 0000 = 0
        System.out.println(num1 ^ num2);  // 0000 1111 = 15
        System.out.println(~num1);        // 1111 1010 = -6

        System.out.println(num1 << 2);    // 0001 0100 = 20
        System.out.println(num1);         // 5
        System.out.println(num1 <<= 2);   // 0001 0100 = 20
        System.out.println(num1);         // 20
    }
}