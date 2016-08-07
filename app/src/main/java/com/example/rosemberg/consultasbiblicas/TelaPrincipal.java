package com.example.rosemberg.consultasbiblicas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPrincipal extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaprincipal);
    }

    public void irParaAflicao(View view){
        Intent aflicao = new Intent(this, Aflicao.class);
        startActivity(aflicao);
    }

    public void irParaAlrgria(View view){
        Intent alegria = new Intent(this, Alegria.class);
        startActivity(alegria);
    }

    public void irParaBencao(View view){
        Intent bencao = new Intent(this, Bencao.class);
        startActivity(bencao);
    }

    public void irParaCura(View view){
        Intent cura = new Intent(this, Cura.class);
        startActivity(cura);
    }

    public void irParaDescanso(View view){
        Intent descanso = new Intent(this, Descanso.class);
        startActivity(descanso);
    }

    public void irParaEsperanca(View view){
        Intent esperanca = new Intent(this, Esperanca.class);
        startActivity(esperanca);
    }

    public void irParaFe(View view){
        Intent fe = new Intent(this, Fe.class);
        startActivity(fe);
    }

    public void irParaGloria(View view){
        Intent gloria = new Intent(this, Gloria.class);
        startActivity(gloria);
    }

    public void irParaLibertacao(View view){
        Intent libertacao = new Intent(this, Libertacao.class);
        startActivity(libertacao);
    }
}
