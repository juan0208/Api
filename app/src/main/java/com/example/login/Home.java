package com.example.login;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView nombre;
    TextView contra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nombre = findViewById(R.id.infoNombre);
        contra = findViewById(R.id.infoContra);

        Bundle recibeDatos = getIntent().getExtras();
        String info = recibeDatos.getString("Datousuario"); // recojemos los datos
        nombre.setText(info);

        String cont = recibeDatos.getString("Datocontra"); // recojemos los datos
        contra.setText(cont);


    }

    public void volver(View h){
        Intent ir =  new Intent(Home.this, MainActivity.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);
    }

    public void Api(View h){
        Intent ir =  new Intent(Home.this, Api.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);
    }
}