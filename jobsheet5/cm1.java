import java.util.Scanner;

public class cm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, NIM;
        int utsAlg, uasAlg, tugasAlg;
        int utsStruktur, uasStruktur, tugasStruktur;

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");
        nama = sc.nextLine();
        System.out.print("NIM\t: ");
        NIM = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Alogritma dan Pemograman ---");
        System.out.print("Nilai UTS\t: ");
        utsAlg = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uasAlg = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugasAlg = sc.nextInt();

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        utsStruktur = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uasStruktur = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugasStruktur = sc.nextInt();

        double persenAlg = utsAlg * 0.30 + uasAlg * 0.40 + tugasAlg * 0.30;
        double persenStruktur = utsStruktur * 0.30 + uasStruktur * 0.40 + tugasStruktur * 0.30;

        String algoritmaChar =
                (persenAlg <= 39) ? "E" :
                (persenAlg <= 50) ? "D" :
                (persenAlg <= 60) ? "C" :
                (persenAlg <= 65) ? "C+" :
                (persenAlg <= 73) ? "B" :
                (persenAlg <= 80) ? "B+" : "A";

        String StrukturChar =
                (persenStruktur <= 39) ? "E" :
                (persenStruktur <= 50) ? "D" :
                (persenStruktur <= 60) ? "C" :
                (persenStruktur <= 65) ? "C+" :
                (persenStruktur <= 73) ? "B" :
                (persenStruktur <= 80) ? "B+" : "A";

        String lulusMatkulAlg = (persenAlg >= 60) ? "LULUS" : "Tidak Lulus";
        String lulusMatkulStruktur = (persenStruktur >= 60) ? "LULUS" : "Tidak Lulus";

        double avgNilaiAkhir = (persenAlg + persenStruktur) / 2.0;
        boolean keduaLulus = "LULUS".equals(lulusMatkulAlg) && "LULUS".equals(lulusMatkulStruktur);
        String statusSemester = (keduaLulus && avgNilaiAkhir >= 70) ? "LULUS" : "TIDAK LULUS";

        String persenAlglimit = String.format("%.2f", persenAlg);
        String persenStrlimit = String.format("%.2f", persenStruktur);
        String persenNilaiAKhirLimit = String.format("%.2f", avgNilaiAkhir);

        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\t\tTugas\tNilai Akhir\t\tNilai Huruf\t\tStatus");
        System.out.println("================================================================");
        System.out.println("Algoritma pemograman\t\t" + utsAlg + "\t" + uasAlg + "\t\t" + tugasAlg + "\t" + persenAlglimit + "%\t\t\t" + algoritmaChar + "\t\t\t" + lulusMatkulAlg);
        System.out.println("Struktur Data\t\t\t" + utsStruktur + "\t" + uasStruktur + "\t\t" + tugasStruktur + "\t" + persenStrlimit + "%\t\t\t" + StrukturChar + "\t\t\t" + lulusMatkulStruktur);

        System.out.println("Rata rata nilai akhir\t\t: " + persenNilaiAKhirLimit);
        System.out.println("Status Semester\t\t\t: " + statusSemester);
    }
    
}
