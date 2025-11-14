import java.util.Scanner;

public class PemesananKafe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); 
        }

        int totalBiaya = 0;
        for (int i = 0; i < jumlah; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("---------------------------");
        System.out.println("Total biaya: Rp" + totalBiaya);
        System.out.println("===========================");

        sc.close();
    }
}
