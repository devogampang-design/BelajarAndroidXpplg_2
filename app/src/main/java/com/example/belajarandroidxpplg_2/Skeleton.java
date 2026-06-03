package com.example.belajarandroidxpplg_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Skeleton extends AppCompatActivity {

    TextView tvsplashscreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skeleton);

        tvsplashscreen = findViewById(R.id.tvsplashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ;
        SharedPreferences prefs = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        String username = prefs.getString("username", "Guest");


                if (!username.equals("")) {

                    Intent intent = new Intent(Skeleton.this, Menu.class);
                    startActivity(intent);
                } else {

                    Intent intent = new Intent(Skeleton.this,MainActivity.class);
                    startActivity(intent);
                }

                finish();
            }
        }, 2000);
    }
}

