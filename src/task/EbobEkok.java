package task;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, i, ebob = 1, ekok = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        input.close();

        if (n1 > n2) {
            int k = n2;
            n2 = n1;
            n1 = k;
        }

        i = n1;

        while (i > 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);

        i = 1;

        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u: " + ekok);
    }
}
