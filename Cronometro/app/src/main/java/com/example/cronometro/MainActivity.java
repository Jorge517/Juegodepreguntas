package com.example.cronometro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.cronometro.databinding.ActivityMainBinding;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends Activity {

    private Button btnIng;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //mTextView = binding.txtJoke;
        //btnDecirChiste = binding.btnDecirChiste;
        btnIng = binding.btning;

        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}