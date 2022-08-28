package task;

import java.util.Scanner;

public class CreatingMethod {
    static void method(int num) {
        if (num > 0) {
            System.out.print(num + " ");
            method(num - 5);
        }
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        input.close();

        method(num);
    }
}
