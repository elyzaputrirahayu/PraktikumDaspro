import java.util.Scanner;

public class NilaiMahasiswa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        int total = 0;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 0; i < jumlah; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rata2 = (double) total / jumlah;

        System.out.println("\n=== HASIL DATA NILAI MAHASISWA ===");
        System.out.print("Nilai yang dimasukkan: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilaiMhs[i] + " ");
        }

        System.out.println("\nRata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        sc.close();
    }
}
