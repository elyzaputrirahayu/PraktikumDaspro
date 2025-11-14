import java.util.Scanner;

public class CM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        // Mata kuliah 1
        System.out.println("\n--- Mata Kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.print("Nilai Tugas: ");
        double tugas1 = sc.nextDouble();
        System.out.print("Nilai UTS: ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas1 = sc.nextDouble();

        double akhir1 = (tugas1 * 0.3) + (uts1 * 0.3) + (uas1 * 0.4);
        String huruf1 = "";
        String status1 = "";

        if (akhir1 >= 80) {
            huruf1 = "A"; status1 = "LULUS";
        } else if (akhir1 >= 73) {
            huruf1 = "B+"; status1 = "LULUS";
        } else if (akhir1 >= 65) {
            huruf1 = "B"; status1 = "LULUS";
        } else if (akhir1 >= 60) {
            huruf1 = "C+"; status1 = "LULUS";
        } else if (akhir1 >= 50) {
            huruf1 = "C"; status1 = "TIDAK LULUS";
        } else if (akhir1 >= 39) {
            huruf1 = "D"; status1 = "TIDAK LULUS";
        } else {
            huruf1 = "E"; status1 = "TIDAK LULUS";
        }

        // Mata kuliah 2
        System.out.println("\n--- Mata Kuliah 2 : Struktur Data ---");
        System.out.print("Nilai Tugas: ");
        double tugas2 = sc.nextDouble();
        System.out.print("Nilai UTS: ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas2 = sc.nextDouble();

        double akhir2 = (tugas2 * 0.3) + (uts2 * 0.3) + (uas2 * 0.4);
        String huruf2 = "";
        String status2 = "";

        if (akhir2 >= 80) {
            huruf2 = "A"; status2 = "LULUS";
        } else if (akhir2 >= 73) {
            huruf2 = "B+"; status2 = "LULUS";
        } else if (akhir2 >= 65) {
            huruf2 = "B"; status2 = "LULUS";
        } else if (akhir2 >= 60) {
            huruf2 = "C+"; status2 = "LULUS";
        } else if (akhir2 >= 50) {
            huruf2 = "C"; status2 = "TIDAK LULUS";
        } else if (akhir2 >= 39) {
            huruf2 = "D"; status2 = "TIDAK LULUS";
        } else {
            huruf2 = "E"; status2 = "TIDAK LULUS";
        }

        // Rata-rata dan status semester (Nested If)
        double rataRata = (akhir1 + akhir2) / 2;
        String statusSemester = "";

        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS SEMESTER";
            } else {
                statusSemester = "TIDAK LULUS SEMESTER";
            }
        } else {
            statusSemester = "TIDAK LULUS SEMESTER";
        }

        // Output hasil
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("\nMata Kuliah 1 : " + akhir1 + " (" + huruf1 + ") - " + status1);
        System.out.println("Mata Kuliah 2 : " + akhir2 + " (" + huruf2 + ") - " + status2);
        System.out.println("Rata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester: " + statusSemester); 
        
    System.out.println("\n=== PENILAIAN REGULER / PROFESIONAL / FAST TRACK ===");
        System.out.print("Masukkan nilai akhir reguler: ");
        double nilaiakhirreguler = sc.nextDouble();

        System.out.print("Masukkan nilai akhir profesional: ");
        double nilaiakhirprofesional = sc.nextDouble();

        System.out.print("Masukkan nilai akhir fast track: ");
        double nilaiakhirfasttrack = sc.nextDouble();

        System.out.println("\n--- Hasil Kategori ---");

        if (nilaiakhirfasttrack >= 70) {
            System.out.println("Kategori: FAST TRACK");
        } else if (nilaiakhirprofesional >= 65) {
            System.out.println("Kategori: PROFESIONAL");
        } else if (nilaiakhirreguler >= 60) {
            System.out.println("Kategori: REGULER");
        } else {
            System.out.println("Tidak masuk kategori manapun");
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("\nMata Kuliah 1 : " + akhir1 + " (" + huruf1 + ") - " + status1);
        System.out.println("Mata Kuliah 2 : " + akhir2 + " (" + huruf2 + ") - " + status2);
        System.out.println("Rata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester: " + statusSemester);    

         sc.close();
    }
}


        