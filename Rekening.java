/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package papbogui;

/**
 *
 * @author acer
 */
public abstract class Rekening {
    protected String id;
    protected String nama;
    protected String jenis;
    protected String idmatauang;
    protected int saldo;

    public Rekening(String id, String nama, String jenis, String idmatauang, int saldo) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.idmatauang = idmatauang;
        this.saldo = saldo;
    }
    
    
}
