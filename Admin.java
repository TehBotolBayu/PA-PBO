

public class Admin extends Aktor {
    protected String namaAdmin;
    protected final String status = "Admin";



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
    
    
}
