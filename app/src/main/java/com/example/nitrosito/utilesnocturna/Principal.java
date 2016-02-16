package com.example.nitrosito.utilesnocturna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nitrosito on 15/02/16.
 */
public class Principal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);
    }


    public void tiempoestrellas(View estrellas_pulsado) {
        startActivity(new Intent(Principal.this, Estrellas.class));
    }

    public void hiperfocal(View estrellas_pulsado) {
        startActivity(new Intent(Principal.this,Hiperfocal.class));

    }
}
