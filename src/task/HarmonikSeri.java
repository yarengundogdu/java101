package task;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int n, i;
        double res = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        input.close();

        for (i = 1; i <= n; i++)
            res += (1.0 / i);

        System.out.println("Harmonik seri açılımı sonucu: " + res);
    }
}
