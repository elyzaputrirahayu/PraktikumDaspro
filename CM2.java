import java.util.Scanner;

public class CM2 {

    static String[] namaMahasiswa = new String[100];
    static String[] NIM = new String[100];
    static String[] jenisPrestasi = new String[100];
    static String[] tingkatPrestasi = new String[100];
    static int[] tahunPrestasi = new int[100];

    static int jumlahData = 0;

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== PENCATATAN PRESTASI MAHASISWA =====");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Cari Prestasi Berdasarkan Jenis");
        System.out.println("4. Hitung Jumlah Prestasi per Tingkat");
        System.out.println("5. Keluar");

        System.out.print("Pilih Menu : ");
        int PilihMenu = sc.nextInt();

        if (PilihMenu == 1) {
            tambahDataPrestasi();
        } else if (PilihMenu == 2) {
            tampilkanSemuaPrestasi();
        } else if (PilihMenu == 3) {
            cariPrestasiBerdasarkanJenis();
        } else if (PilihMenu == 4) {
            hitungJumlahPrestasiPerTingkat();
        } else if (PilihMenu == 5) {
            keluar();
        } else {
            System.out.println("Menu tidak valid");
        }
    }

    public static void tambahDataPrestasi () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa : ");
        namaMahasiswa [jumlahData]= sc.nextLine();

        System.out.print("Masukkan NIM Mahasiswa : ");
        NIM [jumlahData] = sc.nextLine();

        System.out.print("Masukkan Jenis Prestasi : ");
        jenisPrestasi [jumlahData] = sc.nextLine();

        System.out.print("Masukkan Tingkat Prestasi (Lokal/ Nasional/ Internasional): ");
        tingkatPrestasi [jumlahData] = sc.nextLine();
        
        while (
            !tingkatPrestasi[jumlahData].equalsIgnoreCase("Lokal") && 
            !tingkatPrestasi[jumlahData].equalsIgnoreCase("Nasional") && 
            !tingkatPrestasi[jumlahData].equalsIgnoreCase("Internasional")) {   
            {
            System.out.println("Input salah ! Harus Lokal/Nasional/Internasional.");
            System.out.print("Masukkan Tingkat Prestasi Lagi : ");
            tingkatPrestasi[jumlahData] = sc.nextLine();
            }
        }
        System.out.println("Tingkat prestasi sudah benar : " + tingkatPrestasi[jumlahData]);

        System.out.print("Masukkan Tahun Prestasi (2015 - 2025) : ");
        tahunPrestasi[jumlahData] = sc.nextInt();
        sc.nextLine();

        while (tahunPrestasi[jumlahData] < 2015 || tahunPrestasi[jumlahData] > 2025) {
            System.out.println("Input salah ! Tahun harus antara 2015 dan 2025 ");
            System.out.print("Masukkan Tahun Prestasi lagi : ");
            tahunPrestasi[jumlahData] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Data Prestasi berhasil ditambahkan.");
        jumlahData++;
    }

    public static void tampilkanSemuaPrestasi() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data Prestasi.");
            return;
        }
        System.out.println("\n===== DATA SEMUA PRESTASI =====");
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke - " + (i+1));
            System.out.println("Nama Mahasiswa : " +namaMahasiswa[i]);
            System.out.println("NIM : " + NIM[i]);
            System.out.println("Jenis Prestasi : " + jenisPrestasi[i]);
            System.out.println("Tingkat Prestasi : " +tingkatPrestasi[i]);
            System.out.println("Tahun Prestasi : " +tahunPrestasi[i]);
            System.out.println("---------------------------------------");
        }
    }

    public static void cariPrestasiBerdasarkanJenis() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jenis Prestasi yang ingin dicari : ");
        String carijenis = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (jenisPrestasi[i].equalsIgnoreCase(carijenis)) {
                ditemukan = true;
                System.out.println("------------------------------------");
                System.out.println("Data ke - " + (i+1));
                System.out.println("Nama Mahasiswa : " + namaMahasiswa[i]);
                System.out.println("NIM : " + NIM[i]);
                System.out.println("Jenis Prestasi : " + jenisPrestasi[i]);
                System.out.println("Tingkat Prestasi : " + tingkatPrestasi[i]);
                System.out.println("Tahun Prestasi : " + tahunPrestasi[i]);
                System.out.println("-------------------------------------");
            }
        }

        if (! ditemukan) {
            System.out.println("Tidak ada data dengan jenis Prestasi tersebut.");
        }
    }

    public static void hitungJumlahPrestasiPerTingkat () {
        if (jumlahData == 0) {
            System.out.println("Belum ada data Prestasi.");
            return;
        }

        int Lokal = 0;
        int Nasional = 0;
        int Internasional = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (tingkatPrestasi[i].equalsIgnoreCase("Lokal")) {
                Lokal++;
            } else if (tingkatPrestasi[i].equalsIgnoreCase("Nasional")) {
                Nasional++;
            } else if (tingkatPrestasi[i].equalsIgnoreCase("Internasional")) {
                Internasional++;
            }
        }

        System.out.println("\n===== JUMLAH PRESTASI PER TINGKAT =====");
        System.out.println("Lokal : " + Lokal);
        System.out.println("Nasional : " + Nasional);
        System.out.println("Internasional : " + Internasional);
    }

    public static void keluar() {
        System.out.println("terima kasih ! Program selesai");
        System.exit(0);
    }

    public static void main(String[] args) {
        while (true) {
            Menu();
        }
    }
}
