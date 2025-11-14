import java.util.Scanner;

public class ArrayBilangan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] bil = new int[4];

        bil [0] = 5;
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;

        for (int i = 0; i < 4; i++ ) {
            System.out.println(bil [i] );
        }

        System.out.println(bil [0]);
        System.out.println(bil [1]);
        System.out.println(bil [2]);
        System.out.println(bil [3]);
    }
}

// Pertanyaan 
//1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian ?
//   JAWAB : Terjadi eror karena angka yang ada koma (seperti 5.0 dan 7.5) adalah tipe desimal (double), sedangkan array int hanya bisa menyimpan angka bulat.
//         Jadi, Java menolak karena tipe datanya tidak cocok.

//2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

//3. Ubah statement pada langkah No 4 menjadi seperti berikut, Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
//   JAWAB : Program menampilkan isi array dua kali:
//           pertama dengan loop for,
//           kedua dengan print manual.

//4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
//   JAWAB : Jika ditulis i <= 4, maka program error karena mencoba mengakses elemen di luar batas array (bil[4] tidak ada).

//5. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”