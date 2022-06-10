package com.example.comabemempreendimento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Compraroleo extends AppCompatActivity {


    private AppCompatButton buttonoleovoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_ComabemEmpreendimento);
        setContentView(R.layout.activity_compraroleo);
        getSupportActionBar().hide();
        iniciarcomponentes();

        buttonoleovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Compraroleo.this , MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }

    public void iniciarcomponentes(){
        buttonoleovoltar = findViewById(R.id.buttonoleovoltar);
    }

}