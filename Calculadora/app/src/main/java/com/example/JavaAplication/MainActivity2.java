package com.example.JavaAplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Numero;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Numero = findViewById(R.id.Numero);
        Resultado = findViewById(R.id.resultadoFac);
        Button btnFactorial = findViewById(R.id.GotoFactorial);

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularFactorial();
            }
        });
    }

    public void mostrarAlerta(String titulo, String mensaje) {
        AlertDialog.Builder Estructura = new AlertDialog.Builder(this);
        Estructura.setTitle(titulo)
                .setMessage(mensaje)
                .setPositiveButton("Aceptar", null);

        AlertDialog alert = Estructura.create();
        alert.show();
    }

    public void calcularFactorial() {
        String input = Numero.getText().toString();

        if (input.isEmpty()) {
            mostrarAlerta("Error", "Por favor, ingresa un número primero.");
        } else {
            int valor = Integer.parseInt(input);
            long resultado = calcularFactorial(valor);

            if (resultado == -1) {
                Resultado.setText("No se puede calcular el factorial de un número negativo.");
            } else {
                Resultado.setText("El factorial de " + valor + " es: " + resultado);
            }
        }
    }

    public long calcularFactorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public void Volver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
