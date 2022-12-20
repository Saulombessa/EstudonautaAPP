package com.example.estudonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //definindo uma "intenção" com o nome tela
    Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEquipe(View view) {
        // colocando essa "intenção" como "abrir uma tela(activity) pre-definida "
        tela = new Intent(getApplicationContext(), Equipe.class);
        startActivity(tela);
    }

    public void clickCursos(View view) {
        tela = new Intent(getApplicationContext(), Cursos.class);
        startActivity(tela);
    }

    public void clickMidia(View view) {
        tela = new Intent(getApplicationContext(), Midia.class);
        startActivity(tela);
    }
}