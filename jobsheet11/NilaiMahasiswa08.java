package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa08 {

    public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] nilai) {
        System.out.println("\n===== Daftar Nilai Mahasiswa =====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa (N) : ");
        int N = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        int totalNilai = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);
    }
}
