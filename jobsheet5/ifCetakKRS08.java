// package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS08
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---CETAK KRS SIAKADjava---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }
        String hasil= (uktLunas) ? "Registrasi berhasil. Silahkan cetak KRS" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu. ";   
            System.out.println("[versi ternary]" + hasil);
    }
}