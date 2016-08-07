package com.example.rosemberg.consultasbiblicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Gloria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gloria);
    }

    public void voltar8(View view){
        Intent voltar = new Intent(this, TelaPrincipal.class);
        startActivity(voltar);
    }
}
