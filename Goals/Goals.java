package Goals;


public class Goals {
    public String tanggal_dibuat;
    public int dana_terkumpul;
    public int dana_kurang;
    public int total_goals_dana;
    public String tanggal_tercapai_goals;
}

    public Goals(String tanggal_dibuat, int dana_terkumpul, int dana_kurang, int total_goals_dana, String tanggal_tercapai_goals) {
        this.tanggal_dibuat = tanggal_dibuat;
        this.dana_terkumpul = dana_terkumpul;
        this.dana_kurang = dana_kurang;
        this.total_goals_dana = total_goals_dana;
        this.tanggal_tercapai_goals = tanggal_tercapai_goals;
    }

    public String getTanggal_dibuat() {
        return tanggal_dibuat;
    }

    public void setTanggal_dibuat(String tanggal_dibuat) {
        this.tanggal_dibuat = tanggal_dibuat;
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

    public int getTotal_goals_dana() {
        return total_goals_dana;
    }

    public void setTotal_goals_dana(int total_goals_dana) {
        this.total_goals_dana = total_goals_dana;
    }

    public String getTanggal_tercapai_goals() {
        return tanggal_tercapai_goals;
    }

    public void setTanggal_tercapai_goals(String tanggal_tercapai_goals) {
        this.tanggal_tercapai_goals = tanggal_tercapai_goals;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Goals Keuangan");
            System.out.println("1. Tambah Goals");
            System.out.println("2. Lihat Goals");
            System.out.println("3. Ubah Goals");
            System.out.println("4. Hapus Goals");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan Anda :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    tambahGls();
                    break;
                case 2:
                    lihatGls();
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
        System.out.println("Tambah Data");
                System.out.print("Masukan Tanggal Pembuatan: ");
                String addtanggal_dibuat = br.readLine();
                System.out.print("Masukan Dana Terkumpul : ");
                int adddana_terkumpul = Integer.parseInt(br.readLine());
                System.out.print("Masukan Dana Yang Kurang Dari Total Goals: ");
                int adddana_kurang = Integer.parseInt(br.readLine());
                System.out.print("Masukan Total Dana Goals: ");
                int addtotal_goals_dana = Integer.parseInt(br.readLine());
                System.out.print("Masukan Estimasi Tanggal Tercapai Goals: ");
                String addtanggal_tercapai_goals = br.readLine();
                Goals glsBaru = new Goals(addtanggal_dibuat, adddana_terkumpul, adddana_kurang, addtotal_goals_dana, addtanggal_tercapai_goals);
                goals.add(glsBaru);

    }
    public static void lihatKdr() throws IOException{
        System.out.println("Lihat Data Goals");
                System.out.println(" Data Goals");
                for (Mobil value : mobil) {
                    System.out.println("Tanggal Dibuat: " + value.getTanggal_dibuat());
                    System.out.println("Dana Terkumpul: " + value.getDana_terkumpul());
                    System.out.println("Dana Kurang: " + value.getDana_kurang());
                    System.out.println("Total Goals Dana: " + value.getTotal_goals_dana());
                    System.out.println("Tanggal Tercapai Goals: " + value.getTanggal_tercapai_goals());
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
        break;
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
        break;
    }
