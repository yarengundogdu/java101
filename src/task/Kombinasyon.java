package task;

import java.util.Scanner;

public class Kombinasyon {

    static int fact (int n) {
        int i, sonuc = 1;

        for (i = 1; i <= n; i++)
            sonuc *= i;

        return sonuc;
    }

    public static void main(String[] args) {
        int c, n, r;

        Scanner input = new Scanner(System.in);
        System.out.print("N'in r'li kombinasyonu için,\nN değeri: ");
        n = input.nextInt();

        System.out.print("r değeri: ");
        r = input.nextInt();

        while (n < r) {
            System.out.println("N değeri r değerinden küçük olamaz. Tekrar deneyiniz.");
            System.out.print("N değeri: ");
            n = input.nextInt();

            System.out.print("r değeri: ");
            r = input.nextInt();
        }
        
        input.close();

        c = fact(n) / (fact(r) * fact(n - r));

        System.out.println("C(" + n + ", " + r + ") = " + c);
    }
}
