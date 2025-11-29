package jobsheet11;

public class Kafe08 {
    public static void Menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian !");
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
        Menu("Andi", true);
    }
}

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