package jobsheet11;

import java.util.Scanner;

public class RecapPenjualanCafe08 {
    static Scanner sc = new Scanner(System.in);
    static String[] menu;           
    static int[][] penjualan;       
    static int jumlahMenu;          
    static int jumlahHari;          

    public static void inputData() {
        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n=== INPUT NAMA MENU ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.next();
        }

        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilData() {
        System.out.println("\n=== TABEL PENJUALAN ===");

        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf("Hari-%d\t", h);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int maxIndex = 0;
        int maxTotal = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                maxIndex = i;
            }
        }

        System.out.println("\n=== MENU TERTINGGI ===");
        System.out.println("Menu : " + menu[maxIndex]);
        System.out.println("Total: " + maxTotal);
    }

    public static void rataRata() {
        System.out.println("\n=== RATA-RATA ===");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) jumlahHari;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu : ");
        jumlahMenu = sc.nextInt();

        System.out.print("Masukkan jumlah hari  : ");
        jumlahHari = sc.nextInt();

        inputData();
        tampilData();
        menuTertinggi();
        rataRata();
    }
}
