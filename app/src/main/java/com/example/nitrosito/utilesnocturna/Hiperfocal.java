package com.example.nitrosito.utilesnocturna;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Hiperfocal extends AppCompatActivity {
    EditText infmulti;
    EditText indfocal;
    TextView resultado;
    EditText diafragma;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiperfocal);
        infmulti = (EditText) findViewById(R.id.fmultiplicacion);
        indfocal = (EditText) findViewById(R.id.dfocal);
        resultado = (TextView) findViewById(R.id.reshiperfocal);
        diafragma = (EditText) findViewById(R.id.diafragma);
    }

    public void calcularHiperfocal(View control_pulsado) {
        double multiplicador = Double.valueOf(infmulti.getText().toString());
        double distancia = Double.valueOf(indfocal.getText().toString());
        double vdiafragma = Double.valueOf(diafragma.getText().toString());
        double circuloconfusion = (0.25 / multiplicador);
        double res = ((distancia*distancia)/(vdiafragma * circuloconfusion))/100;
        resultado.setText(String.format("%.4f", res));
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(control_pulsado.getWindowToken(), 0);
    }

}
