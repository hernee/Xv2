package com.example.hernee.x;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseOpenHelper extends SQLiteOpenHelper {

    private final static  String databaseName = "DBPedido";
    private final static int    databaseVersion = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, databaseName, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDB) {
        String SQLcreateCliente = "CREATE TABLE cliente " +
                "(cliente_id integer primary key autoincrement, " +
                "nombre text not null);";
        sqLiteDB.execSQL(SQLcreateCliente);

/*        String SQLcreateMaterial = "CREATE TABLE material " +
                "(material_id integer primary key autoincrement, " +
                "descripcion text not null);";
        sqLiteDB.execSQL(SQLcreateMaterial);

        String SQLcreateArticulo = "CREATE TABLE articulo " +
                "(articulo_id integer primary key autoincrement, " +
                "descripcion text not null);";
        sqLiteDB.execSQL(SQLcreateArticulo);

        String SQLcreateColor = "CREATE TABLE color " +
                "(color_id integer primary key autoincrement, " +
                "descripcion text not null);";
        sqLiteDB.execSQL(SQLcreateColor);
        */
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDB, int oldVersion, int newVersion) {
        sqLiteDB.execSQL("DROP TABLE IF EXISTS cliente");
        onCreate(sqLiteDB);
    }
}
