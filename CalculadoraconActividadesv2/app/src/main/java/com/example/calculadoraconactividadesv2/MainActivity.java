package com.example.calculadoraconactividadesv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        Intent intent = new Intent(this, SumaActivity.class);
        Intent intent2 = new Intent(this, RestaActivity.class);
        Intent intent3 = new Intent(this, MultiplicacionActivity.class);
        Intent intent4 = new Intent(this, DivisionActivity.class);

        double resultado = 0;

        if(v.getId() == R.id.btnSumar){
            startActivity(intent);
        }

        if(v.getId() == R.id.btnRestar){
            startActivity(intent2);
        }

        if(v.getId() == R.id.btnMultiplicar){
            startActivity(intent3);
        }

        if(v.getId() == R.id.btnDividir){
            startActivity(intent4);
        }

    }
}