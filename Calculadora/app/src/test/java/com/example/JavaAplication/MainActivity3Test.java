package com.example.JavaAplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivity3Test {

    @Test
    public void calcularFactorial() {
        Test_FactorialYFibonacci test = new Test_FactorialYFibonacci();
        int resultado = (int) test.calcularFactorial(5);
        assertEquals(120, resultado);
        System.out.println(resultado);
    }
    @Test
    public void calcularMetodoFibonacci() {
        Test_FactorialYFibonacci test = new Test_FactorialYFibonacci();
        int resultado = test.calcularMetodoFibonacci(2);
        assertEquals(2, resultado);
        System.out.println(resultado);
    }

    @Test
    public void fibonacci() {
        Test_FactorialYFibonacci test = new Test_FactorialYFibonacci();
        int resultado = test.fibonacci(10);
        assertEquals(55, resultado);
        System.out.println(resultado);
    }
}