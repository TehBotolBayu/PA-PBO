

public abstract class Aktor {
    protected String alamat;
    private String username;
    private String pass;
    protected String id;
    protected String nomorhp;
    public Aktor(String alamat, String username, String pass, String id, String nomorhp) {
        this.alamat = alamat;
        this.username = username;
        this.pass = pass;
        this.id = id;
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
        return id;
    }
    public void setId_user(String id) {
        this.id = id;
    }
    public String getNomorhp() {
        return nomorhp;
    }
    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    

    
}
