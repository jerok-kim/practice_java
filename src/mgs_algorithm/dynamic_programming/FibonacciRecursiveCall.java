package mgs_algorithm.dynamic_programming;

public class FibonacciRecursiveCall {
    public Integer fibonacci(Integer n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
