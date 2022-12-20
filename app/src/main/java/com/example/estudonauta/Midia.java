package com.example.estudonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Midia extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midia);
        //atribuindo o video view criado no design a variavel.
        video = findViewById(R.id.video);
        // criando um caminho para o video.
        String caminho = "android.resource://com.example.estudonauta/" + R.raw.estudonauta;
        // usando o URI para ir ate o caminho.
        Uri arquivo = Uri.parse(caminho);
        //dando play no video:
        video.setVideoURI(arquivo);
        video.start();
    }

    public void clickVoltar(View view) {
        finish();
    }
}