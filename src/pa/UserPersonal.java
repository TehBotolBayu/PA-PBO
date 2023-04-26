package pa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


 public class UserPersonal extends Aktor implements RoleUserPersonal {
    
    public static ArrayList<Goal> ListGoal = new ArrayList<Goal>(); 
    static GoalGUI gg = new GoalGUI();
    protected String nama;
    protected final String status = "User";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<UserPersonal> user = Main.user;
    static ArrayList<Debit> debit = MenuKeuangan.debit;
    static ArrayList<Kredit> kredit = MenuKeuangan.kredit;
    static MyDB db = new MyDB();



    static int nomor;
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

    
     public static void no_urut(){
        nomor=0;
        
        for (int i=0; i <  user.size(); i++){
            if ("User".equals(user.get(i).getStatus())){
                String id = user.get(i).getId_user();
                nomor = Integer.parseInt(id.substring(1))+1;
            }   
        }
        if (user.size()==0){
            nomor=1;
        }
    }
    
    @Override
    public void HapusAkun() throws Exception{
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
                user.remove(i);
                MyDB.hapusAkun(Main.idlogin);
                if (debit.size()>0){
                    for (int z=0; z <  debit.size(); i++){
                        if (Main.idlogin.equals(debit.get(z).getID_user())){
                            MyDB.hapusKeuangan(debit.get(z).getID());
                             debit.remove(z);
                        }
                    }
                }
                if (kredit.size()>0){
                     for (int z=0; z <  kredit.size(); i++){
                        if (Main.idlogin.equals(kredit.get(z).getID_user())){
                            MyDB.hapusKeuangan(kredit.get(z).getID());
                            kredit.remove(z);
                        }
                    }
                }
                
               
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
                menu_akun.txtStatus.setText(user.get(i).getStatus());
                menu_akun.txtID.setText(user.get(i).getId_user());
                menu_akun.txtNama.setText(user.get(i).getNama());
                menu_akun.txtNomorHp.setText(user.get(i).getNomorhp());
                menu_akun.txtAlamat.setText(user.get(i).getAlamat());
                menu_akun.txtUsername.setText(user.get(i).getUsername());
            
            }
        }
    }
    @Override
    public void ManajemenKeuangan() throws Exception {
//        MenuKeuangan.Manajemen();
        
    }
    @Override
    public void UbahAkun() throws IOException{
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
                String addnama = menu_ubah.txtNama.getText();
                String addNomorhp = menu_ubah.txtNomorHp.getText();            
                String addAlamat = menu_ubah.txtAlamat.getText();
                String addusername = menu_ubah.txtUsername.getText();
                String addPass = menu_ubah.txtpass.getText();
                UserPersonal userUpdate = new UserPersonal(addAlamat, addusername, addPass, Main.idlogin, addNomorhp, addnama, "User");
                user.set(i, userUpdate);
                MyDB.updateAkun(Main.idlogin, addnama, addAlamat, addNomorhp, "User", addusername, addPass);
                Main.namaLogin = addnama;
            }
        }
    }
    
    @Override
    public void register() throws IOException{
        nomor +=1;
        String id = "U"+ nomor;
        String addnama = register.rnama.getText();
        String addNomorhp = register.rnohp.getText();
        String addAlamat = register.ralamat.getText();
        String addusername = register.rusername1.getText();
        String addPass = register.rpassword.getText();
        UserPersonal userUpdate = new UserPersonal(addAlamat, addusername, addPass, id, addNomorhp, addnama, "User");
        user.add(userUpdate);
        MyDB.insertAkun(id, addnama, addAlamat, addNomorhp, "User", addusername, addPass);
        
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
