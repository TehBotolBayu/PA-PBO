package Keuangan;

public abstract class Aktor {
    protected String alamat;
    protected String username;
    protected String pass;
    protected String id_user;
    protected String nomorhp;
    public Aktor(String alamat, String username, String pass, String id_user, String nomorhp) {
        this.alamat = alamat;
        this.username = username;
        this.pass = pass;
        this.id_user = id_user;
        this.nomorhp = nomorhp;
    }
    public Aktor(){
        
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getId_user() {
        return id_user;
    }
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
    public String getNomorhp() {
        return nomorhp;
    }
    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    

    
}
