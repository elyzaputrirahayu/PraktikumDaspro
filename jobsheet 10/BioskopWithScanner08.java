import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] penonton = new String[4][2];

        String nama, next;
        int baris, kolom, menu;

        while (true) {
            System.out.println("\n==== MENU BIOSKOP ====");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextInt();
        
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lain nya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }   
                }
            }
        }
    }
}

// 1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
//    jawab : Tidak, Pengisian elemen array tidak harus dilakukan berurutan dari indeks ke-0. Jadi, pengisian boleh acak, misalnya langsung isi kursi baris 3 kolom 2, tidak harus mulai dari baris 1 kolom 1

// 2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
//    - Menu 1: Input data penonton
//    - Menu 2: Tampilkan daftar penonton
//    - Menu 3: Exit

// 3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia

// 4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali
// 5. Pada menu 2, jika kursi kosong, ganti null dengan ***
// 6. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”