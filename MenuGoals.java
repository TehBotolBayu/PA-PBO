
import java.util.*;
import java.io.*;


public class MenuGoals {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Goals> goals = new ArrayList<>();
    static int nomor;

    public static void Manajemen() throws Exception {
        while (true) {
            UserPersonal myclass = new UserPersonal();
            System.out.println("   MENU GOALS CELENGANKU       ");
            System.out.println("===============================");
            System.out.println("1. Tambah Goals");
            System.out.println("2. Lihat Goals");
            System.out.println("3. Ubah Goals");
            System.out.println("4. Hapus Goals");
            System.out.println("5. Nabung");
            System.out.println("6. Kembali");
            System.out.println("===============================");
            System.out.print("Masukan Pilihan Anda :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    tambahGls();
                    break;
                case 2:
                    lihatGoals();
                    break;
                case 3:
                    ubahGls();
                    break;
                case 4:
                    hapusGls();
                    break;
                case 5:
                    nabung();
                    break;
                case 6:
                    myclass.Menu();
                    break;
                default:
                    System.out.println("Pilihan Salah");
                    break;
            }
        }
    }

    public static void tambahGls() throws IOException{
        String addRencana;
        nomor +=1;
       
        String id_goals = nomor + "G";
        System.out.print("Masukkan Nama Goals Tabungan: ");
        String addnama = br.readLine();
        System.out.print("Masukan Target Goals Tabungan : ");
        int addTarget = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nominal Pengisian: ");
        int addNominal = Integer.parseInt(br.readLine());
        System.out.println("1. Harian");
        System.out.println("2. Mingguan");
        System.out.println("3. Bulanan");
        System.out.print("Pilihlah Rencana Pengisian: ");
        int pilih = Integer.parseInt(br.readLine());
        if (pilih == 1){
             addRencana = "Hari";
        }else if (pilih==2) {
             addRencana = "Minggu";
        }  else {
             addRencana = "Bulan";
        } 
        System.out.print("Masukkan Tanggal: ");
        String addTanggal = br.readLine();
        int tercapai = addTarget/addNominal;
        String dana_tercapai = tercapai +" " + addRencana ;
        int addkurang = addTarget;
        int addterkumpul = 0;
        Goals glsBaru = new Goals(addTarget, addnama, id_goals,addNominal,addRencana,addTanggal,dana_tercapai,addterkumpul,addkurang, Main.idlogin);
        goals.add(glsBaru);

    }
    
    public static void lihatGoals() throws IOException{
        for (int i= 0; i < goals.size(); i++) {
            if (Main.idlogin.equals(goals.get(i).getId_user())){
                System.out.println("ID                  : " + goals.get(i).getId_goals());
                System.out.println("Nama Goals Tabungan : " + goals.get(i).getNama_goals());
                System.out.println("Target Goals        : " + goals.get(i).getTarget_tabungan());
                System.out.println("Nominal Pengisian   : " + goals.get(i).getNominalPengisian());
                System.out.println("Tanggal             : " + goals.get(i).getTanggal());
                System.out.println("Durasi Goals        : " + goals.get(i).getDana_tercapai());
                System.out.println("Dana Terkumpul      : " + goals.get(i).getDana_terkumpul());
                System.out.println("Dana Kurang         : " + goals.get(i).getDana_kurang());
                System.out.print("\n");
            }
        }
    }

    public static void ubahGls() throws IOException {
        lihatGoals();
        String addRencana;
        System.out.print("Masukkan ID Goals: ");
        String idx = br.readLine();
        int kondisi = 0;
        for (int i= 0; i < goals.size(); i++) {
            if (goals.get(i).getId_goals().equals(idx) && Main.idlogin.equals(goals.get(i).getId_user())){
                System.out.print("Masukkan Nama Goals Tabungan: ");
                String addnama = br.readLine();
                System.out.print("Masukan Target Goals Tabungan : ");
                int addTarget = Integer.parseInt(br.readLine());
                System.out.print("Masukan Nominal Pengisian: ");
                int addNominal = Integer.parseInt(br.readLine());
                System.out.println("1. Harian");
                System.out.println("2. Mingguan");
                System.out.println("3. Bulanan");
                System.out.print("Pilihlah Rencana Pengisian: ");
                int pilih = Integer.parseInt(br.readLine());
                if (pilih == 1){
                    addRencana = "Hari";
                }else if (pilih==2) {
                    addRencana = "Minggu";
                }  else {
                    addRencana = "Bulan";
                } 
                System.out.print("Masukkan Tanggal: ");
                String addTanggal = br.readLine();
                int tercapai = addTarget/addNominal;
                String dana_tercapai = tercapai +" " + addRencana + " lagi";
                int addkurang = addTarget;
                goals.get(i).setNama_goals(addnama);
                goals.get(i).setTarget_tabungan(addTarget);
                goals.get(i).setNominalPengisian(addNominal);
                goals.get(i).setRencanaPengisian(addRencana);
                goals.get(i).setTanggal(addTanggal);
                goals.get(i).setDana_tercapai(dana_tercapai);
                goals.get(i).setDana_kurang(addkurang);

                System.out.println("Data berhasil diedit!");
                kondisi=1;
            }
        }   
        if (kondisi==0){
            System.out.println("Data Tidak ada");
        }
    }


    public static void hapusGls() throws IOException {
        lihatGoals();
        System.out.print("Masukkan ID Goals: ");
        String idx = br.readLine();
        int kondisi = 0;
        for (int i= 0; i < goals.size(); i++) {
            if (goals.get(i).getId_goals().equals(idx) && Main.idlogin.equals(goals.get(i).getId_user())){
                goals.remove(i);
                System.out.println("Data berhasil dihapus!");
                kondisi=1;
            }
        }
        if (kondisi==0){
            System.out.println("Data gagal dihapus!");
        }
 
    }

    public static void nabung() throws IOException {
        lihatGoals();
        System.out.print("Masukkan ID Goals: ");
        String idx = br.readLine();
        for (int i= 0; i < goals.size(); i++) {
            if (goals.get(i).getId_goals().equals(idx) && Main.idlogin.equals(goals.get(i).getId_user())){
                System.out.print("Masukkan jumlah uang yang ingin ditabung (RP): ");
                int tabungan = Integer.parseInt( br.readLine());
                int kurang = goals.get(i).getDana_kurang();
                int terkumpul = goals.get(i).getDana_terkumpul();
                int dana_terkumpull = terkumpul+tabungan;
                int dana_kurangg = kurang-tabungan;
                goals.get(i).setDana_terkumpul(dana_terkumpull);
                goals.get(i).setDana_kurang(dana_kurangg);
            }
        }
    }
}