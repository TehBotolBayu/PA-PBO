/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pa.MenuKeuangan.debit;
import static pa.MenuKeuangan.kredit;


/**
 *
 * @author LENOVO
 */
public class MyDB {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbmoneymanajer";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public MyDB(){
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);  
            stmt = conn.createStatement();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void move(Debit debitt) {
        String sql = "SELECT * FROM tbkeuangan";

        try {
            
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                if(rs.getString("kategori").equals("Debit")){
                    String id = rs.getString("id");
                    String nama = rs.getString("nama");
                    String jenis = rs.getString("jenis");
                    int jumlah = rs.getInt("jumlah");
                    String tanggal = rs.getString("tanggal");
                    String catatan = rs.getString("catatan");
                    String kategori = rs.getString("kategori");
                    String id_user = rs.getString("Id_user");
                    Debit pemasukkan = new Debit(nama, jumlah, tanggal, catatan, jenis,kategori, id, id_user);
                    debit.add(pemasukkan);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void move(Kredit kreditt) {
        String sql = "SELECT * FROM tbkeuangan";

        try {
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                if(rs.getString("kategori").equals("Kredit")){
                    String id = rs.getString("id");
                    String nama = rs.getString("nama");
                    String jenis = rs.getString("jenis");
                    int jumlah = rs.getInt("jumlah");
                    String tanggal = rs.getString("tanggal");
                    String catatan = rs.getString("catatan");
                    String kategori = rs.getString("kategori");
                    String id_user = rs.getString("Id_user");
                    Kredit pengeluaran = new Kredit(nama, jumlah, tanggal, catatan, jenis,kategori, id, id_user);
                    kredit.add(pengeluaran);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void insertKeuangan(String id, String nama, String jenis, int jumlah, String tanggal, String Catat, String kategori, String id_user) {
        String sql = "INSERT INTO tbkeuangan (id, nama, jenis, jumlah, tanggal, catatan, kategori, Id_user) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s','%s')";
        sql = String.format(sql, id, nama, jenis, jumlah, tanggal, Catat, kategori, id_user );
        try {
            stmt.execute(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void insertAkun(String id, String nama, String alamat, String nomorHP, String status, String username, String pass) {
        String sql = "INSERT INTO tbakun (id_user, nama, alamat, nomorHp, status, username, pass) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
        sql = String.format(sql, id, nama, alamat, nomorHP, status, username, pass);
        try {
            stmt.execute(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateKeuangan(String id, String nama, String jenis, int jumlah, String tanggal, String Catat, String kategori, String id_user) {
        String sql = "UPDATE tbkeuangan SET nama='%s', jenis='%s', jumlah='%s', tanggal='%s', catatan='%s', kategori='%s', Id_user='%s' WHERE id='%s'";
        sql = String.format(sql, nama, jenis, jumlah, tanggal, Catat, kategori, id_user, id);            
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void updateAkun(String id, String nama, String alamat, String nomorHP, String status, String username, String pass) {
        String sql = "UPDATE tbakun SET nama='%s', alamat='%s', nomorHp='%s', status='%s', username='%s', pass='%s' WHERE id_user='%s'";
        sql = String.format(sql, nama, alamat, nomorHP, status, username, pass, id);            
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void hapusKeuangan(String id) {
        String sql = String.format("DELETE FROM tbkeuangan WHERE id='%s'", id);
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void hapusAkun(String id) {
        String sql = String.format("DELETE FROM tbakun WHERE id_user='%s'", id);
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
