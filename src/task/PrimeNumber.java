package task;

import java.util.Scanner;

public class PrimeNumber {
    static int isPrime (int num, int i) {
        if (i == 1)
            return 1;

        if (i <= 0 || num % i == 0)
            return 0;

        return isPrime(num, i - 1);
    }

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        input.close();

        if (isPrime(num, num - 1) == 1)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
