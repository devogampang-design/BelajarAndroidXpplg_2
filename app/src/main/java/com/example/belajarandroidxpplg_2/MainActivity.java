package com.example.belajarandroidxpplg_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edUsername;
    EditText edPassword;
    Button btnLogin,btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        String savedUser = prefs.getString("Username", null);

        if (savedUser != null){
            Intent intent = new Intent(MainActivity.this, Skeleton.class);
            startActivity(intent);
            finish();
            return;
        }

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();

                if (username.equals("Admin") && password.equals("Admin")) {

                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("username", username);
                    editor.apply();

                    Toast.makeText(MainActivity.this, "sukses login", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, ListSiswa.class);
                    intent.putExtra("username", username);
                    // others intent put extras
                    finish();
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "username atau password salah", Toast.LENGTH_SHORT).show();
                }

            }

        });
        btnRegister.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
        });
    }
}