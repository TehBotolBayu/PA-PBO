import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<UserPersonal> user = new ArrayList<UserPersonal>();
    static ArrayList<Admin> admin = new ArrayList<Admin>();

    static String idlogin;
    static UserPersonal user1 = new UserPersonal("Asmaba", "user123", "123", "U1","0822", "Herniii", null);
    static UserPersonal user2 = new UserPersonal("Asmaba", "user12", "123", "U2","0822", "Herniii", null);
    static Admin admin1 = new Admin("Asmaba", "admin", "123", "A2","0822", "Herniii", null);



    public static void main(String[] args) throws Exception {
        user.add(user1);
        user.add(user2);
        admin.add(admin1);


        menu_utama();
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
        UserPersonal myclass = new UserPersonal();
        Admin menuAdmin = new Admin();
        
        int kondisi=0;
        System.out.print("Masukkan Username: ");
        String username = br.readLine();
        System.out.print("Masukkan Password: ");
        String pass = br.readLine();
        for(int i=0; i <  user.size(); i++){
            if (username.equals(user.get(i).getUsername()) && pass.equals(user.get(i).getPass())){
                kondisi =1;
                idlogin = user.get(i).getId_user();
                myclass.Menu();
                
            }
        }

        for(int i=0; i <  admin.size(); i++){
            if (username.equals(admin.get(i).getUsername()) && pass.equals(admin.get(i).getPass())){
                kondisi =1;
                idlogin = admin.get(i).getId_user();
                menuAdmin.Menu();
            }
        }

        if (kondisi==0){
            System.out.println("Password dan Username anda salah");
            menu_utama();
        }
        
    }
}
