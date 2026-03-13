package com.example.calculadoraconactividadesv2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SumaActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    TextView Resultado;
    Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Resultado = findViewById(R.id.Resultado);

        btnSumar = findViewById(R.id.btnsumita);

        btnSumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());

        double resultado = 0;

        if(v.getId() == R.id.btnsumita){
            resultado = n1 + n2;
        }

        Resultado.setText("Resultado: " + resultado);
    }
}