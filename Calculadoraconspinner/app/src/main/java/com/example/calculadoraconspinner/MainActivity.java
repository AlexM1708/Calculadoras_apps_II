package com.example.calculadoraconspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView Resultado;
    Spinner spinnerOperacion;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Resultado = findViewById(R.id.Resultado);
        spinnerOperacion = findViewById(R.id.spinnerOperacion);
        btnCalcular = findViewById(R.id.btnCalcular);

        String[] operaciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, operaciones);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerOperacion.setAdapter(adapter);

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double resultado = 0;

                String operacion = spinnerOperacion.getSelectedItem().toString();

                if(operacion.equals("Sumar")){
                    resultado = n1 + n2;
                }

                if(operacion.equals("Restar")){
                    resultado = n1 - n2;
                }

                if(operacion.equals("Multiplicar")){
                    resultado = n1 * n2;
                }

                if(operacion.equals("Dividir")){
                    resultado = n1 / n2;
                }

                Resultado.setText("Resultado: " + resultado);

            }
        });

    }
}