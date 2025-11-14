import java.util.Scanner;

public class Star08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai n =");
        int n = sc.nextInt();

        for (int i=1; i<=n; i += 2) {
            System.out.print("*");
        } 

    }
    
}

// 1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian? 
// jawab : i=1 diubah menjadi i=0 maka output bintangnya keluar 6, mengapa bisa begini ? karena perhitungannya dimulai dari 0, jadi mulai 0, 1, 2, 3, 4, 5, jadi yang keluar ada 6 bintang

// 2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda? 
// jawab : jika i=0 dan i<=n diubah menjadi i<n, dan input n=5 maka outputnya keluar Bintang 5, mengapa bisa begini ? karena menentukan berapa kali kondisi bernilai true I < n berhenti satu Langkah sebelum n, kalua i<= n masih dijalankan sampai nilai I sama dengan n

// 3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?  
// jawab : tidak muncul output bintangnya, karena i > 5 itu false, karena i = 1 jadi kalau 1 > 5 itu kan salah atau false, maka dari itu tidak muncul output bintangnya.

// 4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian? 
// jawab : Hasil output bintangnya atau loop nya tidak akan berhenti karena nilai I terus berkurang (semakin kecil) tetapi kondisi 1 <=n selalu benar karena angka kecil tetap kurang dari n

// 5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut? 
// jawab : Output Bintang keluar 3, karena biasanya i++ berarti menambah 1 setiap kali perulangan jadi jika n=6, i berjalan 1,2,3,4,5,6, totalnya 6 kali, tetapi kalau i += 2, berarti menambah 2 setiap kali perulangan, jadi bagian 1,3,5 yang berjalan, total hanya 3 kali perulangan