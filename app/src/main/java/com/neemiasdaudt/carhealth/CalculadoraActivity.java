package com.neemiasdaudt.carhealth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends Activity implements View.OnClickListener {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        //Recuperação dos Itens
        precoAlcool = findViewById(R.id.edPrecoAlcool);
        precoGasolina = findViewById(R.id.edPrecoGasolina);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        //Recuperação dos Valores
        String txtPrecoAlcool = precoAlcool.getText().toString();
        String txtPrecoGasolina = precoGasolina.getText().toString();
        //Conversão para números
        Double valorAlcool = Double.parseDouble(txtPrecoAlcool);
        Double valorGasolina = Double.parseDouble(txtPrecoGasolina);

        double res = valorAlcool / valorGasolina;

        if (res <= 0.7)
        {
            resultado.setText("É melhor utilizar o Álcool!");
        }
        else
        {
            resultado.setText("É melhor utilizar a Gasolina!");
        }
    }

}
