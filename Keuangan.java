


public abstract class  Keuangan {
    protected String nama;
    protected int jumlah;
    protected String tanggal;
    protected String catatan;
    protected String jenis;
    protected String ID;
    protected String ID_user;



    public Keuangan(String nama, int jumlah, String tanggal, String catatan, String jenis, String ID, String ID_user) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.catatan = catatan;
        this.jenis = jenis;
        this.ID = ID;
        this.ID_user = ID_user;


    }

    public Keuangan(){
        
    }
    

    public String getID_user() {
        return ID_user;
    }

    public void setID_user(String iD_user) {
        ID_user = iD_user;
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
