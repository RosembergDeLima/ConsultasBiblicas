package com.example.rosemberg.consultasbiblicas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Esperanca extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esperanca);
    }

    public void voltar6(View view){
        Intent voltar = new Intent(this, TelaPrincipal.class);
        startActivity(voltar);
    }
}
