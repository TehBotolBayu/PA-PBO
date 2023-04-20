import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserPersonal extends Aktor implements RoleUserPersonal {
    
public static ArrayList<Goal> ListGoal = new ArrayList<Goal>(); 
 
static GoalGUI gg = new GoalGUI();



    protected String nama;
    protected final String status = "User Personal";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<UserPersonal> user = Main.user;
    static ArrayList<Debit> debit = MenuKeuangan.debit;
    static ArrayList<Kredit> kredit = MenuKeuangan.kredit;
    static ArrayList<Goals> goals = MenuGoals.goals;


    static int nomor = 2;
    static Debit debitt = new Debit();
    static Kredit kreditt = new Kredit();

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStatus() {
        return status;
    }
    public UserPersonal(String alamat, String username, String pass, String id, String nomorhp, String nama, String status) {
        super(alamat, username, pass, id, nomorhp);
        this.nama = nama;
    }
    public UserPersonal() {
    
    }

    @Override
    public void HapusAkun() throws Exception{
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
                user.remove(i);
                for (int z=0; z <  debit.size(); i++){
                    if (Main.idlogin.equals(debit.get(z).getID_user())){
                        debit.remove(z);
                    }
                }
                for (int z=0; z <  kredit.size(); i++){
                    if (Main.idlogin.equals(kredit.get(z).getID_user())){
                        kredit.remove(z);
                    }
                }
                for (int z=0; z <  goals.size(); i++){
                    if (Main.idlogin.equals(goals.get(z).getId_user())){
                        goals.remove(z);
                    }
                }
                Main.main(null);


            }
        }
    }
    @Override
    public void KonversiMataUang() throws IOException{
        // TODO Auto-generated method stub
        
    }
    @Override
    public void LihatAkun() throws IOException{
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
                System.out.println("Status      :"+ user.get(i).getStatus());
                System.out.println("ID          :"+ user.get(i).getId_user());
                System.out.println("Nama        :"+ user.get(i).getNama());
                System.out.println("NomorHp     :"+ user.get(i).getNomorhp());
                System.out.println("Alamat      :"+ user.get(i).getAlamat());
                System.out.println("Username    :"+ user.get(i).getUsername());
            }
        }
        
    }
    @Override
    public void ManajemenGoals() throws Exception {
        MenuGoals.Manajemen();
        
    }
    @Override
    public void ManajemenKeuangan() throws Exception {
        MenuKeuangan.Manajemen();
        
    }
    @Override
    public void UbahAkun() throws IOException{
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
                System.out.print("Masukkan Nama: ");
                String addnama = br.readLine();
                System.out.print("Masukkan NomorHP: ");
                String addNomorhp = br.readLine();
                System.out.print("Masukkan Alamat: ");
                String addAlamat = br.readLine();
                System.out.print("Masukkan Username baru: ");
                String addusername = br.readLine();
                System.out.print("Masukkan Password Baru: ");
                String addPass = br.readLine();
                UserPersonal userUpdate = new UserPersonal(addAlamat, addusername, addPass, Main.idlogin, addNomorhp, addnama, "User Personal");
                user.set(i, userUpdate);

            }
        }
        
    }
    
    @Override
    public void register() throws IOException{
        nomor +=1;
        String id = nomor + "U";
        System.out.print("Masukkan Nama: ");
        String addnama = br.readLine();
        System.out.print("Masukkan NomorHP: ");
        String addNomorhp = br.readLine();
        System.out.print("Masukkan Alamat: ");
        String addAlamat = br.readLine();
        System.out.print("Masukkan Username baru: ");
        String addusername = br.readLine();
        System.out.print("Masukkan Password Baru: ");
        String addPass = br.readLine();
        UserPersonal userUpdate = new UserPersonal(addAlamat, addusername, addPass, id, addNomorhp, addnama, "User Personal");
        user.add(userUpdate);
        
    }

    public void Menu() throws Exception{
        while(true){
            System.out.println(" ");
            System.out.println("    Selamat Datang di Menu User ");
            System.out.println("=====================================");
            System.out.println("1. Lihat Akun");
            System.out.println("2. Manajemen Keuanganr");
            System.out.println("3. Catat Goals Tabungan");
            System.out.println("4. Konversi Mata Uang");
            System.out.println("5. Ubah Akun");
            System.out.println("6. Hapus Akun");
            System.out.println("7. Logout");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    LihatAkun();
                    break;
                case 2:
                    ManajemenKeuangan();
                    break;
                case 3:
                    gg.tampil();
                    gg.setVisible(true);
                    break;
                case 4:
                    KonversiMataUang();
                    break;
                case 5:
                    UbahAkun();
                    break;
                case 6:
                    HapusAkun();
                    break;
                case 7:
                    Main.main(null);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }

    

    
    
    
}
