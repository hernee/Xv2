/*package com.example.hernee.x;

import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAdapter {

    private Context context;
    private SQLiteDatabase database;
    private DatabaseOpenHelper dbHelper;

    public DatabaseAdapter(Context context) {
        this.context = context;
    }

    public DatabaseAdapter open() throws SQLException {
        dbHelper = new DatabaseOpenHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public long createRecord(String text) {
        ContentValues contentValue = new ContentValues();
        contentValue.put("nombre", text);
        return database.insert("cliente", null, contentValue);
    }

    public boolean updateRecord(long rowId, String text) {
        ContentValues contentValue = new ContentValues();
        contentValue.put("nombre", text);
        return database.update("cliente", contentValue, "cliente_id =" + rowId, null) > 0;
    }

    public boolean deleteRecord(long rowId) {
        return database.delete("cliente", "cliente_id =" + rowId, null) > 0;
    }

    public ArrayList<String> fetchAllRecords() {
        Cursor cursor = database.query("cliente", new String[] { "cliente_id", "nombre"},
                null, null, null, null, null);
        ArrayList<String> records = new ArrayList<String>();
        cursor.moveToFirst();
        for (int i = 0; i < cursor.getCount(); i++) {
            records.add(cursor.getString(1));
            cursor.moveToNext();
        }
        cursor.close();
        return records;
    }

    public String fetchRecord(long rowId) throws SQLException {
        Cursor mCursor = database.query(true, "cliente", new String[] { "cliente_id",
                "nombre" }, "cliente_id ="+ rowId, null, null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
            return (mCursor.getString(1));
        }
        return null;
    }
}
*/