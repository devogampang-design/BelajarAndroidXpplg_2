package com.example.belajarandroidxpplg_2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailListPemain extends AppCompatActivity {

    TextView tvNamaDetail, tvNoPunggungDetail, tvNegaraDetail, tvPosisiDetail;
    ImageView imgsiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_pemain);

        tvNamaDetail = findViewById(R.id.tvNamaDetail);
        tvNoPunggungDetail = findViewById(R.id.tvNoPunggungDetail);
        tvNegaraDetail = findViewById(R.id.tvNegaraDetail);
        tvPosisiDetail = findViewById(R.id.tvPosisiDetail);
        imgsiswa = findViewById(R.id.imgsiswa);

        String nama = getIntent().getStringExtra("nama");
        String nopunggung = getIntent().getStringExtra("no punggung");
        String negara = getIntent().getStringExtra("negara");
        String posisi = getIntent().getStringExtra("posisi");
        int fotoResId = getIntent().getIntExtra("image", 0);

        tvNamaDetail.setText("Nama: " + nama);
        tvNoPunggungDetail.setText("No Punggung: " + nopunggung);
        tvNegaraDetail.setText("Negara: " + negara);
        tvPosisiDetail.setText("Posisi: " + posisi);

        imgsiswa.setImageResource(fotoResId);
    }
}