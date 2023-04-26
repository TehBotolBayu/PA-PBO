package pa;

public class Debit extends Keuangan {
    private final String kategori = "Debit";

    public Debit(String nama, int jumlah, String tanggal, String catatan, String jenis, String kategori, String ID, String ID_user) {
        super(nama, jumlah, tanggal, catatan, jenis, ID, ID_user);
    }
    public Debit(){
        
    }
    public String getKategori() {
        return kategori;
    }
}
