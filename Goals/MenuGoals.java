package Goals;
import java.util.*;
import java.io.*;


public class MenuGoals {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Goals> goals = new ArrayList<>();
    static int nomor;

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("   MENU GOALS CELENGANKU       ");
            System.out.println("===============================");
            System.out.println("1. Tambah Goals");
            System.out.println("2. Lihat Goals");
            System.out.println("3. Ubah Goals");
            System.out.println("4. Hapus Goals");
            System.out.println("5. Nabung");
            System.out.println("6. Keluar");
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
                    System.exit(0);
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
        int 
        System.out.print("Masukkan Nama Goals Tabungan: ");
        String addnama = br.readLine();
        System.out.print("Masukan Target Goals Tabungan : ");
        int addTarget = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nominal Pengisian: ");
        int adddana_kurang = Integer.parseInt(br.readLine());
        System.out.println("1. Harian");
        System.out.println("2. Mingguan");
        System.out.println("3. Bulanan");
        System.out.print("Pilihlah Rencana Pengisian: ");
        int pilih = Integer.parseInt(br.readLine());
        if (pilih == 1){
             addRencana = "Harian";
        }else if (pilih==2) {
             addRencana = "Mingguan";
        }  else {
             addRencana = "Bulanan";
        } 
        System.out.print("Masukkan Tanggal: ");
        String addTanggal = br.readLine();
        
        Goals glsBaru = new Goals();
        goals.add(glsBaru);

    }
    
    public static void lihatGoals() throws IOException{
        System.out.println("Lihat Data Goals");
                System.out.println(" Data Goals");
                for (int i= 0; i < goals.size(); i++) {
                        System.out.println("Tanggal Dibuat          : " + goals.get(i).getTanggal_dibuat());
                        System.out.println("Dana Terkumpul          : " + goals.get(i).getDana_terkumpul());
                        System.out.println("Dana Kurang             : " + goals.get(i).getDana_kurang());
                        System.out.println("Total Goals Dana        : " + goals.get(i).getTotal_goals_dana());
                        System.out.println("Tanggal Tercapai Goals  : " + goals.get(i).getTanggal_tercapai_goals());
                        System.out.print("\n");
                }
    }

    public static void ubahGls() throws IOException {
        System.out.print("Masukkan Indeks Goals: ");
        int idx = Integer.parseInt(br.readLine());

        if (idx <= goals.size() || idx > 0) {
            System.out.print("Masukan Tanggal Dibuat :");
            String addtanggal_dibuat = br.readLine();
            System.out.print("Masukkan Dana Terkumpul :");
            int adddana_terkumpul = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Dana Yang Kurang Dari Total :");
            int adddana_kurang = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Total Goals Dana :");
            int addtotal_goals_dana = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Estimasi Tanggal Tercapai Goals :");
            String addtanggal_tercapai_goals = br.readLine();
            goals.get(idx - 1).setTanggal_dibuat(addtanggal_dibuat);
            goals.get(idx - 1).setDana_terkumpul(adddana_terkumpul);
            goals.get(idx - 1).setDana_kurang(adddana_kurang);
            goals.get(idx - 1).setTotal_goals_dana(addtotal_goals_dana);
            goals.get(idx - 1).setTanggal_tercapai_goals(addtanggal_tercapai_goals);

            System.out.println("Data berhasil diedit!");
        } else {
            System.out.println("Data Tidak ada");
        }
    
    }
    public static void hapusGls() throws IOException {
        System.out.print("Masukkan Indeks Goals: ");
        int idx = Integer.parseInt(br.readLine());

        if (idx <= goals.size() || idx > 0) {
            goals.remove(idx - 1);

            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Data Tidak ada");
        }
        
    }
}