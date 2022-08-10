package task;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        int n, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        input.close();

        System.out.println("4'ün kuvvetleri:");

        for (i = 1; i <= n; i *= 4)
            System.out.println(i);

        System.out.println("5'in kuvvetleri:");

        for (i = 1; i <= n; i *= 5)
            System.out.println(i);
    }
}
