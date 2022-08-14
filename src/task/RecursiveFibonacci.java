package task;

import java.util.Scanner;

public class RecursiveFibonacci {

    static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        n = input.nextInt();

        while (n <= 0) {
            System.out.print("You've entered a wrong number. Please, enter a positive number: ");
            n = input.nextInt();
        }

        input.close();

        System.out.println("fib(" + n + ") = " + fib(n));
    }
}
