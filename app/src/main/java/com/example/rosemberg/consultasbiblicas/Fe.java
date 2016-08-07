package com.example.rosemberg.consultasbiblicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe);
    }

    public void voltar7(View view){
        Intent voltar = new Intent(this, TelaPrincipal.class);
        startActivity(voltar);
    }
}