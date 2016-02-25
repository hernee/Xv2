package com.example.hernee.x;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Button;

import java.util.ArrayList;


public class PedidoAlta extends ActionBarActivity {
    AutoCompleteTextView autocompletetextview;

    String[] arr;
    ArrayList arrL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_alta);



        this.cargarAutocompletar();

        /*AutoCompleteTextView autocomplete = (AutoCompleteTextView) findViewById(R.id.autoCliente);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,arr);

        autocomplete.setThreshold(2);
        autocomplete.setAdapter(adapter);
*/

        Button buttonBuscarCliente = (Button) findViewById(R.id.btnBuscarCliente);
        buttonBuscarCliente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*
                AutoCompleteTextView autocomplete = (AutoCompleteTextView) findViewById(R.id.autoCliente);
                autocomplete.getText();
                DatabaseAdapter databaseAdapter = new DatabaseAdapter(getApplicationContext());
                databaseAdapter.open();

                databaseAdapter.createRecord(autocomplete.getText().toString());
                databaseAdapter.close();
                Log.i("DayTwentyFourActivity", "database done");
                */
            }
        });

        Button buttonListaClientes = (Button) findViewById(R.id.btnListaClientes);
        buttonListaClientes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ClienteAlta.class));
                //finish();
            }
        });

        //btnBuscarCliente
    }

    private void cargarAutocompletar()
    {
        /*
        DatabaseAdapter databaseAdapter = new DatabaseAdapter(getApplicationContext());
        databaseAdapter.open();
        ArrayList<String> records = databaseAdapter.fetchAllRecords();
        if (records.size() > 0) {
            arr=new String[records.size()];
            for(int i=0;i<records.size();i++)
            {
                arr[i]=records.get(i);
            }
            AutoCompleteTextView autocomplete = (AutoCompleteTextView) findViewById(R.id.autoCliente);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,arr);

            autocomplete.setThreshold(2);
            autocomplete.setAdapter(adapter);

        }
        databaseAdapter.close();
        */
    }
}
