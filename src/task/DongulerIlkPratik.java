package task;

import java.util.Scanner;

public class DongulerIlkPratik {
    public static void main(String[] args) {
        int n, i, k = 0, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        input.close();

        for (i = 0; i <= n; i++) {
            if (i % 12 == 0) {
                toplam += i;
                k++;
            }
        }

        System.out.println("İşlemin sonucu: " + (toplam / k));

    }
}
