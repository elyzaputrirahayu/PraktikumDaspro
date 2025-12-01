package jobsheet11;

public class PengunjungCafe {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama Pengunjung : ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);

            for (String nama : namaPengunjung) {
                System.out.println("- " + nama);
            }
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

// 1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
//    jawab : Penulisan parameter String... namaPengunjung digunakan karena program ingin menerima jumlah data yang fleksibel (variabel) tanpa harus menentukan jumlah parameter secara pasti

// 2. Modifikasi method daftarPengunjung menggunakan for-each loop.

// 3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
//    jawab : bisa, menggunakan dua tipe data varargs dalam satu fungsi, tetapi tidak dalam satu parameter list yang sama. Artinya: Tidak boleh ada lebih dari satu varargs dalam satu fungsi. Menurut aturan varargs Java :
//            -	Hanya boleh ada satu varargs (...) dalam satu method, Karena varargs harus berada di posisi paling akhir
//              void contoh(int... a, String... b)  contoh yang salah
//            -	Varargs harus berada paling akhir
//              void contoh(String... a, int b)   contoh yang salah
//              lalu yang benar adalah : 
//                  public static void dataPengunjung(String tanggal, String... namaPengunjung) {
//                          System.out.println("Tanggal kunjungan: " + tanggal);
//                              for (String nama : namaPengunjung) {
//                                  System.out.println("- " + nama);
//                          }
//                  }

// 4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
//    Jika tetap berjalan, bagaimana output yang dihasilkan?
//    jawab : Kalau fungsi daftarPengunjung() dipanggil tanpa argumen, program tidak akan error sama sekali. Java tetap bisa menjalankannya karena varargs (String...) memang boleh menerima 0 data.
//            Hasilnya:
//            Program hanya menampilkan tulisan "Daftar nama Pengunjung :", tapi tidak ada nama apa pun di bawahnya karena tidak ada data yang diberikan.

// 5. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 4”