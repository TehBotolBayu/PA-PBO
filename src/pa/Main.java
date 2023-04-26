/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pa;

/**
 *
 * @author acer
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static pa.MenuKeuangan.debitt;
import static pa.MenuKeuangan.kreditt;
import static pa.MyDB.conn;
import static pa.MyDB.stmt;
import static pa.UserPersonal.no_urut;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<UserPersonal> user = new ArrayList<UserPersonal>();
    static ArrayList<Admin> admin = new ArrayList<Admin>();
    static ArrayList<Dompet> listdompet = new ArrayList<Dompet>();
    static ArrayList<Transaksi> listtransaksi = new ArrayList<Transaksi>();
    static ArrayList<Bisnis> bisnis = new ArrayList<Bisnis>();
    static Dompet dpt = new Dompet(null, null, null, null, 0, null);
    static String idlogin ,namaLogin,statusLogin;
    static UserPersonal user1 = new UserPersonal();
    static MyDB db = new MyDB();

    public static void main(String[] args) throws Exception { 
        Admin a = new Admin("", "admin", "123", "-1", "","admin", "admin");
        admin.add(a);
        MyDB.move(debitt);
        MyDB.move(kreditt);
        MyDB.move(user1);
        MyDB.move(dpt);
        no_urut();

        new menu_utama().setVisible(true);        
    }
    
    public static boolean isNumeric(String s){
        if(s == null){
            return false;
        } 
        try {
            int d = Integer.parseInt(s);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
}

