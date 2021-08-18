package com.example.cronometro;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import com.example.cronometro.databinding.ActivityMain3Binding;

public class MainActivity3 extends Activity {
    private TextView mTextView;
    private Button btnReg;
    private ActivityMain3Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnReg = binding.btnreg;
        mTextView = binding.txtresp;

        Bundle bundle = getIntent().getExtras();
        int listo = bundle.getInt("Acerto");
        if (listo == 1){
            mTextView.setText("Very good, the answer was correct");
        }else{
            mTextView.setText("Too bad, the answer was wrong");
        }

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}