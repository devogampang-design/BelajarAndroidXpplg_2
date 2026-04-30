package com.example.belajarandroidxpplg_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListPemain extends AppCompatActivity {
    RecyclerView rvlistPemain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_pemain);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvlistPemain = (RecyclerView) findViewById(R.id.rvListPemain);
        ArrayList<PemainModel> listPemain = new ArrayList<>();

        PemainModel pemain1 = new PemainModel("Kylian Mbappe", "11", "Prancis", "Penyerang", R.drawable.mbappe, "detail lengkap Kylian Mbappe");
        PemainModel pemain2 = new PemainModel("Jude Bellingham", "5", "England", "Gelandang", R.drawable.bellingham, "detail lengkap Jude Bellingham");
        PemainModel pemain3 = new PemainModel("Vinicius Jr", "7", "Brazil", "Sayap kiri", R.drawable.vinicius, "detail lengkap Vinicius Jr");
        PemainModel pemain4 = new PemainModel("Rodrygo", "11", "Brazil", "Sayap kanan", R.drawable.rodrygo, "detail lengkap Rodrygo");
        PemainModel pemain5 = new PemainModel("Federico Valverde", "15", "Uruguay", "Gelandang", R.drawable.valverde, "detail lengkap Federico Valverde");
        PemainModel pemain6 = new PemainModel("Arda Guler", "24", "Turki", "Gelandang serang", R.drawable.arda, "detail lengkap Arda Guler");
        PemainModel pemain7 = new PemainModel("Brahim Diaz", "21", "Maroko", "Gelandang serang", R.drawable.diaz, "detail lengkap Brahim Diaz");
        PemainModel pemain8 = new PemainModel("Ferland Mendy", "23", "Prancis", "Bek kiri", R.drawable.mendy, "detail lengkap Ferland Mendy");
        PemainModel pemain9 = new PemainModel("Antonio Rudiger", "22", "Germany", "Bek tengah", R.drawable.rudiger, "detail lengkap Antonio Rudiger");
        PemainModel pemain10 = new PemainModel("Thibaut Courtois", "1", "Belgia", "Kiper", R.drawable.thibaut, "detail lengkap Thibaut Courtois");

        listPemain.add(pemain1);
        listPemain.add(pemain2);
        listPemain.add(pemain3);
        listPemain.add(pemain4);
        listPemain.add(pemain5);
        listPemain.add(pemain6);
        listPemain.add(pemain7);
        listPemain.add(pemain8);
        listPemain.add(pemain9);
        listPemain.add(pemain10);


        AdapterListPemain adapter = new AdapterListPemain(listPemain, pemainModel -> {
            Intent intent = new Intent(ListPemain.this, DetailListPemain.class);
            intent.putExtra("nama", pemainModel.getNama());
            intent.putExtra("no punggung", pemainModel.getNoPunggung());
            intent.putExtra("negara", pemainModel.getNegara());
            intent.putExtra("posisi", pemainModel.getPosisi());
            intent.putExtra("image", pemainModel.getImageUser());
            intent.putExtra("detail", pemainModel.getDetail());
            startActivity(intent);
        });

        rvlistPemain.setLayoutManager(new LinearLayoutManager(this));
        rvlistPemain.setAdapter(adapter);

    }

}