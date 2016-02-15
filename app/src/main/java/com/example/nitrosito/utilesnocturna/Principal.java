package com.example.nitrosito.utilesnocturna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by nitrosito on 15/02/16.
 */
public class Principal extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);
        View calc_estrellas = findViewById(R.id.calc_estrellas);
        calc_estrellas.setOnClickListener(this);
    }

    public void onClick(View estrellas_pulsado) {
        startActivity(new Intent(Principal.this,Estrellas.class));
    }
}
