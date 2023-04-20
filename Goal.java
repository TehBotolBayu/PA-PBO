/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package papbogui;

/**
 *
 * @author acer
 */
public class Goal extends Rekening{
    private String catatan;
    private int target;

    public Goal(String catatan, int target, String id, String nama, String jenis, String idmatauang, int saldo) {
        super(id, nama, jenis, idmatauang, saldo);
        this.catatan = catatan;
        this.target = target;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getIdmatauang() {
        return idmatauang;
    }

    public void setIdmatauang(String idmatauang) {
        this.idmatauang = idmatauang;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
