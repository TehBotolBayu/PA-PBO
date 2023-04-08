package Keuangan;

public class Debit extends Keuangan {
    private final String kategori = "Debit";

    public Debit(String nama, int jumlah, String tanggal, String catatan, String jenis, String kategori, String ID) {
        super(nama, jumlah, tanggal, catatan, jenis, ID);
    }
    public Debit(){
        
    }
    public String getKategori() {
        return kategori;
    }
}
