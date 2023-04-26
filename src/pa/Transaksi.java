/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa;

/**
 *
 * @author acer
 */
public class Transaksi {
    private String id;
    private String nama;
    private String catatan;
    private int jumlah;
    private String kategori;
    private String iddompet;
    private String iduser;
    private String idmatauang;

    public Transaksi(String id, String nama, String catatan, int jumlah, String kategori, String iddompet, String iduser, String idmatauang) {
        this.id = id;
        this.nama = nama;
        this.catatan = catatan;
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.iddompet = iddompet;
        this.iduser = iduser;
        this.idmatauang = idmatauang;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getIddompet() {
        return iddompet;
    }

    public void setIddompet(String iddompet) {
        this.iddompet = iddompet;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIdmatauang() {
        return idmatauang;
    }

    public void setIdmatauang(String idmatauang) {
        this.idmatauang = idmatauang;
    }
    
    
}
