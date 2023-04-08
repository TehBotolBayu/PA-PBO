package Keuangan;


public abstract class  Keuangan {
    protected String nama;
    protected int jumlah;
    protected String tanggal;
    protected String catatan;
    protected String jenis;
    protected String ID;


    public Keuangan(String nama, int jumlah, String tanggal, String catatan, String jenis, String ID) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.catatan = catatan;
        this.jenis = jenis;
        this.ID = ID;

    }

    public Keuangan(){
        
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getCatatan() {
        return catatan;
    }
    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    
}
