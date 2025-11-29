package jobsheet11;

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

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
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
// 8.	Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
// 9.	Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”
