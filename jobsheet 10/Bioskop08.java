import java.util.Scanner;

public class Bioskop08 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [1][0] = "Candra";
        penonton [1][1] = "Dela";
        penonton [2][0] = "Eka";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        penonton [3][1] = "Hana";

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
        }

    }
}

// 1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
//    jawab : Tidak wajib mengisi array mulai indeks 0, Boleh mengisi indeks berapa pun secara acak, Tapi jika mencetak indeks yang belum diisi, hasilnya null

// 2. Mengapa terdapat null pada daftar nama penonton?
//    jawab : null = elemen array belum memiliki nilai / belum diisi, Java otomatis memberi nilai default null untuk array tipe objek seperti String. 
//            Kalau ingin menampilkan tanpa null, kamu harus mengisi semua indeks terlebih dahulu atau lakukan pengecekan sebelum mencetak.

// 3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut

// 4. Tambahkan kode program sebagai berikut:
//    - Jelaskan fungsi dari penonton.length dan penonton[0].length!
//      jawab : penonton.length digunakan untuk mengetahui jumlah baris pada array 2 dimensi, penonton[0].length digunakan untuk mengetahui jumlah kolom pada baris pertama

//    - Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
//      jawab : penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length bernilai sama, Semua baris punya jumlah kolom yang sama karena array dibuat dengan ukuran tetap [4][2].

// 5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.

// 6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.

// 7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.
// 8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya.
// 9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
// 10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
// 11. Berapa indeks baris maksimal untuk array penonton?
// 12. Berapa indeks kolom maksimal untuk array penonton?
// 13. Apa fungsi dari String.join()?
// 14. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
// Percobaan 1”