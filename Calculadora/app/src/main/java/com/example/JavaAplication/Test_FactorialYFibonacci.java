package com.example.JavaAplication;

public class Test_FactorialYFibonacci {


    public long calcularFactorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public int calcularMetodoFibonacci(int n) {
        StringBuilder sequenceBuilder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            int fib = fibonacci(i);
            sequenceBuilder.append(fib);
            if (i < n) {
                sequenceBuilder.append(", ");
            }
        }
        return n;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}
