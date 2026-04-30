package com.example.belajarandroidxpplg_2;

import android.content.Intent; // Pastikan import ini ada
import android.os.Bundle;
import android.widget.TextView; // Pastikan import ini ada

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Confirm_register extends AppCompatActivity {

    TextView username, email, address, phone, password, confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_register);

        username = findViewById(R.id.edNama1);
        email = findViewById(R.id.edEmail1);
        address = findViewById(R.id.edAlamat1);
        phone = findViewById(R.id.edNomor1);
        password = findViewById(R.id.edPass1);
        confirm = findViewById(R.id.edConpass1);

        Intent intent = getIntent();

        String user = intent.getStringExtra("key_nama");
        String mail = intent.getStringExtra("key_email");
        String addr = intent.getStringExtra("key_alamat");
        String ph = intent.getStringExtra("key_wa");
        String pass = intent.getStringExtra("key_password");
        String conf = intent.getStringExtra("key_confirm");

        username.setText("Nama Lengkap : " + user);
        email.setText("Email : " + mail);
        address.setText("Alamat : " + addr);
        phone.setText("Nomor WA : " + ph);
        password.setText("Password : " + pass);
        confirm.setText("Konfirmasi Password : " + conf);
    }
}