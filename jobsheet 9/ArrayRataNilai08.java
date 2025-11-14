import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke - " + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus = 0, rataTidakLulus = 0;
        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        }

        System.out.println();
        System.out.println("Rata-rata nilai lulus = " +rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}

//1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).

//2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:

//3. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 3”
