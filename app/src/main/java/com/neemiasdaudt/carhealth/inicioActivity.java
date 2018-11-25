package com.neemiasdaudt.carhealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button abast = (Button) findViewById(R.id.btnNovoAbast);
        abast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abastActivity = new Intent(inicioActivity.this, CadAbastecimentoActivity.class);
                startActivity(abastActivity);
            }
        });

        Button calc = (Button) findViewById(R.id.btnCalculadora);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calcActivity = new Intent(inicioActivity.this, CalculadoraActivity.class
                );
                startActivity(calcActivity);
            }
        });
    }

}
