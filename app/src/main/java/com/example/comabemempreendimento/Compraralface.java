package com.example.comabemempreendimento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Compraralface extends AppCompatActivity {

    private AppCompatButton buttonalfacevoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_ComabemEmpreendimento);
        setContentView(R.layout.activity_compraralface);
        getSupportActionBar().hide();
        iniciarcomponentes();


        buttonalfacevoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Compraralface.this , MainActivity.class);
                startActivity(intent);
                finish();


            }
        });


    }

    public void iniciarcomponentes(){
        buttonalfacevoltar = findViewById(R.id.buttonalfacevoltar);

    }

}