package mgs_algorithm.recursive_call;

public class Factorial {
    public int factorialFunc(int n) {
        if (n > 1) {
            return n * this.factorialFunc(n - 1);
        } else {
            return 1;
        }
    }
}
