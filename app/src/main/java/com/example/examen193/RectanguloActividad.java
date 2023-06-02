package com.example.examen193;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RectanguloActividad extends AppCompatActivity {

    private TextView lblPerimetro,
                     lblArea,
                     lblNombre;

    private Button btnCalcular,
                   btnLimpiar,
                   btnRegresar;

    private EditText txtBase,
                     txtAltura;

    private Rectangulo rectangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo_actividad);

        lblPerimetro = findViewById(R.id.lblPerimetro);
        lblArea = findViewById(R.id.lblArea);
        lblNombre = findViewById(R.id.lblNombre);

        txtBase = findViewById(R.id.txtBase);
        txtAltura = findViewById(R.id.txtAltura);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnRegresar = findViewById(R.id.btnRegresar);

        rectangulo = new Rectangulo();
        lblNombre.setText( lblNombre.getText().toString() + getIntent().getStringExtra("nombre"));


        btnCalcular.setOnClickListener(v -> {
            if(txtBase.getText().toString().matches("") && txtAltura.getText().toString().matches("")){
                Toast.makeText(this, "Favor de ingresar valores valios", Toast.LENGTH_SHORT).show();
            }
            else{
                lblPerimetro.setText("Perimetro: ");
                lblArea.setText("Area: ");

                rectangulo.setBase(Integer.parseInt(txtBase.getText().toString()));
                rectangulo.setAltura(Integer.parseInt(txtAltura.getText().toString()));
                lblPerimetro.setText(lblPerimetro.getText().toString() + rectangulo.calcularPer());
                lblArea.setText(lblArea.getText().toString() + rectangulo.calcularArea());
            }
        });

        btnLimpiar.setOnClickListener(v -> {
            txtBase.setText("");
            txtAltura.setText("");
            lblPerimetro.setText("Perimetro: ");
            lblArea.setText("Area: ");
        });

        btnRegresar.setOnClickListener(v -> finish());
    }
}