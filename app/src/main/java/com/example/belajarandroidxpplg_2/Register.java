package com.example.belajarandroidxpplg_2;

import android.content.Intent; // Tambahkan import ini
import android.os.Bundle;
import android.widget.Button;   // Tambahkan import ini
import android.widget.EditText; // Tambahkan import ini

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    EditText nama, email, alamat, nomerWA, password, confirm_password;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        nama = findViewById(R.id.ednama);
        email = findViewById(R.id.edemail);
        alamat = findViewById(R.id.edalamat);
        nomerWA = findViewById(R.id.ednomerWA);
        password = findViewById(R.id.edpassword);
        confirm_password = findViewById(R.id.edconfirm_password);
        btnregister = findViewById(R.id.btnregister);

        btnregister.setOnClickListener(v -> {
            Intent intent = new Intent(Register.this, Confirm_register.class);

            intent.putExtra("key_nama", nama.getText().toString());
            intent.putExtra("key_email", email.getText().toString());
            intent.putExtra("key_alamat", alamat.getText().toString());
            intent.putExtra("key_wa", nomerWA.getText().toString());
            intent.putExtra("key_password", password.getText().toString());
            intent.putExtra("key_confirm", confirm_password.getText().toString());

            startActivity(intent);
        });
    }
}