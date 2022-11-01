package com.ahmetkarakaya.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ahmetkarakaya.recyclerview.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Landmark selected =(Landmark)intent.getSerializableExtra("Landmark");

        binding.imageView.setImageResource(selected.image);
        binding.textView.setText(selected.name);
        binding.textView2.setText(selected.country);

    }
}