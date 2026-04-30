package com.example.belajarandroidxpplg_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListSiswa extends RecyclerView.Adapter<AdapterListSiswa.ViewHolder> {

    private List<SiswaModel> listSiswa;

    OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(SiswaModel siswaModel);
    }

    // constructor
    public AdapterListSiswa(List<SiswaModel> listSiswa) {
        this.listSiswa = listSiswa;
        this.listener = listener;
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama,tvNoPunggung,tvNegara,tvPosisi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNoPunggung = itemView.findViewById(R.id.tvNoPunggungDetail);
            tvNegara = itemView.findViewById(R.id.tvNegaraDetail);
            tvPosisi = itemView.findViewById(R.id.tvPosisiDetail);

        }
    }

    @NonNull
    @Override
    public AdapterListSiswa.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_siswa_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListSiswa.ViewHolder holder, int position) {
        String nama = listSiswa.get(position).getNama();
        String nopunggung = listSiswa.get(position).getNoPunggung();
        String negara = listSiswa.get(position).getNegara();
        String posisi = listSiswa.get(position).getPosisi();

        SiswaModel siswa = listSiswa.get(position);
        holder.tvNama.setText(siswa.getNama());
        holder.tvNoPunggung.setText(siswa.getNoPunggung());
        holder.tvNegara.setText(siswa.getNegara());
        holder.tvPosisi.setText(siswa.getPosisi());
        holder.itemView.setOnClickListener(v -> {
            listener.onItemClick(siswa);
            android.widget.Toast.makeText(
                    v.getContext(),
                    "hallo " + siswa.getNama(),
                    android.widget.Toast.LENGTH_SHORT
            ).show();
        });
    }




    @Override
    public int getItemCount() {
        return listSiswa.size();
    }
}