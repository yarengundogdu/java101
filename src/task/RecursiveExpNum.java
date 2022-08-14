package task;

import java.util.Scanner;

public class RecursiveExpNum {

    static int expOperation (int base, int exp) {
        if (exp == 0)
            return 1;
        return base * expOperation(base, exp - 1);
    }

    public static void main(String[] args) {
        int base, exp;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        base = input.nextInt();

        System.out.print("Enter the exponent value: ");
        exp = input.nextInt();

        input.close();

        System.out.println("Result: " + expOperation(base, exp));
    }
}
