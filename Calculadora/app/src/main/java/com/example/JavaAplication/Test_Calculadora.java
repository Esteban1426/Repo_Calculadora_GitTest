package com.example.JavaAplication;

public class Test_Calculadora {

    public int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int resta(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int dividir(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return valor1 / valor2;
    }

    public long potenciar(long base, long exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser positivo o cero");
        }

        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
