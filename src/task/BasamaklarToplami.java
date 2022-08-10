package task;

import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {
        int num, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        input.close();

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Girilen sayının basamakları toplamı: " + sum);
    }
}
