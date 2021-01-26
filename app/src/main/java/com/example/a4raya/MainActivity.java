package com.example.a4raya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jugar(View view){
        Intent partida = new Intent (this, partida.class);
        startActivity(partida);
    }

    public void Contacto(View view){
        Intent contacto = new Intent (this, contacto.class);
        startActivity(contacto);
    }
}
