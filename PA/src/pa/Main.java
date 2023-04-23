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

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<UserPersonal> user = new ArrayList<UserPersonal>();
    static ArrayList<Admin> admin = new ArrayList<Admin>();

    static String idlogin,namaLogin;
    static UserPersonal user1 = new UserPersonal();
    static MyDB db = new MyDB();




    public static void main(String[] args) throws Exception {
        
        
        MyDB.move(debitt);
        MyDB.move(kreditt);
        MyDB.move(user1);

        new menu_utama().setVisible(true);        
    }
   
    public static void menu_utama()throws Exception{
        while(true){
            try {
                System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("1. Login");
            System.out.println("2. Registrasi");
            System.out.println("3. Keluar Program");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    login();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

            } catch (Exception e) {
                System.out.println("Jangan Input String");
                menu_utama();
            }
            
        }
    }


    public static void login()throws Exception{
//        int kondisi=0;
//        
//        for(int i=0; i <  user.size(); i++){
//            if (username.equals(user.get(i).getUsername()) && pass.equals(user.get(i).getPass())){
//                kondisi =1;
//                idlogin = user.get(i).getId_user();
//                myclass.Menu();
//                
//            }
//        }
//
//        for(int i=0; i <  admin.size(); i++){
//            if (username.equals(admin.get(i).getUsername()) && pass.equals(admin.get(i).getPass())){
//                kondisi =1;
//                idlogin = admin.get(i).getId_user();
//                menuAdmin.Menu();
//            }
//        }
//
//        if (kondisi==0){
//            System.out.println("Password dan Username anda salah");
//            menu_utama();
//        }
        
    }
}

