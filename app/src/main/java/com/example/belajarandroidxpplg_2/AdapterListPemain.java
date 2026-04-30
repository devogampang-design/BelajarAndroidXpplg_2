package com.example.belajarandroidxpplg_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListPemain extends RecyclerView.Adapter<AdapterListPemain.ViewHolder> {

    private List<PemainModel> listPemain;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(PemainModel pemain);
    }


    public AdapterListPemain(List<PemainModel> listPemain, OnItemClickListener listener) {
        this.listPemain = listPemain;
        this.listener = listener;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
         ImageView ImageUser;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvNama);
            ImageUser = itemView.findViewById(R.id.foto);
        }
    }

    @NonNull
    @Override
    public AdapterListPemain.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_pemain, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListPemain.ViewHolder holder, int position) {


        PemainModel pemain = listPemain.get(position);

        holder.tvNama.setText(pemain.getNama());
        holder.ImageUser.setImageResource(pemain.getImageUser());



        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(pemain);
            }

            Toast.makeText(
                    v.getContext(),
                    "Hallo " + pemain.getNama(),
                    Toast.LENGTH_SHORT
            ).show();
        });
    }

    @Override
    public int getItemCount() {
        return listPemain.size();
    }
}