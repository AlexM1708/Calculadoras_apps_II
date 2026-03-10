package com.example.calculadoraconactividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

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

        Intent intent = new Intent(this, ResultadoActivity.class);

        intent.putExtra("num1", n1);
        intent.putExtra("num2", n2);

        if(v.getId() == R.id.btnSumar){
            intent.putExtra("operacion", "sumar");
        }

        if(v.getId() == R.id.btnRestar){
            intent.putExtra("operacion", "restar");
        }

        if(v.getId() == R.id.btnMultiplicar){
            intent.putExtra("operacion", "multiplicar");
        }

        if(v.getId() == R.id.btnDividir){
            intent.putExtra("operacion", "dividir");
        }

        startActivity(intent);
    }
}