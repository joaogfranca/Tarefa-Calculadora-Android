package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void somar(View view){
        int valor1 = Integer.parseInt(txtNumero1.getText().toString());
        int valor2 = Integer.parseInt(txtNumero2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view){
        int valor1 = Integer.parseInt(txtNumero1.getText().toString());
        int valor2 = Integer.parseInt(txtNumero2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void dividir(View view){
        int valor1 = Integer.parseInt(txtNumero1.getText().toString());
        int valor2 = Integer.parseInt(txtNumero2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 / valor2));
    }

    public void multiplicar(View view){
        int valor1 = Integer.parseInt(txtNumero1.getText().toString());
        int valor2 = Integer.parseInt(txtNumero2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 * valor2));
    }
}