package com.example.belajarandroidxpplg_2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailListSiswa extends AppCompatActivity {

    TextView tvNamaDetail, tvNoPunggungDetail, tvNegaraDetail, tvPosisiDetail;
    ImageView imgsiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_siswa);

        // INIT VIEW
        tvNamaDetail = findViewById(R.id.tvNamaDetail);
        tvNoPunggungDetail = findViewById(R.id.tvNoPunggungDetail);
        tvNegaraDetail = findViewById(R.id.tvNegaraDetail);
        tvPosisiDetail = findViewById(R.id.tvPosisiDetail);
        imgsiswa = findViewById(R.id.imgsiswa);

        // AMBIL DATA INTENT (PAKAI STRING SEMUA BIAR AMAN)
        String nama = getIntent().getStringExtra("nama");
        String nopunggung = getIntent().getStringExtra("nopunggung");
        String negara = getIntent().getStringExtra("negara");
        String posisi = getIntent().getStringExtra("posisi");
        int fotoResId = getIntent().getIntExtra("foto", 0);

        // SET DATA (AMAN NULL)
        tvNamaDetail.setText("Nama: " + (nama != null ? nama : "-"));
        tvNoPunggungDetail.setText("No Punggung: " + (nopunggung != null ? nopunggung : "-"));
        tvNegaraDetail.setText("Negara: " + (negara != null ? negara : "-"));
        tvPosisiDetail.setText("Posisi: " + (posisi != null ? posisi : "-"));

        if (fotoResId != 0) {
            imgsiswa.setImageResource(fotoResId);
        }
    }
}