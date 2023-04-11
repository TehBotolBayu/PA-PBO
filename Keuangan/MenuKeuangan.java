package Keuangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.*;



public class MenuKeuangan {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbmoneymanajer";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Debit> debit = new ArrayList<Debit>();
    static ArrayList<Kredit> kredit = new ArrayList<Kredit>();
    static Debit debitt = new Debit();
    static Kredit kreditt = new Kredit();
    static int totalDebit, totalKredit, Total, nomor1, nomor2;


    public static void main(String[] args) throws Exception{
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                move(debitt);
                move(kreditt);
                menu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void menu() throws Exception{
        Total = totalDebit-totalKredit;
        while(true){
            System.out.println(" ");
            System.out.println("     SELAMAT DATANG");
            System.out.println("    PROGRAM KEUANGAN");
            System.out.println("Uang Anda: "+ Total);
            System.out.println("=====================================");
            System.out.println("1. Kategori Pemasukkan");
            System.out.println("2. Kategori Pengeluaran");
            System.out.println("3. Keseluruhan");
            System.out.println("4. Keluar Program");

            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    menu(debitt);
                    break;
                case 2:
                    menu(kreditt);
                    break;
                case 3:
                    lihat();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
    }

    public static void menu(Debit debitt) throws Exception{
        while(true){
            System.out.println(" ");
            System.out.println("    KATEGORI PEMASUKKAN");
            System.out.println("=====================================");
            System.out.println("1. Tambah Pemasukkan");
            System.out.println("2. Lihat Pemasukkan");
            System.out.println("3. Edit Pemasukkan");
            System.out.println("4. Hapus Pemasukkan");
            System.out.println("5. Kembali");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    tambah(debitt);
                    break;
                case 2:
                    lihat(debitt);
                    break;
                case 3:
                    update(debitt);
                    break;
                case 4:
                    hapus(debitt);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
    }

    public static void menu(Kredit kreditt) throws Exception{
        while(true){
            System.out.println(" ");
            System.out.println("    KATEGORI PENGELUARAN");
            System.out.println("=====================================");
            System.out.println("1. Tambah Pengeluaran");
            System.out.println("2. Lihat Pengeluaran");
            System.out.println("3. Edit Pengeluaran");
            System.out.println("4. Hapus Pengeluaran");
            System.out.println("5. Kembali");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    tambah(kreditt);
                    break;
                case 2:
                    lihat(kreditt);
                    break;
                case 3:
                    update(kreditt);
                    break;
                case 4:
                    hapus(kreditt);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
    }

    public static void tambah(Debit debitt) throws IOException{
        
        // Debit pemasukkan = new Debit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idDebit);
        // debit.add(pemasukkan);
        try {
            // ambil input dari user
            String addjenis;
            nomor1 += 1;
            String idDebit = nomor1+"D";
            System.out.print("Masukkan Nama Pemasukkan: ");
            String addNama = br.readLine();
            System.out.println("1. Bulanan");
            System.out.println("2. Bonus");
            System.out.println("3. Upah");
            System.out.println("4. Lainnya");
            System.out.print("Pilihlah Jenis Pemasukkan: ");
            int pilih = Integer.parseInt(br.readLine());
            if (pilih == 1){
                addjenis = "Bulanan";
            }else if (pilih==2) {
                addjenis = "Bonus";
            }  else if(pilih==3){
                addjenis = "Upah";
            } else {
                addjenis = "Lainnya"; 
            }
            System.out.print("Masukkan Jumlah Pemasukkan: ");
            int addJumlah = Integer.parseInt(br.readLine());
            totalDebit += addJumlah;
            System.out.print("Masukkan Catatan Pemasukkan: ");
            String addCatat = br.readLine();
            System.out.print("Masukkan Tanggal Pemasukkan: ");
            String addTanggal = br.readLine();
            Debit pemasukkan = new Debit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idDebit);
            debit.add(pemasukkan);
 
            // query simpan
            String sql = "INSERT INTO tbkeuangan (id, nama, jenis, jumlah, tanggal, catatan, kategori) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
            sql = String.format(sql, idDebit, addNama, addjenis, addJumlah, addTanggal, addCatat, "Debit" );

            // simpan buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void tambah(Kredit kreditt) throws Exception{
        try {
        String addjenis;
        nomor2 += 1;
        String idKredit = nomor2+"K";
        System.out.print("Masukkan Nama Pengeluaran: ");
        String addNama = br.readLine();
        System.out.println("1. Makanan");
        System.out.println("2. Transportasi");
        System.out.println("3. Pakaian");
        System.out.println("4. Lainnya");
        System.out.print("Pilihlah Jenis Pengeluaran: ");
        int pilih = Integer.parseInt(br.readLine());
        if (pilih == 1){
             addjenis = "Makanan";
        }else if (pilih==2) {
             addjenis = "Transportasi";
        }  else if(pilih==3){
             addjenis = "Pakaian";
        } else {
             addjenis = "Lainnya"; 
        }
        System.out.print("Masukkan Jumlah Pengeluaran: ");
        int addJumlah = Integer.parseInt(br.readLine());
        totalKredit += addJumlah;
        System.out.print("Masukkan Catatan Pengeluaran: ");
        String addCatat = br.readLine();
        System.out.print("Masukkan Tanggal Pengeluaran: ");
        String addTanggal = br.readLine();
        Kredit pengeluaran = new Kredit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idKredit);
        kredit.add(pengeluaran);

         // query simpan
         String sql = "INSERT INTO tbkeuangan (id, nama, jenis, jumlah, tanggal, catatan, kategori) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
         sql = String.format(sql, idKredit, addNama, addjenis, addJumlah, addTanggal, addCatat, "Kredit" );

         // simpan buku
         stmt.execute(sql);
         
     } catch (Exception e) {
         e.printStackTrace();
     }
    }

    public static void move(Debit debitt) {
        String sql = "SELECT * FROM tbkeuangan";

        try {
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                if(rs.getString("kategori").equals("Debit")){
                    String id = rs.getString("id");
                    String nama = rs.getString("nama");
                    String jenis = rs.getString("jenis");
                    int jumlah = rs.getInt("jumlah");
                    String tanggal = rs.getString("tanggal");
                    String catatan = rs.getString("catatan");
                    String kategori = rs.getString("kategori");
                    Debit pemasukkan = new Debit(nama, jumlah, tanggal, catatan, jenis,kategori, id);
                    debit.add(pemasukkan);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void move(Kredit kreditt) {
        String sql = "SELECT * FROM tbkeuangan";

        try {
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                if(rs.getString("kategori").equals("Kredit")){
                    String id = rs.getString("id");
                    String nama = rs.getString("nama");
                    String jenis = rs.getString("jenis");
                    int jumlah = rs.getInt("jumlah");
                    String tanggal = rs.getString("tanggal");
                    String catatan = rs.getString("catatan");
                    String kategori = rs.getString("kategori");
                    Kredit pengeluaran = new Kredit(nama, jumlah, tanggal, catatan, jenis,kategori, id);
                    kredit.add(pengeluaran);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lihat() throws Exception{
         Integer jumlahDebit = 0;
         Integer  jumlahKredit =0;
        if (debit.size()==0 && kredit.size()==0){
            System.out.println("Pemasukkan dan Pengeluaran tidak ada");
        }
        else{
            for (int i=0; i <  debit.size(); i++){
                System.out.println("Kategori           : " + debit.get(i).getKategori());
                System.out.println("ID                 : " + debit.get(i).getID());
                System.out.println("Nama Pemasukkan    : " + debit.get(i).getNama());
                System.out.println("Jumlah Pemasukkan  : " + debit.get(i).getJumlah());
                System.out.println("Catatan            : " + debit.get(i).getCatatan());
                System.out.println("Tanggal            : " + debit.get(i).getTanggal());
                System.out.println("\n");
                jumlahDebit += debit.get(i).getJumlah();
            }
            for (int i=0; i <  kredit.size(); i++){
                System.out.println("Kategori           : " + kredit.get(i).getKategori());
                System.out.println("ID                 : " + kredit.get(i).getID());
                System.out.println("Nama Pengeluaran   : " + kredit.get(i).getNama());
                System.out.println("Jumlah Pengeluaran : " + kredit.get(i).getJumlah());
                System.out.println("Catatan            : " + kredit.get(i).getCatatan());
                System.out.println("Tanggal            : " + kredit.get(i).getTanggal());
                System.out.println("\n");
                jumlahKredit += kredit.get(i).getJumlah();
            }
            totalDebit = jumlahDebit;
            totalKredit = jumlahKredit;
            System.out.println("TOTAL PEMASUKKAN: "+ totalDebit);
            System.out.println("TOTAL PENGELUARAN: "+ totalKredit);
            Total = totalDebit-totalKredit;
            System.out.println("TOTAL KESELURUHAN: "+ Total);


        }
    }

    public static void lihat(Kredit kreditt) throws Exception{
        int total =0;
        if (kredit.size()==0){
            System.out.println("Pengeluaran tidak ada");
        }
        else{
            for (int i=0; i <  kredit.size(); i++){
                System.out.println("Kategori           : " + kredit.get(i).getKategori());
                System.out.println("ID                 : " + kredit.get(i).getID());
                System.out.println("Nama Pengeluaran   : " + kredit.get(i).getNama());
                System.out.println("Jumlah Pengeluaran : " + kredit.get(i).getJumlah());
                System.out.println("Catatan            : " + kredit.get(i).getCatatan());
                System.out.println("Tanggal            : " + kredit.get(i).getTanggal());
                System.out.println("\n");
                total += kredit.get(i).getJumlah();

            }
            totalKredit = total;
            System.out.println("TOTAL PENGELUARAN: "+ totalKredit);
        }
    }

    public static void lihat(Debit debitt) throws Exception{
        int total = 0;
        if (debit.size()==0){
            System.out.println("Pemasukkan tidak ada");
        }
        else{
            for (int i=0; i <  debit.size(); i++){
                System.out.println("Kategori           : " + debit.get(i).getKategori());
                System.out.println("ID                 : " + debit.get(i).getID());
                System.out.println("Nama Pemasukkan    : " + debit.get(i).getNama());
                System.out.println("Jumlah Pemasukkan  : " + debit.get(i).getJumlah());
                System.out.println("Catatan            : " + debit.get(i).getCatatan());
                System.out.println("Tanggal            : " + debit.get(i).getTanggal());
                System.out.println("\n");
                total += debit.get(i).getJumlah();
            }
            totalDebit = total;
            System.out.println("TOTAL PEMASUKKAN: "+ totalDebit);
        }
    }

    public static void update(Debit debitt) throws Exception{
        try {
        lihat(debitt);
        int kondisi = 0;
        String addjenis;
        System.out.print("Masukkan ID Pemasukkan yang ingin diubah: ");
        String idx = br.readLine();
        for (int i=0; i <  debit.size(); i++){
            if (debit.get(i).getID().equals(idx)){
                System.out.print("Masukkan Nama Pemasukkan: ");
                String addNama = br.readLine();
                System.out.println("1. Bulanan");
                System.out.println("2. Bonus");
                System.out.println("3. Upah");
                System.out.println("4. Lainnya");
                System.out.print("Pilihlah Jenis Pemasukkan: ");
                int pilih = Integer.parseInt(br.readLine());
                if (pilih == 1){
                    addjenis = "Bulanan";
                }else if (pilih==2) {
                    addjenis = "Bonus";
                }  else if(pilih==3){
                    addjenis = "Upah";
                } else {
                    addjenis = "Lainnya"; 
                }
                System.out.print("Masukkan Jumlah Pemasukkan: ");
                int addJumlah = Integer.parseInt(br.readLine());
                totalDebit += addJumlah;
                System.out.print("Masukkan Catatan Pemasukkan: ");
                String addCatat = br.readLine();
                System.out.print("Masukkan Tanggal Pemasukkan: ");
                String addTanggal = br.readLine();
                Debit pemasukkan = new Debit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idx);
                debit.set(i,pemasukkan);
                kondisi = 1;
                String sql = "UPDATE tbkeuangan SET nama='%s', jenis='%s', jumlah='%s', tanggal='%s', catatan='%s', kategori='%s' WHERE id=%d";
                sql = String.format(sql, addNama, addjenis, addJumlah, addTanggal, addCatat, "Debit", idx);
        
                
                stmt.execute(sql);
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Pemasukkan gagal diubah");
        }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Kredit kreditt) throws Exception{
        try {

        lihat(kreditt);
        int kondisi = 0;
        String addjenis;
        System.out.print("Masukkan ID Pengeluaran yang ingin diubah: ");
        String idx = br.readLine();
        for (int i=0; i <  kredit.size(); i++){
            if (kredit.get(i).getID().equals(idx)){
                System.out.print("Masukkan Nama Pengeluaran: ");
                String addNama = br.readLine();
                System.out.println("1. Makanan");
                System.out.println("2. Transportasi");
                System.out.println("3. Pakaian");
                System.out.println("4. Lainnya");
                System.out.print("Pilihlah Jenis Pengeluaran: ");
                int pilih = Integer.parseInt(br.readLine());
                if (pilih == 1){
                    addjenis = "Makanan";
                }else if (pilih==2) {
                    addjenis = "Transportasi";
                }  else if(pilih==3){
                    addjenis = "Pakaian";
                } else {
                    addjenis = "Lainnya"; 
                }
                System.out.print("Masukkan Jumlah Pengeluaran: ");
                int addJumlah = Integer.parseInt(br.readLine());
                totalKredit += addJumlah;
                System.out.print("Masukkan Catatan Pengeluaran: ");
                String addCatat = br.readLine();
                System.out.print("Masukkan Tanggal Pengeluaran: ");
                String addTanggal = br.readLine();
                Kredit pengeluaran = new Kredit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idx);
                kredit.set(i, pengeluaran);
                kondisi = 1;
                String sql = "UPDATE tbkeuangan SET nama='%s', jenis='%s', jumlah='%s', tanggal='%s', catatan='%s', kategori='%s' WHERE id=%d";
                sql = String.format(sql, addNama, addjenis, addJumlah, addTanggal, addCatat, "Kredit", idx);
    
                stmt.execute(sql);
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Pengeluaran gagal diubah");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hapus(Debit debitt) throws Exception{
        try {
        lihat(debitt);
        int kondisi = 0;
        System.out.print("Masukkan ID Pemasukkan yang ingin dihapus: ");
        String idx = br.readLine();
        for (int i=0; i <  debit.size(); i++){
            if (debit.get(i).getID().equals(idx)){
                System.out.println("Kategori           : " + debit.get(i).getKategori());
                System.out.println("ID                 : " + debit.get(i).getID());
                System.out.println("Nama Pemasukkan    : " + debit.get(i).getNama());
                System.out.println("Jumlah Pemasukkan  : " + debit.get(i).getJumlah());
                System.out.println("Catatan            : " + debit.get(i).getCatatan());
                System.out.println("Tanggal            : " + debit.get(i).getTanggal());
                System.out.print("Apakah tetap ingin menghapus data Pemasukkan? (0/1) ");
                int pil = Integer.parseInt(br.readLine());
                if (pil == 1){
                    totalDebit -= debit.get(i).getJumlah();
                    debit.remove(i);
                    String sql = String.format("DELETE FROM tbkeuangan WHERE id=%d", idx);
                    // hapus data
                    stmt.execute(sql);
                    kondisi = 1;
                    System.out.println("Data pemasukkan berhasil dihapus");

                }
                else{
                    kondisi = 0;
                    break;
                }

            }
        }
        if (kondisi == 0){
            System.out.println("Data pemasukkan gagal dihapus");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hapus(Kredit kreditt) throws Exception{
        try {
        lihat(kreditt);
        int kondisi = 0;
        System.out.print("Masukkan ID Pengeluaran yang ingin dihapus: ");
        String idx = br.readLine();
        for (int i=0; i <  kredit.size(); i++){
            if (kredit.get(i).getID().equals(idx)){
                System.out.println("Kategori           : " + kredit.get(i).getKategori());
                System.out.println("ID                 : " + kredit.get(i).getID());
                System.out.println("Nama Pengeluaran   : " + kredit.get(i).getNama());
                System.out.println("Jumlah Pengeluaran : " + kredit.get(i).getJumlah());
                System.out.println("Catatan            : " + kredit.get(i).getCatatan());
                System.out.println("Tanggal            : " + kredit.get(i).getTanggal());
                System.out.print("Apakah tetap ingin menghapus data pengeluaran? (0/1) ");
                int pil = Integer.parseInt(br.readLine());
                if (pil == 1){
                    totalKredit -= kredit.get(i).getJumlah();
                    kredit.remove(i);
                    String sql = String.format("DELETE FROM tbkeuangan WHERE id=%d", idx);
                    // hapus data
                    stmt.execute(sql);
                    kondisi = 1;
                    System.out.println("Data pengeluaran berhasil dihapus");

                }
                else{
                    kondisi = 0;
                    break;
                }

            }
        }
        if (kondisi == 0){
            System.out.println("Data pengeluaran gagal dihapus");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
