import java.util.Scanner;

public class ArrayNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke- " + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir [i] > 70) {
                System.out.println("mahasiswa ke- " + i + " lulus! " );   
            } else {
                System.out.println("Mahasiswa ke- " + i + " tidak lulus!");
            }
        }

    }
}

//1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
//   Jawab : Kedua kondisi (i < nilaiAkhir.length dan i < 10) sama saja hasilnya, karena array memang berisi 10 elemen. Program tetap berjalan normal karena panjang array = 10, dan indeks maksimum = 9.

//2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
//   Jawab : Selama nilai i lebih kecil dari panjang array nilaiAkhir, maka perulangan akan terus berjalan, melakukan perulangan sebanyak jumlah elemen yang ada di array nilaiAkhir

//3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai> 70): ,Jalankan program dan jelaskan alur program!
//   Jawab : Program ini membaca nilai 10 mahasiswa, lalu menampilkan mahasiswa mana saja yang lulus (nilai > 70).
//           Bagian if digunakan untuk seleksi kondisi kelulusan, sedangkan dua loop digunakan untuk input dan pengecekan data.

//4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

//5. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”