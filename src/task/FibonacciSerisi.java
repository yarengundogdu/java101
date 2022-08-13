package task;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n, i, temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        input.close();

        for (i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
    }
}
