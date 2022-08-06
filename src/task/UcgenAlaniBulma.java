package task;

import java.util.Scanner;

public class UcgenAlaniBulma {

    static int ucgenMi(int a, int b, int c){

        if (Math.abs(a - b) < c && c < a + b)

            if (Math.abs(b - c) < a && a < b + c)

                if (Math.abs(a - c) < b && b < a + c)

                    return 1;

        return 0;
    }

    public static void main(String[] args) {
        int a, b, c, kontrol;
        double u, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar: ");
        a = input.nextInt();

        System.out.print("2. kenar: ");
        b = input.nextInt();

        System.out.print("3. kenar: ");
        c = input.nextInt();

        kontrol = ucgenMi (a, b, c);

        if (kontrol == 0) {
            System.out.println("Girilen değerler herhangi bir üçgen oluşturmaz.");
            System.exit(1);
        }

        u = (a + b + c) / 2.0;
        cevre = u * 2.0;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
