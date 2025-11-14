import java.util.Scanner;

public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan nilai n = ");

        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println("*");
            i++;
        }
    }
}

// 1.Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut? 
// * 
// ** 
// *** 
// **** 
// ***** 
// jawab : Tidak

// 2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.  
// jawab : Menambahkan system.out.println setelah inner loop setelah while ( j < I ), agar setiap baris Bintang dicetak dibaris baru

// 3. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?
// jawab : j adalah variable untuk perulangan dalam ( inner loop ), gunanya untuk mengontrol jumlah Bintang yang dicetak disetiap baris. 
//         j harus direset ke 0 setiap kali outer loop berjalan agar setiap kali i naik (baris baru) dapat mencetak ulang bintang dari awal. 
//         Jika j tidak di-reset, maka inner loop tidak akan berjalan pada baris berikutnya karena nilai j sudah mencapai batas sebelumnya.

// 4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 3” 