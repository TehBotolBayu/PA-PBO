package Keuangan;

public class Kredit extends Keuangan {
    private final String kategori = "Kredit";

    public Kredit(String nama, int jumlah, String tanggal, String catatan, String jenis, String kategori) {
        super(nama, jumlah, tanggal, catatan, jenis);
    }

    public Kredit(){
        
    }

    public String getKategori() {
        return kategori;
    }

}
