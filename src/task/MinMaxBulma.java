package task;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        int i, n, min, max, num;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceğinizi yazınız: ");
        n = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        min = input.nextInt();
        max = min;

        for (i = 1; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            num = input.nextInt();

            if (max < num)
                max = num;

            if (min > num)
                min = num;
        }

        input.close();

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
