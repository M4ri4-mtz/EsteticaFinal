package com.example.esteticafinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esteticafinal.untils.AdminSQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {
    EditText usr, contraseña; //campos a llenar
    ImageButton  btn_tik,btn_face,btn_tw,btn_insta;
    String _url1="https://www.tiktok.com/login?redirect_url=https%3A%2F%2Fwww.tiktok.com%2Fupload%3Flang%3Des&lang=es";
    String _url2="https://www.facebook.com";
    String _url3="https://twitter.com/iniciarsesion?lang=es";
    String _url4="https://www.instagram.com/accounts/login/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr = (EditText) findViewById(R.id.usr);
        contraseña = (EditText) findViewById(R.id.password);
        btn_tik=findViewById(R.id.tik);
        btn_face=findViewById(R.id.f);
        btn_tw=findViewById(R.id.t);
        btn_insta=findViewById(R.id.i);
        btn_tik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _Link1= Uri.parse(_url1);
                Intent i=new Intent(Intent.ACTION_VIEW, _Link1);
                startActivity(i);
            }
        });
        btn_face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _Link2= Uri.parse(_url2);
                Intent i2=new Intent(Intent.ACTION_VIEW, _Link2);
                startActivity(i2);
            }
        });
        btn_tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _Link3= Uri.parse(_url3);
                Intent i3=new Intent(Intent.ACTION_VIEW, _Link3);
                startActivity(i3);
            }
        });
        btn_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _Link4= Uri.parse(_url4);
                Intent i3=new Intent(Intent.ACTION_VIEW, _Link4);
                startActivity(i3);
            }
        });
    }
    //boton para validacion
    public void Login(View view) {
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"bd_usuarios",null,1);
        String u=usr.getText().toString();
        String p=contraseña.getText().toString();
        if (TextUtils.isEmpty(u) || TextUtils.isEmpty(p))
            Toast.makeText(MainActivity.this,"contraseña u usuario incorrecto", Toast.LENGTH_SHORT).show();
        else{
            Boolean validacion =admin.validacionpass(u,p);
            if (validacion==true){
                Toast.makeText(MainActivity.this,"inicio correcto", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(this,Home.class);
                startActivity(intent);
            }
        }
    }
    public  void Registro(View view){
        Intent intent= new Intent(this,Registro.class);
        startActivity(intent);
    }


}