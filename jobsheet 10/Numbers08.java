import java.util.Arrays;
import java.util.Scanner;

public class Numbers08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}

// 1. Tambahkan kode program sebagai berikut

// 2. Apa fungsi dari Arrays.toString()?
//    jawab : Arrays.toString() digunakan untuk mengubah isi array menjadi bentuk String yang rapi dan mudah dibaca, sehingga bisa langsung ditampilkan ke layar.

// 3. Apa nilai default untuk elemen pada array dengan tipe data int?
//    jawab : Untuk array bertipe data int, nilai default setiap elemennya adalah 0 
//            Ini terjadi karena Java otomatis memberikan nilai awal (default value) untuk setiap elemen array tipe primitif.

// 4. Tambahkan kode program berikut

// 5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?
//    jawab : Ukuran array tidak bisa dimodifikasi setelah dibuat. Jika ingin ukuran berbeda, kamu harus membuat array baru

// 6. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 3”
