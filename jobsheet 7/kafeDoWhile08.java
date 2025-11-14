import java.util.Scanner;

public class kafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int Kopi, Teh, Roti, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        String namaPelanggan;

        do {
            System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar)");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("jumlah kopi :");
            Kopi = sc.nextInt();
            System.out.println("jumlah teh :");
            Teh = sc.nextInt();
            System.out.println("jumlah roti :");
            Roti = sc.nextInt();

            totalHarga = (Kopi*hargaKopi) + (Teh*hargaTeh) + (Roti* hargaRoti);
            System.out.println("Total yang harus dibayar : Rp" + totalHarga);
            sc.nextLine();
        } while(true);

    }
}

//1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan? 
// jawab : Walaupun langsung mengetik “batal” di awal, program tetap sudah masuk ke dalam perulangan sekali (karena DO-WHILE selalu menjalankan isi loop minimal 1 kali).
//         Setelah itu, karena ada break, perulangan langsung berhenti dan tidak dijalankan lagi.

//2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut! 
// jawab : Kondisi berhenti perulangan do-while pada program ini adalah ketika pengguna memasukkan nama pelanggan “batal”, program mengeksekusi break; dan perulangan berhenti.

//3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? 
// jawab : Fungsi penggunaan true di DO-WHILE  adalah membuat perulangan berjalan terus-menerus (infinite loop)
//         a. Berguna ketika kita ingin program selalu menunggu input pengguna sampai kondisi tertentu terpenuhi. Memberi fleksibilitas untuk berhenti dengan syarat khusus
//         b. Karena loop selalu jalan, kita bisa menambahkan break di dalam loop untuk menghentikannya saat syarat tertentu terjadi.
//         c.Contoh di programmu: perulangan berhenti hanya ketika pengguna mengetik “batal”

//4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
// jawab : Perulangan do-while tetap berjalan tanpa inisialisasi dan update karena :
//         a) DO-WHILE selalu menjalankan isi loop minimal satu kali.
//         b) Kondisi while(true) selalu benar, sehingga loop tidak membutuhkan penghitung atau update untuk berjalan.
//         c) Perulangan dihentikan oleh break saat kondisi tertentu (misal input “batal”), bukan oleh perubahan nilai variabel.
