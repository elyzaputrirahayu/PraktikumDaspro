import java.util.Scanner;

public class PencarianMenuKafe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                System.out.println("Makanan \"" + menu[i] + "\" tersedia di menu (posisi ke-" + (i + 1) + ").");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak tersedia di menu.");
        }

        sc.close();

    }
}
