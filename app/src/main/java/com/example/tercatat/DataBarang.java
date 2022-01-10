package com.example.tercatat;

import java.util.ArrayList;

public class DataBarang {
    private static String [] namabarang ={
            "Air Dingin",
            "Teh Dingin",
            "Soda Dingin",
            "Coklat Dingin",
            "Lemon Dingin",
            "Kelapa Dingin",
            "Es Krim",
            "Buah"
    };

    private static float [] hargabarang={
            "5000",
            "5000",
            "7000",
            "10000",
            "6000",
            "9000",
            "7500",
            "15000"
    };

    private static int [] fotobarang={
            R.drawable.contoh,
            R.drawable.contoh,
            R.drawable.contoh,
            R.drawable.contoh,
            R.drawable.contoh,
            R.drawable.contoh,
            R.drawable.contoh,
            R.drawable.contoh
    };

    static ArrayList<Barang> getListdata(){
        ArrayList<Barang> list = new ArrayList<>();
        for (int position= 0; position <namabarang.length; position++) {
            Barang barang = new Barang();
            barang.setName(namabarang[position]);
            barang.setHarga(hargabarang[position]);
            barang.setPhoto(fotobarang[position]);
            list.add(barang);
        }
        return list;
    }
}
