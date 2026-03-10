package com.example.calculadoraconactividades;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txtResultado);

        double n1 = getIntent().getDoubleExtra("num1",0);
        double n2 = getIntent().getDoubleExtra("num2",0);
        String operacion = getIntent().getStringExtra("operacion");

        double resultado = 0;

        if(operacion.equals("sumar")){
            resultado = n1 + n2;
        }

        if(operacion.equals("restar")){
            resultado = n1 - n2;
        }

        if(operacion.equals("multiplicar")){
            resultado = n1 * n2;
        }

        if(operacion.equals("dividir")){
            resultado = n1 / n2;
        }

        txtResultado.setText("Resultado: " + resultado);
    }
}