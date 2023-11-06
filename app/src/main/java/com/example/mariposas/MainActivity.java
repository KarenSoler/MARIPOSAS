package com.example.mariposas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.mariposas.entidades.Butter;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbGusano;
    private RadioButton rbMariposa;
    private EditText nombreMariposa;
    private Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio();
        //3ra forma de asociar un onclick
        btnRegistrar.setOnClickListener(this::totalPago);
    }

    private void irResultado(double pago, Butter butter) {
        Intent result = new Intent(getApplicationContext(), Resultado.class);
        result.putExtra("pago",pago);
        result.putExtra("objeto", butter);
        startActivity(result);
    }
    private void totalPago(View view){
        String tipo = (rbMariposa.isChecked() == true) ? "mariposa" : "gusano";
        Butter butter = new Butter(nombreMariposa.getText().toString(),tipo);
        double resultadoPago = butter.calculoVisita();
        irResultado(resultadoPago, butter);

    }

    private void inicio(){
        this.nombreMariposa = findViewById(R.id.etNombreMariposa);
        this.rbMariposa = findViewById(R.id.rbMariposa);
        this.rbGusano = findViewById(R.id.rbGusano);
        this.btnRegistrar = findViewById(R.id.btnRegistrar);
    }
}