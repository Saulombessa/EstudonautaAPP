package com.example.estudonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Cursos extends AppCompatActivity {
    //Criando uma "intenção" para colocar a intenção de abrir um navegador.
    Intent navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }

    public void clickVoltar(View view) {
        finish();
    }

    public void clickPortugol(View view) {
        // usando o intent para ao clicar na imagem, abrir o navegador.
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }

    public void clickC(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }

    public void clickAndroid(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }

    public void clickPhp(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }

    public void clickCsharp(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }

    public void clickKotlin(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }

    public void clickVideo(View view) {
        navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(navegador);
    }
}