import java.util.Scanner;

public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            double nilai, tertinggi = 0, terendah = 100;
    int lulus = 0, tidaklulus = 0;

        for (int i = 1; i <=10; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" +i+ ":");
            nilai = sc.nextDouble();
            if ( (nilai > tertinggi)) {
                tertinggi = nilai;
            }
            if ( (nilai < terendah)) {
                terendah = nilai;
                
            }

            if ( nilai >= 60) {
                lulus++; 
            } else {
                tidaklulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah :" + terendah);
        System.out.println("Jumlah mahasiswa lulus :" +lulus);
        System.out.println("Jumlah mahasiswa tidak lulus :" + tidaklulus);

    }
    
}

//1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1! 
    // jawab : Komponen perulangan FOR pada program percobaan tersebut yaitu :
                //• Inisialisasi, int I = 1, Menetapkan nilai awal variabel penghitung (i) sebelum perulangan dimulai. Dalam contoh ini, i dimulai dari 1 karena mahasiswa pertama diberi nomor ke-1.
                //• Kondisi, i <= 10, Menentukan syarat agar perulangan terus berjalan. Selama i kurang dari atau sama dengan 10, blok perulangan akan terus dijalankan. Jika sudah lebih besar dari 10, perulangan berhenti.
                //• Update, i++, Menentukan cara menaikkan atau menurunkan nilai variabel penghitung setelah setiap putaran. i++ berarti nilai i bertambah 1 di setiap loop (1, 2, 3, …, 10).

//2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0? 
    //jawab : tertinggi diinisialisasi 0, Karena di awal program belum ada nilai mahasiswa yang dimasukkan, maka, Nilai awal tertinggi harus lebih kecil dari semua kemungkinan nilai. Biasanya nilai mahasiswa berkisar antara 0 sampai 100, jadi 0 adalah pilihan aman. nilai terendah harus lebih besar dari semua kemungkinan nilai mahasiswa.
            //Biasanya batas nilai maksimal adalah 100, jadi kita pakai 100 sebagai nilai awal. Jika dibalik (tertinggi = 100, terendah = 0), program tidak pernah memperbarui nilai tertinggi dan terendah, karena tidak ada input nilai mahasiswa yang lebih besar dari 100 atau lebih kecil dari 0.

//3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
    // jawab : Kode ini berfungsi untuk menentukan dan memperbarui nilai tertinggi serta nilai terendah dari sekumpulan data (nilai mahasiswa)
            //Alurnya :
            //1. Langkah 1 :
                //Mahasiswa ke-1 Memasukkan nilai 76
                //Jika kondisi nilai 76 > 0 itu benar maka tertinggi diubah jadi 76.
                //Jika kondisi nilai 76 < 100 itu benar maka terendah diubah jadi 76
                //Hasil sementara tertinggi = 76,  terendah 76
            //2.    Langkah 2 :
                //Mahasiswa ke2 memasukkan nilai 82
                //Jika kondisi 82 > 76 itu benar maka tertinggi = 82
                //Jika 82 < 76 itu salah maka terendah nya tetap 76
                //Hasil sementara  tertinggi = 82, terendah = 76
            //3.    Langkah 3 :
                //Mahasiswa ke-3 memasukkan nilai 62
                //Jika kondisi 62 > 82 itu salah maka tertinggi tetap 82
                //Jika kondisi 62 < 76 itu benar maka terendahnya 62
                //Hasil sementara tertinggi 82, terendahnya = 62
            //4.    Langkah 4 :
                //Mahasiswa ke-4 memasukkan nilai 88
                //Jika kondisi 88 > 82 itu benar maka tertinggi = 88
                //Jika kondisi 88 < 60 itu salah maka terendahnya tetap 62
                //Hasil sementara tertinggi = 88, terendah = 62

                //• Baris if (nilai > tertinggi) artinya Jika nilai saat ini lebih besar dari nilai tertinggi yang sudah ditemukan, jadikan nilai ini sebagai nilai tertinggi yang baru.
                //• Baris if (nilai < terendah) artinya  Jika nilai saat ini lebih kecil dari nilai terendah yang sudah ditemukan, jadikan nilai ini sebagai nilai terendah yang baru.

//4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa 
//mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). 
//Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah! 

//5. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”
