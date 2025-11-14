import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int [jumlah];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++ ) {
            if ( key == arrNilai [i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}

//1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
//   Jawab : Statement break; digunakan untuk menghentikan perulangan (loop) secara paksa meskipun kondisi loop-nya masih memungkinkan untuk dilanjutkan.
//           break; berfungsi untuk menghentikan perulangan saat kondisi yang dicari sudah terpenuhi, agar program lebih efisien dan cepat.

//2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima
//input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin
//dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:

//3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan
//"Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.
//Contoh tampilan program sebagai berikut: