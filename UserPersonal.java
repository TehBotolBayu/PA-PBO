import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserPersonal extends Aktor implements RoleUserPersonal {
    protected String nama;
    protected final String status = "User Personal";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStatus() {
        return status;
    }
    public UserPersonal(String alamat, String username, String pass, String id, String nomorhp, String nama) {
        super(alamat, username, pass, id, nomorhp);
        this.nama = nama;
    }
    public UserPersonal() {
    
    }

    @Override
    public void HapusAkun() throws IOException{
        // TODO Auto-generated method stub
        
    }
    @Override
    public void KonversiMataUang() throws IOException{
        // TODO Auto-generated method stub
        
    }
    @Override
    public void LihatAkun() throws IOException{
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }
    @Override
    public void login() throws IOException{
        // TODO Auto-generated method stub
        
    }
    @Override
    public void register() throws IOException{
        // TODO Auto-generated method stub
        
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
                    ManajemenGoals();
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
