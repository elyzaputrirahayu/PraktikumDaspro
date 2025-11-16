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
    }
}

// 1. Tambahkan kode program sebagai berikut

// 2. Apa fungsi dari Arrays.toString()?
//    jawab : 

// 3. Apa nilai default untuk elemen pada array dengan tipe data int?

// 4. Tambahkan kode program berikut
// 5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang
// array dapat dimodifikasi setelah diinstansiasi?
// 6. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
// Percobaan 3”
