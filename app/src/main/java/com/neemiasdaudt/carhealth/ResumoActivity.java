package com.neemiasdaudt.carhealth;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.neemiasdaudt.carhealth.Models.Abastecimentos;
import com.neemiasdaudt.carhealth.Repository.AbastecimentosDAO;

import java.util.List;

public class ResumoActivity extends Activity {

    private ListView listAbastecimentos;
    private AbastecimentosDAO dao;
    private List<Abastecimentos> abastecimentos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);


        listAbastecimentos=findViewById(R.id.listAbast);
        dao = new AbastecimentosDAO(this);
        abastecimentos = dao.obterTodos();
        ArrayAdapter<Abastecimentos> adaptador = new ArrayAdapter<Abastecimentos>(this, android.R.layout.simple_list_item_1, abastecimentos);
        listAbastecimentos.setAdapter(adaptador);
    }
}
