package pa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pa.MyDB.stmt;


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
//        System.out.println(user.size());
        for (int i=0; i <  user.size(); i++){
            if (i == user.size()-1){
//                System.out.println(i);
                String id = user.get(i).getId_user();
//                System.out.println(id);

                nomor = Integer.parseInt(id.substring(1));
//                System.out.println(nomor);

            }
            
               
        }
        
    }
    
    @Override
    public void HapusAkun() throws Exception{
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
                user.remove(i);
                if (Main.listtransaksi.size()>0){
                    for (int z=0; z <  Main.listtransaksi.size(); z++){
                        if (Main.idlogin.equals(Main.listtransaksi.get(z).getIduser())){
                           String sql = String.format("DELETE tbtransaksi FROM tbtransaksi JOIN tbakun ON tbakun.id_user = tbtransaksi.iduser WHERE tbtransaksi.iduser='%s';", Main.idlogin);
                        try {
                            stmt.execute(sql);
                        } catch (SQLException ex) {
                            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                             Main.listtransaksi.remove(z);
                        }
                    }
                }
                if (Main.listdompet.size()>0){
                     for (int z=0; z <  Main.listdompet.size(); z++){
                        if (Main.idlogin.equals(Main.listdompet.get(z).getId_user())){
                            String sql = String.format("DELETE tbdompet FROM tbdompet JOIN tbakun ON tbakun.id_user = tbdompet.iduser WHERE tbdompet.iduser='%s';", Main.idlogin);
                        try {
                            stmt.execute(sql);
                        } catch (SQLException ex) {
                            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                         Main.listdompet.remove(z);
                        }
                    }
                }
                
                if (GoalGUI.ListGoal.size()>0){
                     for (int z=0; z <  GoalGUI.ListGoal.size(); z++){
                        if (Main.idlogin.equals(GoalGUI.ListGoal.get(z).getId_user())){
                            if (Main.idlogin.equals(GoalGUI.ListGoal.get(z).getId_user())){
                            String sql = String.format("DELETE tbgoal FROM tbgoal JOIN tbakun ON tbakun.id_user = tbgoal.iduser WHERE tbgoal.iduser='%s';", Main.idlogin);
                        try {
                            stmt.execute(sql);
                        } catch (SQLException ex) {
                            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            GoalGUI.ListGoal.remove(z);
                        }
                    }
                }
                MyDB.hapusAkun(Main.idlogin);
                

            }
        }
        }
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
       nomor+=1;
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

    
 }

    

    
    
    

