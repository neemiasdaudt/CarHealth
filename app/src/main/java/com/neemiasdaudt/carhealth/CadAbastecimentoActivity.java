package com.neemiasdaudt.carhealth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.neemiasdaudt.carhealth.Models.Abastecimentos;
import com.neemiasdaudt.carhealth.Repository.AbastecimentosDAO;

import java.util.Date;

public class CadAbastecimentoActivity extends Activity {

    private EditText odometro;
    private EditText preco;
    private EditText total;
    private EditText litros;
    private EditText observ;
    private AbastecimentosDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_abastecimento);

        odometro = findViewById(R.id.edOdometro);
        preco = findViewById(R.id.edPreco);
        total = findViewById(R.id.edValorTot);
        litros = findViewById(R.id.edLitros);
        observ = findViewById(R.id.edObserv);
        dao = new AbastecimentosDAO(this);

    }

    public void salvar (View view){
        Abastecimentos ab = new Abastecimentos();
        ab.setOdometro(odometro.getText().toString());
        ab.setPreco(preco.getText().toString());
        ab.setTotal(total.getText().toString());
        ab.setLitros(litros.getText().toString());
        ab.setObserv(observ.getText().toString());
        long id = dao.inserir(ab);
        Toast.makeText(this,"Abastecimento gravado!" + id, Toast.LENGTH_SHORT).show();

    }
}
