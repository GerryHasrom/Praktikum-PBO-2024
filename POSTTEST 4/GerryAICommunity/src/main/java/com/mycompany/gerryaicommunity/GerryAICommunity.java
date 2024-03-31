    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */
    //   package luar modul  
    package com.mycompany.gerryaicommunity;

    /**
     *
     * @author Asus
     */
    import java.util.ArrayList;
    import java.util.InputMismatchException;
    import java.util.Scanner;

class LayananAI {
    private String namaAnggota; // private access modifier
    private int umur; // private access modifier
    protected String pekerjaan; // protected access modifier
    String tujuanKepentingan; // default access modifier
    public String namaAI; // public access modifier
    private String jenisAI; // private access modifier
    private double hargaLayanan; // private access modifier

    public LayananAI(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                     String namaAI, String jenisAI, double hargaLayanan) {
        this.namaAnggota = namaAnggota;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
        this.tujuanKepentingan = tujuanKepentingan;
        this.namaAI = namaAI;
        this.jenisAI = jenisAI;
        this.hargaLayanan = hargaLayanan;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getTujuanKepentingan() {
        return tujuanKepentingan;
    }

    public void setTujuanKepentingan(String tujuanKepentingan) {
        this.tujuanKepentingan = tujuanKepentingan;
    }

    public String getNamaAI() {
        return namaAI;
    }

    public void setNamaAI(String namaAI) {
        this.namaAI = namaAI;
    }

    public String getJenisAI() {
        return jenisAI;
    }

    public void setJenisAI(String jenisAI) {
        this.jenisAI = jenisAI;
    }

    public double getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(double hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }

    @Override
    public String toString() {
        return "Nama Anggota: " + namaAnggota +
                "\n   Umur: " + umur +
                "\n   Pekerjaan: " + pekerjaan +
                "\n   Tujuan Kepentingan: " + tujuanKepentingan +
                "\n   Nama AI: " + namaAI +
                "\n   Jenis AI: " + jenisAI +
                "\n   Harga Layanan: Rp" + hargaLayanan + "\n";
    }
}

class DatabaseLayananAI {
    private ArrayList<AICommunityMember> layananList = new ArrayList<>(); 

    public void setLayananList(ArrayList<AICommunityMember> layananList) {
        this.layananList = layananList;
    }

    public ArrayList<AICommunityMember> getLayananList() {
        return layananList;
    }
}


class AICommunityMember extends LayananAI {
    private String alamatEmail;
    
    public AICommunityMember(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                             String namaAI, String jenisAI, double hargaLayanan, String alamatEmail) {
        super(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan);
        this.alamatEmail = alamatEmail;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Alamat Email: " + alamatEmail + "\n";
    }
    
    public String getJenisAnggotaAI() {
    return "Anggota AI Umum";
}
}

class AITrainer extends AICommunityMember {
    private String spesialisasi;

    public AITrainer(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                     String namaAI, String jenisAI, double hargaLayanan, String alamatEmail, String spesialisasi) {
        super(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Spesialisasi: " + spesialisasi + "\n";
    }
    
    @Override
    public String getJenisAnggotaAI() {
        return "AI Trainer";
    }
}

class AIDeveloper extends AICommunityMember {
    private String platform;

    public AIDeveloper(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                       String namaAI, String jenisAI, double hargaLayanan, String alamatEmail, String platform) {
        super(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Platform: " + platform + "\n";
    }
    
    @Override
    public String getJenisAnggotaAI() {
        return "AI Developer";
    }
}

class AIResearcher extends AICommunityMember {
    private String bidangRiset;

    public AIResearcher(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                        String namaAI, String jenisAI, double hargaLayanan, String alamatEmail, String bidangRiset) {
        super(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail);
        this.bidangRiset = bidangRiset;
    }

    public String getBidangRiset() {
        return bidangRiset;
    }

    public void setBidangRiset(String bidangRiset) {
        this.bidangRiset = bidangRiset;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Bidang Riset: " + bidangRiset + "\n";
    }
    
    @Override
    public String getJenisAnggotaAI() {
        return "AI Researcher";
    }
}

class GerryAICommunity {
    private ArrayList<AICommunityMember> layananList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tampilanSelamatDatang() {
        boolean validInput = false;

        do {
            System.out.println("\n============================================================");
            System.out.println("|                          Welcome To                       |");
            System.out.println("|                       GerryAICommunity                    |");
            System.out.println("|        AI enthusiast community. Life in the world         |");
            System.out.println("|            cannot avoid the development of AI.            |");
            System.out.println("============================================================");
            System.out.println("|                         Create By:                        |");
            System.out.println("|                                                           |");
            System.out.println("|                  Nama : Gerry Hasrom                      |");
            System.out.println("|                  NIM  : 2209106094                        |");
            System.out.println("============================================================");
            System.out.print("Masukkan 'join' Untuk Masuk ke Menu Utama: ");
            String joinInput = scanner.nextLine().trim().toLowerCase();

            if (joinInput.equals("join")) {
                validInput = true;
            } else {
                System.out.println("Input tidak valid. Silakan coba lagi.");
            }
        } while (!validInput);

        DatabaseLayananAI databaseLayananAI = new DatabaseLayananAI();
        databaseLayananAI.setLayananList(layananList);
    }

    public void menuTambah() {
        System.out.println("\n\n                             GerryAICommunity");
        System.out.println("==============================================");
        System.out.println("|        |    Menu Tambah Layanan:    |      |");
        System.out.println("==============================================");
        AICommunityMember layanan = createAICommunityMember();

        layananList.add(layanan);
        System.out.println("\nData Pengguna Layanan AI berhasil ditambahkan!");
    }

    private AICommunityMember createAICommunityMember() {
        String namaAnggota = inputNama("Nama Anggota");
        int umur = inputUmur();
        String pekerjaan = inputPekerjaan("Pekerjaan");
        String tujuanKepentingan = inputTujuanKepentingan("Tujuan Kepentingan");
        String namaAI = input("Nama AI");
        String jenisAI = input("Jenis AI");
        double hargaLayanan = inputHargaLayanan();
        String alamatEmail = input("Alamat Email");

        int pilihan;
        do {
            System.out.println("\nPilih jenis anggota AI:");
            System.out.println("1. AI Trainer");
            System.out.println("2. AI Developer");
            System.out.println("3. AI Researcher");
            System.out.print("Pilihan (1-3): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    return createAITrainer(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail);
                case 2:
                    return createAIDeveloper(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail);
                case 3:
                    return createAIResearcher(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (true);
    }

    private AITrainer createAITrainer(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                                      String namaAI, String jenisAI, double hargaLayanan, String alamatEmail) {
        String spesialisasi = input("Spesialisasi");
        return new AITrainer(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail, spesialisasi);
    }

    private AIDeveloper createAIDeveloper(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                                           String namaAI, String jenisAI, double hargaLayanan, String alamatEmail) {
        String platform = input("Platform");
        return new AIDeveloper(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail, platform);
    }

    private AIResearcher createAIResearcher(String namaAnggota, int umur, String pekerjaan, String tujuanKepentingan,
                                             String namaAI, String jenisAI, double hargaLayanan, String alamatEmail) {
        String bidangRiset = input("Bidang Riset");
        return new AIResearcher(namaAnggota, umur, pekerjaan, tujuanKepentingan, namaAI, jenisAI, hargaLayanan, alamatEmail, bidangRiset);
    }

    public void menuLihat() {
    if (layananList.isEmpty()) {
        System.out.println("Belum ada data pengguna layanan AI.");
        return;
    }

    System.out.println("==================================================");
    System.out.println("|   Daftar Penggunaan Layanan GerryAICommunity   |");
    System.out.println("==================================================");

    for (int i = 0; i < layananList.size(); i++) {
        AICommunityMember layanan = layananList.get(i);
        System.out.println((i + 1) + ". " + layanan);
        System.out.println("   Jenis Anggota AI: " + layanan.getJenisAnggotaAI());
    }
}

    public void menuEdit() {
        menuLihat();

        if (layananList.isEmpty()) {
            System.out.println("Belum ada data pengguna layanan AI untuk diedit.");
            return;
        }

        System.out.print("Masukkan nomor data pengguna layanan AI yang ingin diedit: ");
        int nomorUpdate = scanner.nextInt();
        scanner.nextLine();

        if (nomorUpdate < 1 || nomorUpdate > layananList.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        AICommunityMember layanan = layananList.get(nomorUpdate - 1);
        System.out.println("\nData yang ingin diupdate:");
        System.out.println(layanan);

        layanan.setNamaAnggota(inputNama("Nama Anggota"));
        layanan.setUmur(inputUmur());
        layanan.setPekerjaan(inputPekerjaan("Pekerjaan"));
        layanan.setTujuanKepentingan(input("Tujuan Kepentingan"));
        layanan.setNamaAI(input("Nama AI"));
        layanan.setJenisAI(input("Jenis AI"));
        layanan.setHargaLayanan(inputHargaLayanan());
        if (layanan instanceof AITrainer) {
            ((AITrainer) layanan).setSpesialisasi(input("Spesialisasi"));
        } else if (layanan instanceof AIDeveloper) {
            ((AIDeveloper) layanan).setPlatform(input("Platform"));
        } else if (layanan instanceof AIResearcher) {
            ((AIResearcher) layanan).setBidangRiset(input("Bidang Riset"));
        }

        System.out.println("Data Pengguna Layanan AI berhasil diedit!");
    }

    public void menuHapus() {
        menuLihat();

        if (layananList.isEmpty()) {
            System.out.println("Belum ada data pengguna layanan AI untuk dihapus.");
            return;
        }

        System.out.print("Masukkan nomor data pengguna layanan AI yang ingin dihapus: ");
        int nomorHapus = scanner.nextInt();
        scanner.nextLine();

        if (nomorHapus < 1 || nomorHapus > layananList.size()) {
            System.out.println("Nomor yang dimasukkan tidak valid.");
            return;
        }

        layananList.remove(nomorHapus - 1);
        System.out.println("Data Pengguna Layanan berhasil dihapus!");
    }

    public void run() {
        tampilanSelamatDatang();

        int pilihan;
        do {
            System.out.println("\n\n                             GerryAICommunity");
            System.out.println("==============================================");
            System.out.println("|             |    Menu Utama:    |          |");
            System.out.println("==============================================");
            System.out.println("|                                            |");
            System.out.println("|     1. Tambah Data Layanan AI              |");
            System.out.println("|     2. Tampilkan Data Layanan AI           |");
            System.out.println("|     3. Edit Data Layanan AI                |");
            System.out.println("|     4. Hapus Data Layanan AI               |");
            System.out.println("|     5. Keluar Program                      |");
            System.out.println("==============================================");

            try {
                System.out.print("Pilih menu (1-5): ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); 

                switch (pilihan) {
                    case 1:
                        menuTambah();
                        break;
                    case 2:
                        menuLihat();
                        break;
                    case 3:
                        menuEdit();
                        break;
                    case 4:
                        menuHapus();
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan program kami! Keberhasilan AI akan mengubah dunia.");
                        break;
                    default:
                        System.out.println("Pilihan menu tidak valid. Silakan pilih lagi.");
                }
            } catch (InputMismatchException e) { 
                System.out.println("Masukkan nomor menu yang valid.");
                scanner.nextLine(); 
                pilihan = 0; 
            }
        } while (pilihan != 5);
    }

    private String input(String prompt) {
        System.out.print("Masukkan " + prompt + ": ");
        return scanner.nextLine();
    }

    private String inputNama(String prompt) {
        String nama;
        do {
            System.out.print("Masukkan " + prompt + ": ");
            nama = scanner.nextLine();
            if (!nama.matches("[a-zA-Z ]+")) {
                System.out.println("Input harus berupa huruf.");
            }
        } while (!nama.matches("[a-zA-Z ]+"));
        return nama;
    }

    private int inputUmur() {
        int umur = 0;
        boolean validInput = false;
        do {
            try {
                System.out.print("Masukkan Umur: ");
                umur = scanner.nextInt();
                scanner.nextLine(); 
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka.");
                scanner.nextLine(); 
            }
        } while (!validInput);
        return umur;
    }

    private double inputHargaLayanan() {
        double hargaLayanan = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print("Masukkan Harga Layanan: Rp. ");
                hargaLayanan = scanner.nextDouble();
                scanner.nextLine(); 
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka.");
                scanner.nextLine(); 
            }
        } while (!validInput);

        return hargaLayanan;
    }

    private String inputPekerjaan(String prompt) {
        String pekerjaan;
        do {
            pekerjaan = input(prompt);
            if (!pekerjaan.matches("[a-zA-Z ]+")) {
                System.out.println("Input harus berupa huruf.");
            }
        } while (!pekerjaan.matches("[a-zA-Z ]+"));
        return pekerjaan;
    }
    
    private String inputTujuanKepentingan(String prompt) {
        String tujuan;
        do {
            tujuan = input(prompt);
            if (!tujuan.matches("[a-zA-Z]+")) {
                System.out.println("Input harus berupa huruf.");
            }
        } while (!tujuan.matches("[a-zA-Z]+"));
        return tujuan;
    }

    public static void main(String[] args) {
        GerryAICommunity app = new GerryAICommunity();
        app.run();
    }
}







       





        






