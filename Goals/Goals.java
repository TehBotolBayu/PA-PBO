package Goals;

public class Goals {

    public String target_tabungan;
    public String nama_goals;
    public String id_goals;
    // public String id_user;
    public String nominalPengisian;
    public String rencanaPengisian;
    public String tanggal;
    public String dana_tercapai;
    public int dana_terkumpul;
    public int dana_kurang;

    
    public Goals(String target_tabungan, String nama_goals, String id_goals, String nominalPengisian,
            String rencanaPengisian, String tanggal, String dana_tercapai, int dana_terkumpul, int dana_kurang) {
        this.target_tabungan = target_tabungan;
        this.nama_goals = nama_goals;
        this.id_goals = id_goals;
        this.nominalPengisian = nominalPengisian;
        this.rencanaPengisian = rencanaPengisian;
        this.tanggal = tanggal;
        this.dana_tercapai = dana_tercapai;
        this.dana_terkumpul = dana_terkumpul;
        this.dana_kurang = dana_kurang;
    }

    public String getTarget_tabungan() {
        return target_tabungan;
    }
    public void setTarget_tabungan(String target_tabungan) {
        this.target_tabungan = target_tabungan;
    }
    public String getNama_goals() {
        return nama_goals;
    }
    public void setNama_goals(String nama_goals) {
        this.nama_goals = nama_goals;
    }
    public String getId_goals() {
        return id_goals;
    }
    public void setId_goals(String id_goals) {
        this.id_goals = id_goals;
    }
    public String getNominalPengisian() {
        return nominalPengisian;
    }
    public void setNominalPengisian(String nominalPengisian) {
        this.nominalPengisian = nominalPengisian;
    }
    public String getRencanaPengisian() {
        return rencanaPengisian;
    }
    public void setRencanaPengisian(String rencanaPengisian) {
        this.rencanaPengisian = rencanaPengisian;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getDana_tercapai() {
        return dana_tercapai;
    }
    public void setDana_tercapai(String dana_tercapai) {
        this.dana_tercapai = dana_tercapai;
    }
    public int getDana_terkumpul() {
        return dana_terkumpul;
    }
    public void setDana_terkumpul(int dana_terkumpul) {
        this.dana_terkumpul = dana_terkumpul;
    }
    public int getDana_kurang() {
        return dana_kurang;
    }
    public void setDana_kurang(int dana_kurang) {
        this.dana_kurang = dana_kurang;
    }

        
}
