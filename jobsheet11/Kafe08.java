package jobsheet11;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Kafe08 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian !");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid ! anda mendapatkaan diskon 50%.");
        }

        else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid ! Anda mendapatkan diskon 30%.");
        }

        else {
            System.out.println("Kode promo invalid atau tidak tersedia.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

            int hargaTotal = hargaItems[pilihanMenu - 1]* banyakItem;

            double diskon = 0;

            if (kodePromo.equalsIgnoreCase("DISKON50")) {
                diskon = hargaTotal*0.50;
                System.out.println("kode promo valid ! Anda mendapatkan diskon 50%");
            }
            else if (kodePromo.equalsIgnoreCase("DISKON30")) {
                diskon = hargaTotal*0.30;
                System.out.println("kode promo valid ! Anda mendapatkan diskon 30%");
            }
            else {
                System.out.println("kode promo invalid atau tidak tersedia. tidak ada diskon");
            }

            int totalBayar = (int)(hargaTotal - diskon);

            return totalBayar;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON30");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang dipesan : ");
        int banyakItem = sc.nextInt();

        sc.nextLine();
        System.out.print("Masukkan kode promo : ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga setelah diskon : Rp" + totalHarga);
    }
}

//                     Pertanyaan percobaan 1
// 1. Apakah fungsi tanpa parameter selalu harus bertipe void?
//    jawab : tidak, yang wajib void adalah fungsi yang tidak mengembalikan nilai

// 2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? 
//    Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
//    jawab : Ya, daftar menu pada program kafe bisa ditampilkan tanpa menggunakan fungsi Menu().

// 3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
//    perintah penampilan menu langsung di dalam fungsi main.
//    jawab : kode lebih rapi terstruktur dan lebih efektif

// 4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
//    (mulai dari program dijalankan sampai daftar menu tampil di layar)
//    jawab : 
//           1. Program dijalankan
//              Komputer pertama kali masuk ke fungsi main(), karena semua program Java selalu mulai dari situ.

//           2. Di dalam main, ada perintah Menu(), Begitu komputer membaca baris itu, program berpindah sementara dari main() ke fungsi Menu().

//           3. Komputer pindah ke fungsi Menu() Lalu semua perintah yang ada di dalam Menu() dijalankan satu per satu.

//           4. Menu tampil di layar Setiap System.out.println() yang ada di dalam Menu() langsung muncul di layar.
//              Jadi daftar menu kopi, teh, roti bakar, semuanya di-print oleh fungsi itu.

//           5. Selesai jalankan Menu(), Setelah semua menu sudah ditampilkan, tugas fungsi Menu() selesai.

//           6. Komputer balik lagi ke main(), Komputer kembali ke baris berikutnya setelah Menu(); tadi.


//                      pertanyaan percobaan 2
// 1.	Apakah kegunaan parameter di dalam fungsi ?
//      jawab : Parameter pada fungsi berguna untuk mengirim data dari luar fungsi agar fungsi bisa bekerja sesuai kebutuhan.

// 2.	Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember ? 
//      jawab : Parameter namaPelanggan digunakan supaya fungsi bisa menampilkan sapaan yang berbeda untuk setiap orang, Parameter isMember bertipe boolean. Artinya, nilainya hanya true atau false. 
//              Ini digunakan untuk mengecek apakah pelanggan member atau bukan. Agar program menjadi lebih rapi dan tidak ada kode berulang

// 3.	Apakah parameter sama dengan variabel? Jelaskan.
//      jawab : : Tidak, parameter tidak sama dengan variabel, tetapi parameter adalah salah satu jenis variable, Parameter khusus untuk menerima nilai saat fungsi dipanggil, Variabel biasa dipakai untuk menyimpan data di dalam fungsi atau program.

// 4.	Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false ? 
//      jawab : cara kerja parameter isMember pada fungsi Menu() :
//                  1)	Fungsi Menu() dipanggil dengan nilai tertentu
//                  2)	Saat fungsi dijalankan, Java mengecek :
//                          	Jika isMember == true → kondisi benar → pesan diskon ditampilkan
//                          	Jika isMember == false → kondisi salah → pesan diskon tidak ditampilkan
//              Perbedaan outputnya :
//              Output
//              true	Menampilkan pesan: "Anda adalah member, dapatkan diskon 10%..."
//              false	Tidak menampilkan pesan apapun mengenai member


// 5.	Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember ? 
//      jawab : Jika memanggil fungsi Menu() tanpa menyertakan parameter, maka program akan error (tidak bisa dikompilasi).

// 6.	Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
//      jawab : 

// 7.	Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
//      jawab : public static void main(String[] args) {
//                  Menu("Andi", true, "DISKON30");

// 8.	Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
//      jawab : Penggunaan parameter membuat program lebih fleksibel, mudah dibaca, mudah dikembangkan, dan lebih efisien, dibandingkan menulis nilai langsung di dalam fungsi.

// 9.	Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”


//                              PERCOBAAN 3
// 1.	Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
//      jawab : 1)	Fungsi membutuhkan nilai kembalian jika kita membutuhkan hasil perhitungan / prosesnya untuk digunakan lagi di bagian lain program, contoh kode program pada program kafe adalah :
//                  public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
//                          int[] hargaItems = {15000, 20000, 22000, 12000, 10000,18000};

//                          int hargaTotal = hargaItems[pilihanMenu - 1]* banyakItem;
//                          return hargaTotal;        
//                   }
//                  Fungsi ini menghitung total harga, dan hasilnya harus dipakai lagi di main, sehingga wajib memakai return.
//               2)	Fungsi tidak membutuhkan return jika tugasnya hanya melakukan aksi, bukan mengembalikan nilai. Biasanya aksi seperti :
//                  -	menampilkan teks
//                  -	menampilkan menu
//                  -	mencetak hasil ke layar
//                  -	memberi informasi
//              contoh kode programnya adalah :
//              public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
//                      System.out.println("Selamat datang, " + namaPelanggan + "!");

//                      System.out.println("===== MENU RESTO KAFE =====");
//                      System.out.println("1. Kopi Hitam - Rp 15,000");
//                      System.out.println("2. Cappuccino - Rp 20,000");
//                      System.out.println("3. Latte - Rp 22,000");
//                      System.out.println("4. Teh Tarik - Rp 12,000");
//                      System.out.println("5. Roti Bakar - Rp 10,000");
//                      System.out.println("6. Mie Goreng - Rp 18,000");
//                      System.out.println("============================");
//                      System.out.println("Silahkan pilih menu yang Anda inginkan.");
//                }
//                 Fungsi ini hanya menampilkan menu dan informasi, tidak menghasilkan nilai yang perlu digunakan lagi, jadi cukup memakai void.


// 2.	Fungsi hitungTotalHargaNoPresensi saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. 
//      Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe. 
//      jawab : Tipe data nilai kembalian fungsi hitungTotalHarga adalah int, Karena fungsi ini mengembalikan total harga dalam bentuk bilangan bulat (integer). 
//              Parameter 1: int pilihanMenu
//              •	Digunakan untuk menentukan item apa yang dipilih pelanggan dari daftar menu.
//              •	Nilai pilihanMenu digunakan sebagai index dalam array harga : hargaItems[pilihanMenu - 1]
//              •	Contoh:
//                  Jika pelanggan memilih menu nomor 3, maka program mengambil harga dari hargaItems[2], yaitu Latte - Rp 22.000.
//              •	Artinya: nomor menu yang dipilih pelanggan.
//              Parameter 2: int banyakItem
//              •	Menyatakan berapa jumlah porsi atau item yang dipesan pelanggan.
//              •	Digunakan untuk menghitung total harga : hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
//              •	Contoh:
//              Jika pesan menu 3 sebanyak 2 item → total harga = 22.000 × 2.
//              •	Artinya: jumlah pesanan untuk menu tersebut.

// 3.	Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoPresensi dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon.
//      Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
//    

// 4.	Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), 
//      dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu) ?
// 5.	Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 3”
