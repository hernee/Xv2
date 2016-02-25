package com.example.hernee.x;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hernee on 24/02/2016.
 */
public class TablaControllerCliente extends DatabaseOpenHelper{

    public TablaControllerCliente(Context context) {
        super(context);
    }

    public boolean create(ObjetoCliente objectStudent) {
        ContentValues values = new ContentValues();
        values.put("nombre", objectStudent.nombre);
        SQLiteDatabase db = this.getWritableDatabase();
        boolean createSuccessful = db.insert("cliente", null, values) > 0;
        db.close();

        return createSuccessful;
    }

    public int count() {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "SELECT * FROM cliente";
        int recordCount = db.rawQuery(sql, null).getCount();
        db.close();
        return recordCount;
    }

    public List<ObjetoCliente> read() {

        List<ObjetoCliente> recordsList = new ArrayList<ObjetoCliente>();

        String sql = "SELECT * FROM cliente ORDER BY cliente_id DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("cliente_id")));
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));

                ObjetoCliente oCliente = new ObjetoCliente();
                oCliente.cliente_id = id;
                oCliente.nombre= nombre;


                recordsList.add(oCliente);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;
    }


}
