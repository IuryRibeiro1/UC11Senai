package com.example.comabemempreendimento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraitncarne, constraintleite, constraintalface, constraintoleo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.Theme_ComabemEmpreendimento);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        constraitncarne = findViewById(R.id.constraintcarne);
        constraintleite = findViewById(R.id.constraintleite);
        constraintalface = findViewById(R.id.constraintalface);
        constraintoleo = findViewById(R.id.constraintoleo);

        constraitncarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Comprarcarne.class);
                startActivity(intent);
                finish();
            }
        });


        constraintleite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , Comprarleite.class);
                startActivity(intent);
                finish();

            }
        });

        constraintalface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , Compraralface.class);
                startActivity(intent);
                finish();

            }
        });

        constraintoleo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , Compraroleo.class);
                startActivity(intent);
                finish();

            }
        });

    }
}