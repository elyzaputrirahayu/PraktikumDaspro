package Kuis08Elyza;

import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        int paketMenu [][] = new int[5][3];
        int a, b, banyak8, rataRatapembelianChineseFood, totalpemasukkan;
        int menu8 = 5;
        int jumlah8 = 0;

        int hargaMakananLuarNegeri = 50000;
        int hargaMakananDalamNegeri = 35000;

        for ( a = 0; a <= menu8; a++); {
            for ( b = 1; b <= menu8; b++){
                System.out.println(" Chinese Food ");

            }
            jumlah8 += menu8;

        
        }
        System.out.println("\n=============== jumlah per menu ===============");
        System.out.println("jumlah per menu : " + jumlah8 );

        rataRatapembelianChineseFood = jumlah8 / menu8;
        System.out.println("rata rata pembelian : " + rataRatapembelianChineseFood );

        totalpemasukkan = rataRatapembelianChineseFood * hargaMakananLuarNegeri;
        System.out.println("total pemasukkan restoran dlm satu hari : " + totalpemasukkan);

    }
}

