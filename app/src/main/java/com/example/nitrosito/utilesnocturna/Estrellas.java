package com.example.nitrosito.utilesnocturna;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Estrellas extends AppCompatActivity implements View.OnClickListener {
    EditText infmulti;
    EditText indfocal;
    TextView maxtiempo;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testrellas);
        infmulti = (EditText) findViewById(R.id.fmultiplicacion);
        indfocal = (EditText) findViewById(R.id.dfocal);
        maxtiempo = (TextView) findViewById(R.id.maxexpo);
        calcular = (Button) findViewById(R.id.texposicion);
        calcular.setOnClickListener(this);
    }

    public void onClick(View control_pulsado) {
        double multiplicador = Double.valueOf(infmulti.getText().toString());
        double distancia = Double.valueOf(indfocal.getText().toString());
        double res = 500/(multiplicador * distancia);
        String ress = String.valueOf(res);
        maxtiempo.setText(String.format("%.2f", res));
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(control_pulsado.getWindowToken(), 0);
    }

}
