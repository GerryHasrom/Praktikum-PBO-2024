    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

    package com.mycompany.gerryaicommunity;

    /**
     *
     * @author Asus
     */
    import java.util.ArrayList;
    import java.util.InputMismatchException;
    import java.util.Scanner;

    class LayananAI {
    private static ArrayList<LayananAI> layananList;  // Menjadikan layananList sebagai variabel statis
    String namaAnggota;
    int umur;
    String pekerjaan;
    String tujuanKepentingan;
    String namaAI;
    String jenisAI;
    double hargaLayanan;

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

    public static void setLayananList(ArrayList<LayananAI> list) {
        layananList = list;
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
    private ArrayList<LayananAI> layananList = new ArrayList<>();
    private ArrayList<String> layananTersedia = new ArrayList<>();
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

        LayananAI.setLayananList(layananList);  
    }

        public void menu_lihat() {
        if (layananList.isEmpty()) {
            System.out.println("Belum ada data pengguna layanan AI.");
            return;
        }
        
        System.out.println("==================================================");
        System.out.println("|   Daftar Penggunaan Layanan GerryAICommunity   |");
        System.out.println("==================================================");
        
        for (int i = 0; i < layananList.size(); i++) {
            LayananAI layanan = layananList.get(i);
            System.out.println((i + 1) + ". " + layanan);
        }
    }

        public void menu_tambah() {
            System.out.println("\n\n                             GerryAICommunity");
            System.out.println("==============================================");
            System.out.println("|        |    Menu Tambah Layanan:    |      |");
            System.out.println("==============================================");
            LayananAI layanan = new LayananAI(
                    inputNama("Nama Anggota"),
                    inputUmur(),
                    inputPekerjaan("Pekerjaan"),
                    input("Tujuan Kepentingan"),
                    inputNama("Nama AI"),
                    input("Jenis AI"),
                    inputHargaLayanan()
            );

            layananList.add(layanan);
            System.out.println("\nData Pengguna Layanan AI berhasil ditambahkan!");
        }

        public void menu_edit() {
            menu_lihat();

            if (layananList.isEmpty()) {
                System.out.println("Belum ada data pengguna layanan AI untuk diedit.");
                return;
            }

            System.out.print("Masukkan nomor data pengguna layanan AI yang ingin diedit: ");
            int nomorUpdate = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            if (nomorUpdate < 1 || nomorUpdate > layananList.size()) {
                System.out.println("Nomor tidak valid.");
                return;
            }

            LayananAI layanan = layananList.get(nomorUpdate - 1);
            System.out.println("\nData yang ingin diupdate:");
            System.out.println(layanan);

            layanan.namaAnggota = inputNama("Nama Anggota");
            layanan.umur = inputUmur();
            layanan.pekerjaan = inputPekerjaan("Pekerjaan");
            layanan.tujuanKepentingan = input("Tujuan Kepentingan");
            layanan.namaAI = inputNama("Nama AI");
            layanan.jenisAI = input("Jenis AI");
            layanan.hargaLayanan = inputHargaLayanan();

            System.out.println("Data Pengguna Layanan AI berhasil diedit!");
        }

        public void menu_hapus() {
            menu_lihat();

            if (layananList.isEmpty()) {
                System.out.println("Belum ada data pengguna layanan AI untuk dihapus.");
                return;
            }

            System.out.print("Masukkan nomor data pengguna layanan AI yang ingin dihapus: ");
            int nomorHapus = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            if (nomorHapus < 1 || nomorHapus > layananList.size()) {
                System.out.println("Nomor yang dimasukkan tidak valid.");
                return;
            }

            layananList.remove(nomorHapus - 1);
            System.out.println("Data Pengguna Layanan berhasil dihapus!");
        }

        private String input(String prompt) {
            System.out.print("Masukkan " + prompt + ": ");
            return scanner.nextLine();
        }

        private String inputNama(String prompt) {
            String nama;
            do {
                nama = input(prompt);
                if (!nama.matches("[a-zA-Z0-9 ]+")) {
                    System.out.println("Input harus berupa huruf dan angka.");
                }
            } while (!nama.matches("[a-zA-Z0-9 ]+"));
            return nama;
        }

        private int inputUmur() {
            int umur = 0;
            boolean validInput = false;

            do {
                try {
                    System.out.print("Masukkan Umur: ");
                    umur = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline character
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka.");
                    scanner.nextLine(); // Membersihkan buffer input
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
                    scanner.nextLine(); // Membersihkan newline character
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka.");
                    scanner.nextLine(); // Membersihkan buffer input
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
                        menu_tambah();
                        break;
                    case 2:
                        menu_lihat();
                        break;
                    case 3:
                        menu_edit();
                        break;
                    case 4:
                        menu_hapus();
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan program kami! Keberhasilan AI akan mengubah dunia.");
                        break; 
                    default:
                        System.out.println("Pilihan menu tidak valid. Silakan pilih lagi.");
                }
            } catch (InputMismatchException e) { // Error Handling
                System.out.println("Masukkan nomor menu yang valid.");
                scanner.nextLine(); // Membersihkan buffer input
                pilihan = 0; // Atur pilihan menjadi 0 agar loop terus berlanjut dan tidak berhenti
            }
        } while (pilihan != 5);
    }
}
    
    public class GerryAICommunity {
        public static void main(String[] args) {
            DatabaseLayananAI database = new DatabaseLayananAI();
            database.run();
        }
    }






