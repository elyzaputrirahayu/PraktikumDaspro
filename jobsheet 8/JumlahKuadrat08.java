import java.util.Scanner;

public class JumlahKuadrat08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;
            System.out.print("n = " + i + " jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;

                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlahKuadrat);
        }
    }
}