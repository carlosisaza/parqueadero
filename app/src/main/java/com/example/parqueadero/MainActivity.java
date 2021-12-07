package com.example.parqueadero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button usuario = findViewById(R.id.usuario);
        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Usuario.class);
                startActivityForResult(intent, 0);
            }
        });

        Button registrar = findViewById(R.id.registrar);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Registrar.class);
                startActivityForResult(intent, 0);
            }
        });

        Button entrada = findViewById(R.id.entrada);
        entrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Entrada.class);
                startActivityForResult(intent, 0);
            }
        });

        Button salida = findViewById(R.id.salida);
        salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Salida.class);
                startActivityForResult(intent, 0);
            }
        });

        Button celdas = findViewById(R.id.celdas);
        celdas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Celdas.class);
                startActivityForResult(intent, 0);
            }
        });

        Button pago = findViewById(R.id.pago);
        pago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Pago.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}