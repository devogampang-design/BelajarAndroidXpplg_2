package com.example.belajarandroidxpplg_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSiswa extends AppCompatActivity {

    RecyclerView rvlistSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_siswa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvlistSiswa = (RecyclerView) findViewById(R.id.rvListSiswa);
        // membuat array list menggunakan SiswaModel
        ArrayList<SiswaModel> listDataSiswa = new ArrayList<>();

        SiswaModel siswa1 = new SiswaModel("Kylian Mbappe", "9", "Prancis", "Penyerang", R.drawable.mbappe, "detail lengkap Kylian Mbappe");
        SiswaModel siswa2 = new SiswaModel("Jude Bellingham", "5", "England", "Gelandang", R.drawable.bellingham, "detail lengkap Jude Bellingham");
        SiswaModel siswa3 = new SiswaModel("Vinicius Jr", "7", "Brazil", "Sayap kiri", R.drawable.vinicius, "detail lengkap Vinicius Jr");
        SiswaModel siswa4 = new SiswaModel("Rodrygo", "11", "Brazil", "Sayap kanan", R.drawable.rodrygo, "detail lengkap Rodrygo");
        SiswaModel siswa5 = new SiswaModel("Federico Valverde", "15", "Uruguay", "Gelandang", R.drawable.valverde, "detail lengkap Federico Valverde");
        SiswaModel siswa6 = new SiswaModel("Arda Guler", "24", "Turki", "Gelandang serang", R.drawable.arda, "detail lengkap Arda Guler");
        SiswaModel siswa7 = new SiswaModel("Brahim Diaz", "21", "Maroko", "Gelandang serang", R.drawable.diaz, "detail lengkap Brahim Diaz");
        SiswaModel siswa8 = new SiswaModel("Ferland Mendy", "23", "Prancis", "Bek kiri", R.drawable.mendy, "detail lengkap Ferland Mendy");
        SiswaModel siswa9 = new SiswaModel("Antonio Rudiger", "22", "Germany", "Bek tengah", R.drawable.rudiger, "detail lengkap Antonio Rudiger");
        SiswaModel siswa10 = new SiswaModel("Thibaut Courtois", "1", "Belgia", "Kiper", R.drawable.thibaut, "detail lengkap Thibaut Courtois");

        listDataSiswa.add(siswa1);
        listDataSiswa.add(siswa2);
        listDataSiswa.add(siswa3);
        listDataSiswa.add(siswa4);
        listDataSiswa.add(siswa5);
        listDataSiswa.add(siswa6);
        listDataSiswa.add(siswa7);
        listDataSiswa.add(siswa8);
        listDataSiswa.add(siswa9);
        listDataSiswa.add(siswa10);

        AdapterListSiswa adapter = new AdapterListSiswa(listDataSiswa);

        rvlistSiswa.setLayoutManager(new LinearLayoutManager(this));
        rvlistSiswa.setAdapter(adapter);
    }
}