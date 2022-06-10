package com.example.comabemempreendimento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Comprarleite extends AppCompatActivity {

    private AppCompatButton buttonleitevoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_ComabemEmpreendimento);
        setContentView(R.layout.activity_comprarleite);
        getSupportActionBar().hide();
        iniciarcomponentes();

        buttonleitevoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Comprarleite.this , MainActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }

    public void iniciarcomponentes(){
        buttonleitevoltar = findViewById(R.id.buttonleitevoltar);
    }

}