package com.example.esteticafinal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
public class Home extends AppCompatActivity {
    public TextView nomusuario;
    public ImageButton agendar;

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        agendar=findViewById(R.id.agenda);
//agrege esto, para que tome el nombre del usuario
        nomusuario= findViewById(R.id.nomusuario);
        SharedPreferences sharedPref = this.getSharedPreferences("usuario", Context.MODE_PRIVATE);
        String nombre = sharedPref.getString(getString(R.string.usr), "");
        nomusuario.setText("BIENVENID@" + nombre);
    }
    //metodos para dirigir a los boton a su clase correspondiente
    public void agendar(View view){
        Intent intentt=new Intent(this,RealizarCita.class);
        startActivity(intentt);
    }
    public void citas(View view){
        Intent intent=new Intent(this,ver_citas.class);
        startActivity(intent);
    }
    public void mapa(View view){
        Intent intent=new Intent(this,mapas.class);
        startActivity(intent);
    }
    public  void galeria (View view){
        Intent intent=new Intent(this,galeria.class);
        startActivity(intent);
    }
    public void salir (View view){
        Intent intent=new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}