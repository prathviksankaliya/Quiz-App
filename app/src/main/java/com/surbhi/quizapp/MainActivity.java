package com.surbhi.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.surbhi.quizapp.databinding.ActivityMainBinding;
import com.surbhi.quizapp.spf.SpfManager;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private SpfManager spfManager;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        spfManager = new SpfManager(this);
        String userName = spfManager.getPref().getString("userName", null);
        binding.txUserName.setText(userName);


        binding.crMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                intent.putExtra("SubjectName", "Maths");
                startActivity(intent);
            }
        });
        binding.crScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                intent.putExtra("SubjectName", "Science");
                startActivity(intent);
            }
        });
        binding.crJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                intent.putExtra("SubjectName", "Java");
                startActivity(intent);
            }
        });
        binding.crClang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                intent.putExtra("SubjectName", "CLang");
                startActivity(intent);
            }
        });
        binding.crOops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                intent.putExtra("SubjectName", "OOPS");
                startActivity(intent);
            }
        });

    }
}