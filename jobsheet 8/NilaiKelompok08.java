import java.util.Scanner;

public class NilaiKelompok08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int nilai;
        float totalNilai,rataNilai;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        int i=1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
        
            totalNilai = 0;
            for ( int j = 1;j<=5;j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ":");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            System.out.println();

            if ( (rataNilai > rataTertinggi)) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }

        System.out.println("===============================================");
        System.out.println("kelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi);
        System.out.println("Dengan nilai rata-rata :" +rataTertinggi);
    }
}

// 1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0)  berada di dalam outer loop, bukan di luar. 
//    jawab : variable totalNilai digunakan untuk menyimpan jumlah nilai dari satu kelompok saja, jadi setiap kali outer loop (while (i <= 6) ) berjalan, totalNilai di reset ke 0, 
//            lalu inner loop ( for (int j=1; j<=5; j++) ) menjumlahkan 5 nilai penilai, setelah selesai, nilai rata-rata kelompok itu dihitung. 
//            Kemudian outer loop lanjut ke kelompok berikutnya, dan totalNilai di reset lagi agar tidak bercampur dengan nilai kelompok sebelumnya. 
//            Mengapa inisialisasi totalNilai = 0 ada didalam outer loop bukan di luar ? karena kalau totalNilai = 0 diletakkan diluar outer loop, nilainya akan terus bertambah tanpa direset setiap kali pindah kelompok. 
//            Akibatnya, nilai total dari kelompok sebelumnya akan ikut terhitung dikelompok berikutnya. Jadi intinya agar setiap kelompok punya perhitungan nilai sendiri yang independent.

// 2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut. 

// 3. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 4”