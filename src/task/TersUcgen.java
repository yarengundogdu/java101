package task;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int i, j, k, n;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        input.close();

        for (i = n; i > 0; i--) {
            for (j = i; j < n; j++)
                System.out.print(" ");
            for (k = 0; k < 2 * i - 1; k++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
