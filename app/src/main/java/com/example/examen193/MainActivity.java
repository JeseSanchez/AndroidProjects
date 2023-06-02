package com.example.examen193;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnEntrar,
                   btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSalir = findViewById(R.id.btnSalir);

        btnEntrar.setOnClickListener(v ->{
            if(txtNombre.getText().toString().matches("")){
                Toast.makeText(this, "Favor de ingresar un nombre", Toast.LENGTH_SHORT).show();
            }
            else{
                startActivity(new Intent(this, RectanguloActividad.class)
                                        .putExtra("nombre", txtNombre.getText().toString()));
            }
        });

        btnSalir.setOnClickListener(v -> finishAndRemoveTask());
    }
}