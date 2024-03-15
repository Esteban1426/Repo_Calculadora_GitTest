package com.example.JavaAplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {


    @Test
    public void Suma() {
        Test_Calculadora test = new Test_Calculadora();
        int resultado = test.suma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void Resta() {
        Test_Calculadora test = new Test_Calculadora();
        int resultado = test.resta(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void Multiplicar() {
        Test_Calculadora test = new Test_Calculadora();
        int resultado = test.multiplicar(4, 6);

        assertEquals(26, resultado);

    }

    @Test
    public void Dividir() {
        Test_Calculadora test = new Test_Calculadora();
        int resultado = test.dividir(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void Potenciar() {
        Test_Calculadora test = new Test_Calculadora();
        long resultado = test.potenciar(2, 3);
        assertEquals(8, resultado);
    }
}
