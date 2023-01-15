package mgs_algorithm.space_complexity;

public class FactorialTest {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.factorialFunc(5);
        System.out.println(result);
    }
}

class Factorial {
    public int factorialFunc(int n) {
        if (n > 1) {
            return n * factorialFunc(n - 1);
        } else {
            return 1;
        }
    }
}