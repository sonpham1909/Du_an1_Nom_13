package com.example.duan1_nhom13;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnget = findViewById(R.id.btngetst);
        SharedPreferences sharedPreferences = getSharedPreferences("thongtin", MODE_PRIVATE);
        String loginsc = sharedPreferences.getString("user","");


            btnget.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, login.class);

                    startActivity(intent);


                }
            });
        }

}