package task;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int num, i, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Pozitif bir tam sayı giriniz: ");
            num = input.nextInt();
        } while (num <= 0);

        input.close();

        for (i = 1; i < num; i++)
            if (num % i == 0) {
                sum += i;
            }

        if (num == sum)
            System.out.println(num + " mükemmel sayıdır.");
        else
            System.out.println(num + " mükemmel sayı değildir.");

    }
}
