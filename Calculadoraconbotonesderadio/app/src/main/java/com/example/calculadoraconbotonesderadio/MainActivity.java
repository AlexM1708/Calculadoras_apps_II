package com.example.calculadoraconbotonesderadio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView Resultado;
    RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Resultado = findViewById(R.id.Resultado);

        rbSumar = findViewById(R.id.rbSumar);
        rbRestar = findViewById(R.id.rbRestar);
        rbMultiplicar = findViewById(R.id.rbMultiplicar);
        rbDividir = findViewById(R.id.rbDividir);

        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double resultado = 0;

                if(rbSumar.isChecked()){
                    resultado = n1 + n2;
                }

                if(rbRestar.isChecked()){
                    resultado = n1 - n2;
                }

                if(rbMultiplicar.isChecked()){
                    resultado = n1 * n2;
                }

                if(rbDividir.isChecked()){
                    resultado = n1 / n2;
                }

                Resultado.setText("Resultado: " + resultado);

            }
        });

    }
}