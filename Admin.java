import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends Aktor implements RoleAdmin {
    protected String namaAdmin;
    protected final String status = "Admin";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<UserPersonal> user = Main.user;
    static ArrayList<Admin> admin = Main.admin;




    public Admin(String alamat, String username, String pass, String id, String nomorhp,String namaAdmin, String status) {
        super(alamat, username, pass, id, nomorhp);
        this.namaAdmin = namaAdmin;

    }

    
    public String getNamaAdmin() {
        return namaAdmin;
    }


    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }


    public String getStatus() {
        return status;
    }


    public Admin() {
    }


    @Override
    public void KonversiMataUang() throws Exception {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void dataPribadi() throws Exception {
        for (int i=0; i <  admin.size(); i++){
            if (Main.idlogin.equals(admin.get(i).getId_user())){
                System.out.println("Status      :"+ admin.get(i).getStatus());
                System.out.println("ID          :"+ admin.get(i).getId_user());
                System.out.println("Nama        :"+ admin.get(i).getNamaAdmin());
                System.out.println("NomorHp     :"+ admin.get(i).getNomorhp());
                System.out.println("Alamat      :"+ admin.get(i).getAlamat());
                System.out.println("Username    :"+ admin.get(i).getUsername());
            }
        }
        
    }


    @Override
    public void dataUser() throws Exception {
        for (int i=0; i <  user.size(); i++){
                System.out.println("Status      :"+ user.get(i).getStatus());
                System.out.println("ID          :"+ user.get(i).getId_user());
                System.out.println("Nama        :"+ user.get(i).getNama());
                System.out.println("NomorHp     :"+ user.get(i).getNomorhp());
                System.out.println("Alamat      :"+ user.get(i).getAlamat());
                System.out.println("Username    :"+ user.get(i).getUsername());
                System.out.println("\n");

        }
        
    }


    @Override
    public void lihatdataPribadi() throws Exception {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void updateData() throws Exception {
        // TODO Auto-generated method stub
        
    }


    public void Menu() throws Exception{
        while(true){
            System.out.println(" ");
            System.out.println("    Selamat Datang di Menu Admin ");
            System.out.println("=====================================");
            System.out.println("1. Lihat Akun");
            System.out.println("2. Lihat Data User");
            System.out.println("3. Konversi Mata Uang");
            System.out.println("4. Ubah Akun");
            System.out.println("5. Logout");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    dataPribadi();
                    break;
                case 2:
                    dataUser();
                    break;
                case 3:
                    KonversiMataUang();
                    break;
                case 4:
                   updateData();
                    break;
                case 5:
                    Main.main(null);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }
    
    
}
