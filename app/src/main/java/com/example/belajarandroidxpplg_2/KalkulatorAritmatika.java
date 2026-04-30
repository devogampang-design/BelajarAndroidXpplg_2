package com.example.belajarandroidxpplg_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class KalkulatorAritmatika extends AppCompatActivity {

    TextView tvUsernameLogin;

    EditText edSatu;
    EditText edDua;

    Button btnTambah;
    Button btnKurang;
    Button btnKali;
    Button btnBagi;
    TextView tvHasil;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_aritmatika);

        tvUsernameLogin = (TextView)findViewById(R.id.tvUsernameLogin);

        String username = getIntent().getStringExtra("namauser");

        tvUsernameLogin.setText("welcome : "+username);

        edSatu = findViewById(R.id.edSatu);
        edDua = findViewById(R.id.edDua);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        tvHasil = findViewById(R.id.tvHasil);
        btnClear = findViewById(R.id.btnClear);

        btnTambah.setOnClickListener(v -> {
            int angka1 = Integer.parseInt(edSatu.getText().toString());
            int angka2 = Integer.parseInt(edDua.getText().toString());
            int hasil = angka1 + angka2;
            tvHasil.setText("Hasil: " + hasil);
        });

        btnKurang.setOnClickListener(v -> {
            int angka1 = Integer.parseInt(edSatu.getText().toString());
            int angka2 = Integer.parseInt(edDua.getText().toString());
            int hasil = angka1 - angka2;
            tvHasil.setText("Hasil: " + hasil);
        });

        btnKali.setOnClickListener(v -> {
            int angka1 = Integer.parseInt(edSatu.getText().toString());
            int angka2 = Integer.parseInt(edDua.getText().toString());
            int hasil = angka1 * angka2;
            tvHasil.setText("Hasil: " + hasil);
        });

        btnBagi.setOnClickListener(v -> {
            int angka1 = Integer.parseInt(edSatu.getText().toString());
            int angka2 = Integer.parseInt(edDua.getText().toString());
            if (angka2 != 0) {
                float hasil = angka1 / angka2;
                tvHasil.setText("Hasil: " + hasil);
            } else {
                tvHasil.setText("Error: Tidak bisa bagi 0");
            }
        });

        btnClear.setOnClickListener(v -> {
            edSatu.setText("");
            edDua.setText("");
            tvHasil.setText("Hasil: ");
        });
    }
}