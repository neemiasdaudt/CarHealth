package com.neemiasdaudt.carhealth.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final  String name = "carHealth.db";
    private static final int version = 1;

    public Conexao(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table abastecimentos( id integer primary key autoincrement," +
                    "odometro TEXT, preco TEXT, total TEXT," +
                    "litros TEXT, observ TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
