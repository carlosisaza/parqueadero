package com.example.parqueadero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        Button registrarPago = findViewById(R.id.registrarPago);
        registrarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Exito.class);
                startActivityForResult(intent, 0);
            }
        });

        Button menuPago = findViewById(R.id.menuPago);
        menuPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button salirPago = findViewById(R.id.salirPago);
        salirPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Login.class);
                startActivityForResult(intent, 0);
            }
        });

        Button modificarPago = findViewById(R.id.modificarPago);
        modificarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Modificar.class);
                startActivityForResult(intent, 0);
            }
        });

        Button eliminarPago = findViewById(R.id.eliminarPago);
        eliminarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Eliminar.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}