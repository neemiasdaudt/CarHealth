package com.neemiasdaudt.carhealth.Repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.neemiasdaudt.carhealth.Models.Abastecimentos;

import java.util.ArrayList;
import java.util.List;

public class AbastecimentosDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public AbastecimentosDAO (Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Abastecimentos abast){
        ContentValues values = new ContentValues();
        values.put("odometro", abast.getOdometro());
        values.put("preco", abast.getPreco());
        values.put("total", abast.getTotal());
        values.put("litros", abast.getLitros());
        values.put("observ", abast.getObserv());
        return banco.insert("abastecimentos", null, values);
    }

    public List<Abastecimentos> obterTodos(){
        List<Abastecimentos> abastecimentos = new ArrayList<>();
        Cursor cursor = banco.query("abastecimentos",new String[]{"odometro","preco","total","litros","_id"},
                null,null,null,null,null);
        while (cursor.moveToNext()){
            Abastecimentos ab = new Abastecimentos();
            ab.setId(cursor.getInt(0));
            ab.setPreco(cursor.getString(1));
            ab.setTotal(cursor.getString(2));
            ab.setLitros(cursor.getString(3));
            abastecimentos.add(ab);
        }
        return abastecimentos;

    }

}
