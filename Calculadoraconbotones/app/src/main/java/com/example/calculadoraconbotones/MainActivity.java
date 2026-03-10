package com.example.calculadoraconbotones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    TextView Resultado;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Resultado = findViewById(R.id.Resultado);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());

        double resultado = 0;

        if(v.getId() == R.id.btnSumar){
            resultado = n1 + n2;
        }

        if(v.getId() == R.id.btnRestar){
            resultado = n1 - n2;
        }

        if(v.getId() == R.id.btnMultiplicar){
            resultado = n1 * n2;
        }

        if(v.getId() == R.id.btnDividir){
            resultado = n1 / n2;
        }

        Resultado.setText("Resultado: " + resultado);
    }
}