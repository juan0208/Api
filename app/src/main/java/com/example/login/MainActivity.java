package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Usuario , Contraseña;

    Button ingresar;
    CheckBox termino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText) findViewById(R.id.editText2);
        Contraseña = (EditText) findViewById(R.id.editText);
        ingresar = findViewById(R.id.btnIngresar);
        termino = findViewById(R.id.checkBox2);
    }


    public void Login(View h){
        Bundle enviadatos = new Bundle();
        enviadatos.putString("Datousuario", Usuario.getText().toString());
        enviadatos.putString("Datocontra", Contraseña.getText().toString());

        String usu = Usuario.getText().toString();
        String con =  Contraseña.getText().toString();

        if(termino.isChecked() == false) {
            Toast.makeText(this, "Terminos", Toast.LENGTH_LONG).show();
        }
        if(usu.length() == 0){
            Toast.makeText(this, "Ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(con.length() == 0){
            Toast.makeText(this, "Ingresar una contraseña", Toast.LENGTH_LONG).show();
        }
        if(usu.length() !=0 && con.length()!=0){
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show();
            Intent ir = new Intent( MainActivity.this,  Home.class  );
            ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
            ir.putExtras(enviadatos);
            startActivity(ir);
        }

    }
}