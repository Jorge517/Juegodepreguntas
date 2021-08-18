package com.example.cronometro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cronometro.databinding.ActivityMain2Binding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends Activity {

    private TextView mTextView;
    private Button btnFalse;
    private Button btnTrue;
    private ActivityMain2Binding binding;
    private final List<String> ingles = Arrays.asList(
            "Did the United States steal territory from Mexico?",
            "The United States is not a first-world country?",
            "Bruno Mars was born in the United States?"
    );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.txtpre;

        Random rand = new Random();
        int posicion = rand.nextInt(ingles.size());
        String pregunta = ingles.get(posicion);
        mTextView.setText(pregunta);

        List<Integer> resp = new ArrayList<Integer>();
        resp.add(1);
        resp.add(0);
        resp.add(1);

        btnFalse = binding.btnfalse;
        btnTrue = binding.btntrue;

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int respuesta = resp.get(posicion);
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                if (respuesta == 0){
                    intent.putExtra("Acerto", 1);
                }else {
                    intent.putExtra("Acerto", 2);
                }
                startActivity(intent);
            }
        });
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int respuesta = resp.get(posicion);
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                if (respuesta == 1){
                    intent.putExtra("Acerto", 1);
                }else {
                    intent.putExtra("Acerto", 2);
                }
                startActivity(intent);
            }
        });

    }
}