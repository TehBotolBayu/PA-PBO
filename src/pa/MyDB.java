/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pa.Main.admin;
import static pa.Main.bisnis;
import static pa.Main.user;
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
    
    public static void move(UserPersonal Userr) {
        String sql = "SELECT * FROM tbakun";

        try {
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                if(rs.getString("status").equals("User")){
                    String id = rs.getString("id_user");
                    String nama = rs.getString("nama");
                    String alamat = rs.getString("alamat");
                    String nomorhp = rs.getString("nomorHp");
                    String status = rs.getString("status");
                    String username = rs.getString("username");
                    String pass = rs.getString("pass");
                    UserPersonal userr = new UserPersonal(alamat, username,  pass,  id,  nomorhp,  nama, status);
                    user.add(userr);
                }
                else if (rs.getString("status").equals("Admin")){
                    String id = rs.getString("id_user");
                    String nama = rs.getString("nama");
                    String alamat = rs.getString("alamat");
                    String nomorhp = rs.getString("nomorHp");
                    String status = rs.getString("status");
                    String username = rs.getString("username");
                    String pass = rs.getString("pass");
                    Admin adminn = new Admin(alamat, username,  pass,  id,  nomorhp,  nama, status);
                    admin.add(adminn);

                }
                else if (rs.getString("status").equals("Bisnis")){
                    String id = rs.getString("id_user");
                    String nama = rs.getString("nama");
                    String alamat = rs.getString("alamat");
                    String nomorhp = rs.getString("nomorHp");
                    String status = rs.getString("status");
                    String username = rs.getString("username");
                    String pass = rs.getString("pass");
                    Bisnis bisniss = new Bisnis(nama,alamat, username, pass, id, nomorhp, status);
                    bisnis.add(bisniss);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void move(Dompet dpt) {
        String sql = "SELECT * FROM tbdompet WHERE iduser = '"+Main.idlogin+"'";
        Main.listdompet.clear();
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id, nama, jenis, idmatauang, iduser;
                id = rs.getString("id");
                nama = rs.getString("nama");
                jenis = rs.getString("jenis");
                idmatauang = rs.getString("idmatauang");
                int saldo = rs.getInt("saldo");
                iduser = rs.getString("iduser");
                Dompet d = new Dompet(id,  nama,  jenis,  idmatauang,  saldo,  iduser);
                Main.listdompet.add(d);               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void move(Transaksi dpt) {
        
        String sql = "SELECT * FROM tbtransaksi WHERE iduser = '"+Main.idlogin+"'";
        Main.listtransaksi.clear();
        try {
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                
                String id = rs.getString("id");
                String nama = rs.getString("nama");
                String catatan= rs.getString("catatan");
                int jumlah = rs.getInt("jumlah");
                String kategori = rs.getString("kategori");
                String iddompet = rs.getString("iddompet");
                String iduser = rs.getString("iduser");
                String idmatauang = rs.getString("idmatauang");

                Transaksi tt = new Transaksi( id, nama, catatan, jumlah, kategori, iddompet, iduser, idmatauang);
                
                Main.listtransaksi.add(tt);
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertDompet(String nama, String jenis, String idmatauang, int saldo, String iduser){
        String sql = "INSERT INTO tbdompet(nama, jenis, idmatauang, saldo, iduser) VALUE('%s', '%s', '%s', '%s', '%s')";
        sql = String.format(sql, nama, jenis, idmatauang, saldo, iduser );
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    public static void updateDompet(String nama, String jenis, String idmatauang, int saldo, String iduser, String id){
        String sql = "UPDATE tbdompet SET nama='%s', jenis='%s', idmatauang='%s', saldo='%s' WHERE id='%s'";
        sql = String.format(sql, nama, jenis, idmatauang, saldo, id);  
//        String sql = "UPDATE tbdompet SET nama='%s' WHERE id='%s'";
//        sql = String.format(sql, nama, id );  
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void deleteDompet(String id){
        String sql = String.format("DELETE FROM tbdompet WHERE id='%s'", id);
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
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
        String sql = "INSERT INTO tbakun ( id_user, nama, alamat, nomorHp, status, username, pass) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
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
    
    
    public static void updateAdmin(String id, String nama, String alamat, String nomorHP, String status, String username, String pass) {
        String sql = "UPDATE tbakun SET nama='%s', alamat='%s', nomorHp='%s', status='%s', username='%s', pass='%s' WHERE id_user='%s'";
        sql = String.format(sql, nama, alamat, nomorHP, status, username, pass, id);            
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
    
    public static void addTransaksi(String nama, String catatan, int jumlah, String kategori, String iddompet, String iduser , String idmatauang){
        String sql = "INSERT INTO tbtransaksi( nama, catatan, jumlah, kategori, iddompet, iduser ,idmatauang) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
        sql = String.format(sql, nama, catatan, jumlah, kategori, iddompet, iduser ,idmatauang );
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public static void updateTransaksi(String id, String nama, String catatan, int jumlah, String kategori, String iddompet, String iduser , String idmatauang){
        String sql = "UPDATE tbtransaksi SET nama='%s', catatan='%s', jumlah='%s', kategori='%s', iddompet='%s', iduser='%s', idmatauang='%s' WHERE id='%s'";
        sql = String.format(sql, nama,catatan, jumlah, kategori, iddompet, iduser,idmatauang, id);  
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
        
    public static void deleteTransaksi(String id){
        String sql = String.format("DELETE FROM tbtransaksi WHERE id='%s'", id);
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
    public static void tambahGoal(Goal obj) {
        String query = "INSERT INTO tbgoal(nama, jenis, idmatauang, saldo, iduser, catatan, target) VALUES ('" +
                        obj.getNama() + "','" +
                        obj.getJenis() + "','" +
                        obj.getIdmatauang() + "','" +
                        obj.getSaldo() + "','" +
                        obj.getId_user() + "','" +
                        obj.getCatatan() + "','" +
                        obj.getTarget() + "')";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void retrieveGoal() {
        GoalGUI.ListGoal.clear();
        GoalGUI.ListGoal.addAll(selectCustomer("SELECT * FROM tbgoal WHERE iduser = '" + Main.idlogin + "'"));
    }
    
    public static ArrayList<Goal> selectCustomer(String query) {
        ArrayList<Goal> arrSelected = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(query);

            while (result.next()) {
                Goal gl = new Goal(
                        result.getString("catatan"), 
                        result.getInt("target"), 
                        result.getString("id"), 
                        result.getString("nama"), 
                        "goal", 
                        result.getString("idmatauang"),
                        result.getInt("saldo"),
                        Main.idlogin
                );
                GoalGUI.ListGoal.add(gl);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return arrSelected;
    }
    
    public void updateGoal(Goal obj) {

        String query = "UPDATE tbgoal SET " +
                        "nama='"      + obj.getNama()      + "'," +
                        "nama='"     + obj.getNama()     + "'," +
                        "jenis='" + obj.getJenis() + "'," +
                        "idmatauang='" + obj.getIdmatauang() + "'," +
                        "saldo='"    + obj.getSaldo() + "'," +
                        "iduser='"     + Main.idlogin + "'," +
                        "catatan='"    + obj.getCatatan() + "' "  +
                        "WHERE id='"  + obj.getId()  + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void deleteGoal(Goal obj) {
        String query = "DELETE FROM tbgoal " +
                       "WHERE id='" + obj.getId() + "'";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
}
