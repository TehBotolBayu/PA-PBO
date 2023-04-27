/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pa.MenuKeuangan.debit;
import static pa.MenuKeuangan.kredit;
import static pa.MyDB.stmt;


/**
 *
 * @author LENOVO
 */
public class Bisnis extends Aktor implements RoleBisnis{
   static ArrayList<Bisnis> bisnis = Main.bisnis;
   static int nomorUrut;
    static MyDB db = new MyDB();


    protected String namaBisnis;

    protected final String status = "Bisnis";

    public Bisnis(String namaBisnis, String alamat, String username, String pass, String id, String nomorhp, String Status) {
        super(alamat, username, pass, id, nomorhp);
        this.namaBisnis = namaBisnis;
    }

    public Bisnis() {
        
        
    }

    
    public String getNamaBisnis() {
        return namaBisnis;
    }

    public void setNamaBisnis(String namaBisnis) {
        this.namaBisnis = namaBisnis;
    }

    public String getStatus() {
        return status;
    }

    

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }
    
    
    @Override
    public void register() throws IOException {
        no_urut();
        nomorUrut +=1;
        String id = "B"+  nomorUrut;
        String addnama = register.rnama.getText();
        String addNomorhp = register.rnohp.getText();
        String addAlamat = register.ralamat.getText();
        String addusername = register.rusername1.getText();
        String addPass = register.rpassword.getText();
        Bisnis bisniss = new Bisnis(addnama,addAlamat, addusername, addPass, id, addNomorhp, "Bisnis");
        bisnis.add(bisniss);
        MyDB.insertAkun(id, addnama, addAlamat, addNomorhp, "Bisnis", addusername, addPass);
    }
    
    public static void no_urut(){
        nomorUrut=0;
        String id;
        id = bisnis.get(bisnis.size()-1).getId_user();
        nomorUrut = Integer.parseInt(id.substring(1));
              
    }

    @Override
    public void UbahAkun() throws IOException {
        for (int i=0; i <  bisnis.size(); i++){
            if (Main.idlogin.equals(bisnis.get(i).getId_user())){
                String addnama = menu_ubah.txtNama.getText();
                String addNomorhp = menu_ubah.txtNomorHp.getText();            
                String addAlamat = menu_ubah.txtAlamat.getText();
                String addusername = menu_ubah.txtUsername.getText();
                String addPass = menu_ubah.txtpass.getText();
                Bisnis bisniss = new Bisnis(addnama,addAlamat, addusername, addPass, Main.idlogin, addNomorhp, "Bisnis");
                bisnis.set(i, bisniss);
                MyDB.updateAkun(Main.idlogin, addnama, addAlamat, addNomorhp, "Bisnis", addusername, addPass);
                Main.namaLogin = addnama;
            }
        }

    }

    @Override
    public void HapusAkun() throws Exception {
        for (int i=0; i <  bisnis.size(); i++){
            if (Main.idlogin.equals(bisnis.get(i).getId_user())){
                bisnis.remove(i);
                
                if (debit.size()>0){
                    for (int z=0; z <  debit.size(); z++){
                        if (Main.idlogin.equals(debit.get(z).getID_user())){
                           
                             debit.remove(z);
                        }
                    }
                }
                if (kredit.size()>0){
                    for (int z=0; z <  kredit.size(); z++){
                        if (Main.idlogin.equals(kredit.get(z).getID_user())){
                           
                             kredit.remove(z);
                        }
                    }
                }
                String sql = String.format("DELETE tbkeuangan FROM tbkeuangan JOIN tbakun ON tbakun.id_user = tbkeuangan.Id_user WHERE tbkeuangan.Id_user='%s';", Main.idlogin);
                        try {
                            stmt.execute(sql);
                        } catch (SQLException ex) {
                            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
                        }
                MyDB.hapusAkun(Main.idlogin);
                

            }
        }

}

    @Override
    public void LihatAkun() throws IOException {
        for (int i=0; i <  bisnis.size(); i++){
            if (Main.idlogin.equals(bisnis.get(i).getId_user())){
                menu_akun.txtStatus.setText(bisnis.get(i).getStatus());
                menu_akun.txtID.setText(bisnis.get(i).getId_user());
                menu_akun.txtNama.setText(bisnis.get(i).getNamaBisnis());
                menu_akun.txtNomorHp.setText(bisnis.get(i).getNomorhp());
                menu_akun.txtAlamat.setText(bisnis.get(i).getAlamat());
                menu_akun.txtUsername.setText(bisnis.get(i).getUsername());
            
            }
        }    
    }


        
    
    
    
    
}
