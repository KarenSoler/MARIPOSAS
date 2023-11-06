package com.example.mariposas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mariposas.entidades.Butter;
import com.google.android.material.internal.EdgeToEdgeUtils;

public class Resultado extends AppCompatActivity {
    private TextView datos;
    private TextView etPagoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        this.datos = findViewById(R.id.tvResultado);
        this.etPagoTotal = findViewById(R.id.tvResultado);



        recibir();
    }
    public void recibir(){
        Bundle recibirDatos = getIntent().getExtras();
        if (recibirDatos != null){
            Butter butter ;
            butter = (Butter) recibirDatos.get("objeto");
            double pago = (double) recibirDatos.get("pago");
            datos.setText("Datos de la Mariposa: "+butter+"El total a pagar es: "+pago);

            this.etPagoTotal.setText(("El pago es"+pago).toCharArray() ,0,0);





        }
    }
}