import java.util.Scanner;

public class SiakadWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int nilai, jml, i = 0;

        System.out.println("masukkan jumlah mahasiswa :");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("masukkan nilai mahasiswa ke-" +(i+1) +":");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah A");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah D");
            } else {
                System.out.println("nilai mahasiswa ke-" +(i+1) + "adalah E");
            }
            i++;
        }

    }
    
}

//1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut: 
//a. nilai < 0 || nilai > 100
// jawab : nilai < 0 || nilai > 100. Bagian ini adalah kondisi logika untuk memeriksa apakah nilai yang dimasukkan tidak valid. 
//         • nilai < 0 → bernilai true jika pengguna memasukkan angka kurang dari 0
//         • nilai > 100 → bernilai true jika pengguna memasukkan angka lebih dari 100
//         • || (dibaca: atau) → operator logika OR, artinya cukup salah satu kondisi benar, maka hasilnya benar.
//           Jadi, Kondisi ini bernilai true jika nilai di luar rentang 0–100

//b. continue
// jawab : continue adalah perintah untuk melompati sisa isi perulangan saat ini, lalu langsung lanjut ke iterasi berikutnya. 
//         Dengan kata lain Abaikan kode di bawahnya dalam loop ini, lanjut ke mahasiswa berikutnya

//2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE? 
//  jawab : i++ ditulis di akhir perulangan while supaya program menjalankan isi perulangan dulu (misal mencetak data), baru menaikkan penghitung i ke nilai berikutnya. 
//          Kalau i++ ditulis di awal, maka perulangan pertama akan “terlewat” karena nilai penghitung sudah naik duluan sebelum digunakan.

//3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan? 
//  jawab : Jika jumlah mahasiswa (jml) yang dimasukkan adalah 19,
//          maka perulangan while akan berjalan sebanyak 19 kali untuk nilai valid.
//          Namun, kalau ada nilai yang tidak valid (misalnya <0 atau >100),
//          perulangan akan bertambah karena continue; membuat program mengulang mahasiswa yang sama sampai mendapatkan nilai yang valid.

//4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, 
//program menampilkan pesan tambahan "Bagus, pertahankan nilainya"! 

//5. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”