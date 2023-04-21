package com.mycompany.PAPBO;

public class Kredit extends Keuangan {
    private final String kategori = "Kredit";

    public Kredit(String nama, int jumlah, String tanggal, String catatan, String jenis, String kategori, String ID, String ID_user) {
        super(nama, jumlah, tanggal, catatan, jenis, ID, ID_user);
    }

    public Kredit(){
        
    }

    public String getKategori() {
        return kategori;
    }

}
