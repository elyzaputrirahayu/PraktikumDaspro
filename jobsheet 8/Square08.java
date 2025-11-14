import java.util.Scanner;

public class Square08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for(int iOuter=1; iOuter<=N; iOuter++) {
            for (int i=1; i<=N; i++) {
                System.out.print("*");
        }
            System.out.println("");
        }

    }
}

// 1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?  
//    jawab : iOuter=1 diubah menjadi iOuter=0 mengakibatkan output baris Bintangnya bertambah 1, maksudnya kita memasukkan n=5 maka output baris Bintangnya menjadi 6, mengapa demikian ? karena perulangannya dimulai dari 0 bukan dari 1, jadi gini 0,1,2,3,4,5 jadi keluar 6 baris

// 2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?  
//    jawab : inisialisasi i=1 diubah menjadi i=0, yang terjadi adalah pada bagian tiap baris bintangnya bertambah 1, mengapa demikian ? karena perulangannya dimulai dari 0 sehingga perhitungannya yaitu 0,1,2,3,4,5, dan kita memasukkan n=5 jadi menghasilkan output tiap baris bintangnya menjadi 6

// 3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?  
//    jawab : kegunaan perulangan luar untuk mengatur baris, dan kegunaan perulangan dalam untuk mengatur kolomnya atau mengatur isi tiap baris

// 4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan? 
//    jawab : jika dihilangkan maka tidak akan mencetak output bintangnya, tidak akan muncul bintangnya