package com.example.tercatat;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapterBarang extends RecyclerView.Adapter<ListAdapterBarang.ListViewHolder>{
    private ArrayList<Barang> listBarang;

    public ListAdapterBarang(ArrayList<Barang> list) {
        this.listBarang = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listBarang.size();
    }

  class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgbarang;
        TextView namabarang,hargabarang;

        ListViewHolder(View itemview) {
            super(itemview);
            imgbarang = itemview.findViewById(R.id.img_barang);
            namabarang = itemview.findViewById(R.id.nama_barang);
            hargabarang = itemview.findViewById(R.id.harga_barang);
        }
    }
}
