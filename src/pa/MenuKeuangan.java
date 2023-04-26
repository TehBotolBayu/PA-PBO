package pa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import static pa.pemasukan.txtIDDEBIT;
import static pa.pengeluaran.txtIDKredit;



public class MenuKeuangan {

    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Debit> debit = new ArrayList<Debit>();
    static ArrayList<Kredit> kredit = new ArrayList<Kredit>();
    static Debit debitt = new Debit();
    static Kredit kreditt = new Kredit();
    static int totalDebit, totalKredit, Total, nomor1, nomor2;
    static MyDB db = new MyDB();


    

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
 
            MyDB.insertKeuangan(idDebit, addNama, addjenis, addJumlah, addTanggal, addCatat, "Debit", Main.idlogin);

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

        MyDB.insertKeuangan(idKredit, addNama, addjenis, addJumlah, addTanggal, addCatat, "Kredit", Main.idlogin);
    }

  
    
    public static void no_urut(){
        nomor1=0;
        nomor2=0;
        for (int i=0; i <  debit.size(); i++){
            if (Main.idlogin.equals(debit.get(i).getID_user())){
                String idDebitt = debit.get(i).getID();
                nomor1 = Integer.parseInt(idDebitt.substring(3))+1;
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
           
        }
        if (kredit.size()==0){
            nomor2=1;
        }
    }
/*
    public static void lihat() {
        System.out.println("aman1");
         Integer jumlahDebit = 0;
         Integer  jumlahKredit =0;
         int z=0;
        DefaultTableModel dtm = (DefaultTableModel) menu_keuangan.tabelData.getModel();
        dtm.setRowCount(0);
        System.out.println(kredit.size());
        System.out.println(debit.size());
        System.out.println("aman2");
        if (kredit.size()>0 && debit.size()>0){
            System.out.println("aman3");
            
            while(z < kredit.size() || z < debit.size()){
                if(z == kredit.size() || z == debit.size()){
                    return;
                }
                
                System.out.println(z);
                if (z != kredit.size()){
                    System.out.println("aman4");
                    if (Main.idlogin.equals(kredit.get(z).getID_user())&& kredit.get(z).getKategori().equals("Kredit")){
                        System.out.println("aman5");
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
                        System.out.println("aman6");
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
*/  
    
    public static void lihat(){
        int totalm = 0;
        int totalk = 0;
        DefaultTableModel dtm = (DefaultTableModel) menu_keuangan.tabelData.getModel();
        dtm.setRowCount(0);
        int z = 0;
        for(Debit db: debit){
            if(db.getID_user().equals(Main.idlogin)){
                        dtm.addRow(new Object[]{
                        db.getKategori(),
                        db.getID(),
                        db.getTanggal(),
                        db.getNama(),
                        db.getJumlah(),
                        0,
                        db.getJenis(),
                        db.getCatatan(),
                        });
                        totalm += db.getJumlah();
            }
            

        }
        for(Kredit kd: kredit){
            if(kd.getID_user().equals(Main.idlogin)){
                        dtm.addRow(new Object[]{
                        kd.getKategori(),
                        kd.getID(),
                        kd.getTanggal(),
                        kd.getNama(),
                        0,
                        kd.getJumlah(),
                        kd.getJenis(),
                        kd.getCatatan(),

                    }); 
                        totalk += kd.getJumlah();
            }
        }
            totalDebit = totalm;
            totalKredit = totalk;
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
                MyDB.updateKeuangan(idx, addNama, addjenis, addJumlah, addTanggal, addCatat, "Debit", Main.idlogin);
            }
        }
    }

    public static void update(Kredit kreditt) throws Exception{
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
                Kredit pengeluaran = new Kredit(addNama, addJumlah, addTanggal, addCatat, addjenis,null, idx, Main.idlogin);
                kredit.set(i, pengeluaran);
                MyDB.updateKeuangan(idx, addNama, addjenis, addJumlah, addTanggal, addCatat, "Kredit", Main.idlogin);
            }
        } 
    }
    

    public static void hapus(Debit debitt) throws Exception{
        String idx =  EditKeuangan.txtIDDEBIT.getText();
        for (int i=0; i <  debit.size(); i++){
            if (debit.get(i).getID().equals(idx) &&  Main.idlogin.equals(debit.get(i).getID_user())){
                    totalDebit -= debit.get(i).getJumlah();
                    debit.remove(i);
                    MyDB.hapusKeuangan(idx);

            }

        }
    }

    public static void hapus(Kredit kreditt) throws Exception{
        String idx =  EditKeuangan.txtIDDEBIT.getText();
        for (int i=0; i <  kredit.size(); i++){
            if (kredit.get(i).getID().equals(idx) &&  Main.idlogin.equals(kredit.get(i).getID_user())){
                    totalKredit -= kredit.get(i).getJumlah();
                    kredit.remove(i);
                    MyDB.hapusKeuangan(idx);
//                   
//
            }
        }
    }
}



