package com.example.comabemempreendimento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.BitSet;

public class Comprarcarne extends AppCompatActivity {

    private TextView textpicanha, textvalorpicanha;
    private ImageView Imageviewum, Imageviewdois, Imageviewtres, Imageviewquatro;
    private AppCompatButton buttoncarnevoltar, buttoncomprarpicanha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_ComabemEmpreendimento);
        setContentView(R.layout.activity_comprarcarne);
        getSupportActionBar().hide();
        iniciarcomponentes();
        Imageviewum = findViewById(R.id.imageviewum);

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
        }


        buttoncarnevoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Comprarcarne.this , MainActivity.class);
                startActivity(intent);
                finish();
                imageFoto();

            }
        });

    }


    public void imageFoto(){

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent , 1);

    }

    public void iniciarcomponentes(){
        textpicanha = findViewById(R.id.textpicanha);
        textvalorpicanha = findViewById(R.id.textvalorpicanha);
        buttoncomprarpicanha = findViewById(R.id.buttoncomprarpicanha);
        buttoncarnevoltar = findViewById(R.id.buttoncarnevoltar);

    }

    @Override
    protected void onActivityResult (int requestCode ,int resultCode , Intent data ){
        if(requestCode == 1 && resultCode == RESULT_OK);
        Bundle extras = data.getExtras();
        Bitmap imagem = (Bitmap) extras.get("data");
        Imageviewum.setImageBitmap(imagem);

        super.onActivityResult(requestCode , resultCode, data);
    }



}