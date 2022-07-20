import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String numbers = "";
        System.out.print("Bir Sayı Giriniz: ");
        n = scanner.nextInt();

        String asalSayilar = "";
        for (int i = 1; i <= n; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac ++;
                }
            }
            if (sayac == 2) {
                asalSayilar = asalSayilar + i + " ";
            }
        }
        System.out.println(n + " Sayısına Kadar Olan Asal Sayılar: " + asalSayilar);
    }
}