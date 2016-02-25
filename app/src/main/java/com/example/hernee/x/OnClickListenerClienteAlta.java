package com.example.hernee.x;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OnClickListenerClienteAlta implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        final Context context = view.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.input_form_cliente, null, false);
        final EditText editTextNombre = (EditText) formElementsView.findViewById(R.id.txtNombre);

        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Crear Cliente")
                .setPositiveButton("Add",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String Nombre = editTextNombre.getText().toString();


                                ObjetoCliente oCliente = new ObjetoCliente();
                                oCliente.nombre= Nombre;
                                boolean createSuccessful = new TablaControllerCliente(context).create(oCliente);
                                if(createSuccessful){
                                    Toast.makeText(context, "El cliente fue guardado.", Toast.LENGTH_SHORT).show();
                                }else{
                                    Toast.makeText(context, "No se pudo guardar al cliente.", Toast.LENGTH_SHORT).show();
                                }
                                ((ClienteAlta) context).readRecords();

                                dialog.cancel();
                            }
                        }).show();
    }
}
