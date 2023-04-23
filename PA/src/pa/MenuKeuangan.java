package pa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import static pa.pemasukan.txtIDDEBIT;
import static pa.pengeluaran.txtIDKredit;



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
    


    public static void Manajemen() throws Exception{
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
        no_urut();
        hitung();
        UserPersonal myclass = new UserPersonal();
        while(true){
            System.out.println(" ");
            System.out.println("     SELAMAT DATANG");
            System.out.println("    PROGRAM KEUANGAN");
            System.out.println("Uang Anda: "+ Total);
            System.out.println("=====================================");
            System.out.println("1. Kategori Pemasukkan");
            System.out.println("2. Kategori Pengeluaran");
            System.out.println("3. Keseluruhan");
            System.out.println("4. Kembali");
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
                    myclass.Menu();
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
//        try {
            // ambil input dari user
            
            
            String idDebit = pemasukan.txtIDDEBIT.getText();
            String addNama =  pemasukan.txtNamaDebit.getText();
            String addjenis =  (String) pemasukan.cmbJenis.getSelectedItem();
            int addJumlah =  Integer.parseInt(pemasukan.txtJumlahDebit.getText());
            totalDebit += addJumlah;
            String addCatat = pemasukan.txtCatat.getText();
            String addTanggal = pemasukan.txtTanggal.getText();
            Debit pemasukkan = new Debit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idDebit, Main.idlogin);
            debit.add(pemasukkan);
            nomor1 += 1;
            String idDebitt = Main.idlogin+"D"+nomor1;
            txtIDDEBIT.setText(idDebitt);
 
            // query simpan
//            String sql = "INSERT INTO tbkeuangan (id, nama, jenis, jumlah, tanggal, catatan, kategori, Id_user) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s','%s')";
//            sql = String.format(sql, idDebit, addNama, addjenis, addJumlah, addTanggal, addCatat, "Debit", Main.idlogin );
//
//            // simpan buku
//            stmt.execute(sql);
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public static void tambah(Kredit kreditt) throws Exception{
//        try {
        String idKredit = pengeluaran.txtIDKredit.getText();
        String addNama =  pengeluaran.txtNamaKredit.getText();
        String addjenis =  (String) pengeluaran.cmbJenisK.getSelectedItem();
        int addJumlah =  Integer.parseInt(pengeluaran.txtJumlahKredit.getText());
        totalKredit += addJumlah;
        String addCatat = pengeluaran.txtCatatK.getText();
        String addTanggal = pengeluaran.txtTanggalK.getText();
        Kredit pengeluaran = new Kredit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idKredit, Main.idlogin);
        kredit.add(pengeluaran);
        nomor2 += 1;
        String idKreditt = Main.idlogin+"K"+nomor2;
        txtIDKredit.setText(idKreditt);

         // query simpan
//         String sql = "INSERT INTO tbkeuangan (id, nama, jenis, jumlah, tanggal, catatan, kategori, Id_user) VALUE('%s', '%s', '%s', '%s', '%s', '%s', '%s','%s')";
//         sql = String.format(sql, idKredit, addNama, addjenis, addJumlah, addTanggal, addCatat, "Kredit", Main.idlogin );
//
//         // simpan buku
//         stmt.execute(sql);
//         
//     } catch (Exception e) {
//         e.printStackTrace();
//     }
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
                    String id_user = rs.getString("Id_user");
                    Debit pemasukkan = new Debit(nama, jumlah, tanggal, catatan, jenis,kategori, id, id_user);
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
                    String id_user = rs.getString("Id_user");
                    Kredit pengeluaran = new Kredit(nama, jumlah, tanggal, catatan, jenis,kategori, id, id_user);
                    kredit.add(pengeluaran);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void no_urut(){
        nomor1=0;
        nomor2=0;
        for (int i=0; i <  debit.size(); i++){
            if (Main.idlogin.equals(debit.get(i).getID_user())){
                String idDebitt = debit.get(i).getID();
                nomor1 = Integer.parseInt(idDebitt.substring(3))+1;
            }
            else{
                nomor1=1;
            }
           
        }
        if (debit.size()==0){
            nomor1=1;
        }
        

        for (int i=0; i <  kredit.size(); i++){
            if (Main.idlogin.equals(kredit.get(i).getID_user())){
                String idKredit = kredit.get(i).getID();
                nomor2 = Integer.parseInt(idKredit.substring(3))+1;
               
            }
            else{
                nomor2=1;
            }
           
        }
        if (kredit.size()==0){
            nomor2=1;
        }
    }

    public static void lihat() {
         Integer jumlahDebit = 0;
         Integer  jumlahKredit =0;
         int z=0;
        DefaultTableModel dtm = (DefaultTableModel) menu_keuangan.tabelData.getModel();
        dtm.setRowCount(0);
        if (kredit.size()>0 && debit.size()>0){
            while(z < kredit.size() || z < debit.size()){
                if (z != kredit.size()){
                    if (Main.idlogin.equals(kredit.get(z).getID_user())&& kredit.get(z).getKategori().equals("Kredit")){
                        dtm.addRow(new Object[]{
                        kredit.get(z).getKategori(),
                        kredit.get(z).getID(),
                        kredit.get(z).getTanggal(),
                        kredit.get(z).getNama(),
                        0,
                        kredit.get(z).getJumlah(),
                        kredit.get(z).getJenis(),
                        kredit.get(z).getCatatan(),

                    }); 
                         jumlahKredit += kredit.get(z).getJumlah();
                    }
                }
                if(z != debit.size()){
                      if (Main.idlogin.equals(debit.get(z).getID_user())&& debit.get(z).getKategori().equals("Debit") ){
                        dtm.addRow(new Object[]{
                        debit.get(z).getKategori(),
                        debit.get(z).getID(),
                        debit.get(z).getTanggal(),
                        debit.get(z).getNama(),
                        debit.get(z).getJumlah(),
                        0,
                        debit.get(z).getJenis(),
                        debit.get(z).getCatatan(),

                        }); 
                         jumlahDebit += debit.get(z).getJumlah();
                    }
                }
                z +=1;
                
            }
        }
        else if (kredit.size()>0 && debit.size()==0){
            for (int i=0; i <  kredit.size(); i++){
                if (Main.idlogin.equals(kredit.get(i).getID_user())){
                    dtm.addRow(new Object[]{
                    kredit.get(i).getKategori(),
                    kredit.get(i).getID(),
                    kredit.get(i).getTanggal(),
                    kredit.get(i).getNama(),
                    0,
                    kredit.get(i).getJumlah(),
                    kredit.get(i).getJenis(),
                    kredit.get(i).getCatatan(),
            }); 
                   jumlahKredit += kredit.get(i).getJumlah();
                }
            }
        }
        else if (debit.size()>0 && kredit.size()==0){
           for (int i=0; i <  debit.size(); i++){
                if (Main.idlogin.equals(debit.get(i).getID_user())){
                    dtm.addRow(new Object[]{
                   debit.get(i).getKategori(),
                    debit.get(i).getID(),
                    debit.get(i).getTanggal(),
                    debit.get(i).getNama(),
                    debit.get(i).getJumlah(),
                    0,
                    debit.get(i).getJenis(),
                    debit.get(i).getCatatan(),
            }); 
                    jumlahDebit += debit.get(i).getJumlah();

                }
            }
        }
//    
            totalDebit = jumlahDebit;
            totalKredit = jumlahKredit;
            menu_keuangan.txtTotalDebit.setText(Integer.toString(totalDebit));
            menu_keuangan.txtTotalKredit.setText(Integer.toString(totalKredit));
            Total = totalDebit-totalKredit;
            menu_keuangan.txtTotal.setText(Integer.toString(Total));



        
    }

    public static void hitung() throws Exception{
        Integer jumlahDebit = 0;
         Integer  jumlahKredit =0;
        for (int i=0; i <  kredit.size(); i++){
            if (Main.idlogin.equals(kredit.get(i).getID_user())){
                jumlahKredit += kredit.get(i).getJumlah();
            }
        }

        for (int i=0; i <  debit.size(); i++){
            if (Main.idlogin.equals(debit.get(i).getID_user())){
                jumlahDebit += debit.get(i).getJumlah();
            }
        }
        totalDebit= jumlahDebit;
        totalKredit = jumlahKredit;
        Total = jumlahDebit-jumlahKredit;
    }

    public static void lihat(Kredit kreditt){
        int total =0;
        DefaultTableModel dtm = (DefaultTableModel) pengeluaran.tabelKredit.getModel();
        dtm.setRowCount(0);
            for (int i=0; i <  kredit.size(); i++){
                if (Main.idlogin.equals(kredit.get(i).getID_user())){
                    dtm.addRow(new Object[]{
                    kredit.get(i).getID(),
                    kredit.get(i).getNama(),
                    kredit.get(i).getJenis(),
                    kredit.get(i).getJumlah(),
                    kredit.get(i).getCatatan(),
                    kredit.get(i).getTanggal(),
            }); 
                    total += kredit.get(i).getJumlah();
                }
            }
            totalKredit = total;
            pengeluaran.txtTotalKredit.setText(Integer.toString(totalKredit));
    }
//        }    }

    public static void lihat(Debit debitt) {
        int total = 0;
        DefaultTableModel dtm = (DefaultTableModel) pemasukan.tabelDebit.getModel();
        dtm.setRowCount(0);
            for (int i=0; i <  debit.size(); i++){
                if (Main.idlogin.equals(debit.get(i).getID_user())){
                    dtm.addRow(new Object[]{
                    debit.get(i).getID(),
                    debit.get(i).getNama(),
                    debit.get(i).getJenis(),
                    debit.get(i).getJumlah(),
                    debit.get(i).getCatatan(),
                    debit.get(i).getTanggal(),
            }); 
                    total += debit.get(i).getJumlah();
                }
            }
            totalDebit = total;
            pemasukan.txtTotalDebit.setText(Integer.toString(totalDebit));
//        }
    } 

    public static void update(Debit debitt) throws Exception{
//        try {
//        lihat(debitt);
        int kondisi = 0;
//        String addjenis;
//        System.out.print("Masukkan ID Pemasukkan yang ingin diubah: ");
        String idx = EditKeuangan.txtIDDEBIT.getText();
        for (int i=0; i <  debit.size(); i++){
            if (debit.get(i).getID().equals(idx) && Main.idlogin.equals(debit.get(i).getID_user())){
                String idDebit = EditKeuangan.txtIDDEBIT.getText();
                String addNama =  EditKeuangan.txtNamaDebit.getText();
                String addjenis =  (String) EditKeuangan.cmbJenis.getSelectedItem();
                int addJumlah =  Integer.parseInt(EditKeuangan.txtJumlahDebit.getText());
                String addCatat = EditKeuangan.txtCatat.getText();
                String addTanggal = EditKeuangan.txtTanggal.getText();
                totalDebit += addJumlah;
                Debit pemasukkan = new Debit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idx, Main.idlogin);
                debit.set(i,pemasukkan);
                kondisi = 1;
//                String sql = "UPDATE tbkeuangan SET nama='%s', jenis='%s', jumlah='%s', tanggal='%s', catatan='%s', kategori='%s', Id_user='%s' WHERE id='%s'";
//                sql = String.format(sql, addNama, addjenis, addJumlah, addTanggal, addCatat, "Debit", Main.idlogin, idx);
//        
//                
//                stmt.execute(sql);
//                break;
            }
        }
//        if (kondisi == 0){
//            System.out.println("Pemasukkan gagal diubah");
//        }    
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void update(Kredit kreditt) throws Exception{
//        try {

//        lihat(kreditt);
        int kondisi = 0;
//        String addjenis;
//        System.out.print("Masukkan ID Pengeluaran yang ingin diubah: ");
         String idx = EditKeuangan.txtIDDEBIT.getText();
        for (int i=0; i <  kredit.size(); i++){
            if (kredit.get(i).getID().equals(idx) && Main.idlogin.equals(kredit.get(i).getID_user())){
                String idDebit = EditKeuangan.txtIDDEBIT.getText();
                String addNama =  EditKeuangan.txtNamaDebit.getText();
                String addjenis =  (String) EditKeuangan.cmbJenis.getSelectedItem();
                int addJumlah =  Integer.parseInt(EditKeuangan.txtJumlahDebit.getText());
                String addCatat = EditKeuangan.txtCatat.getText();
                String addTanggal = EditKeuangan.txtTanggal.getText();
                totalKredit += addJumlah;
                kondisi = 1;
                Kredit pengeluaran = new Kredit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idx, Main.idlogin);
                kredit.set(i, pengeluaran);
                kondisi = 1;
//                String sql = "UPDATE tbkeuangan SET nama='%s', jenis='%s', jumlah='%s', tanggal='%s', catatan='%s', kategori='%s', Id_user = '%s' WHERE id='%s'";
//                sql = String.format(sql, addNama, addjenis, addJumlah, addTanggal, addCatat, "Kredit",Main.idlogin, idx);
//    
//                stmt.execute(sql);
//                break;
            }
        }
//        if (kondisi == 0){
//            System.out.println("Pengeluaran gagal diubah");
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void hapus(Debit debitt) throws Exception{
//        try {
//        lihat(debitt);
//        int kondisi = 0;
//        System.out.print("Masukkan ID Pemasukkan yang ingin dihapus: ");
        String idx =  EditKeuangan.txtIDDEBIT.getText();
        for (int i=0; i <  debit.size(); i++){
            if (debit.get(i).getID().equals(idx) &&  Main.idlogin.equals(debit.get(i).getID_user())){
                    totalDebit -= debit.get(i).getJumlah();
                    debit.remove(i);
//                    String sql = String.format("DELETE FROM tbkeuangan WHERE id='%s'", idx);
//                    // hapus data
//                    stmt.execute(sql);
//                    kondisi = 1;
//                    System.out.println("Data pemasukkan berhasil dihapus");

                }
//                else{
//                    kondisi = 0;
//                    break;
//                }

            }
        }
//        if (kondisi == 0){
//            System.out.println("Data pemasukkan gagal dihapus");
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    

    public static void hapus(Kredit kreditt) throws Exception{
//        try {
        String idx =  EditKeuangan.txtIDDEBIT.getText();
        for (int i=0; i <  kredit.size(); i++){
            if (kredit.get(i).getID().equals(idx) &&  Main.idlogin.equals(kredit.get(i).getID_user())){
                    totalKredit -= kredit.get(i).getJumlah();
                    kredit.remove(i);
//                    String sql = String.format("DELETE FROM tbkeuangan WHERE id='%s'", idx);
//                    // hapus data
//                    stmt.execute(sql);
//                    kondisi = 1;
//                    System.out.println("Data pengeluaran berhasil dihapus");
//
                }
//                else{
//                    kondisi = 0;
//                    break;
        }

//            }
//        }
//        if (kondisi == 0){
//            System.out.println("Data pengeluaran gagal dihapus");
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
    }
}



