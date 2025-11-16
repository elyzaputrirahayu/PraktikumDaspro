import java.util.Scanner;

public class SurveyKepuasanPelanggan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        // a. Input nilai survey
        for (int i = 0; i < responden; i++) {
            System.out.println("\n=== Input data responden ke-" + (i + 1) + " ===");

            for (int j = 0; j < pertanyaan; j++) {
                int nilai;

                while (true) {
                    System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        break;
                    } else {
                        System.out.println("⚠ Nilai harus 1-5! Ulangi.");
                    }
                }

                survey[i][j] = nilai;
            }
        }

        System.out.println("\n============================================");
        System.out.println("b. Rata-rata setiap responden");
        System.out.println("============================================");

        // b. Rata-rata per responden
        for (int i = 0; i < responden; i++) {
            double total = 0;

            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }

            double rata = total / pertanyaan;
            System.out.println("Responden " + (i + 1) + " = " + rata);
        }

        System.out.println("\n============================================");
        System.out.println("c. Rata-rata setiap pertanyaan");
        System.out.println("============================================");

        // c. Rata-rata per pertanyaan
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;

            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }

            double rata = total / responden;
            System.out.println("Pertanyaan " + (j + 1) + " = " + rata);
        }

        System.out.println("\n============================================");
        System.out.println("d. Rata-rata keseluruhan");
        System.out.println("============================================");

        // d. Rata-rata keseluruhan
        double totalSemua = 0;

        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / (responden * pertanyaan);
        System.out.println("Rata-rata keseluruhan = " + rataKeseluruhan);

        System.out.println("\n=== Program selesai ===");
    }
}
