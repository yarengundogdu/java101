package task;

import java.util.Scanner;

public class ImprovedCalculator {
    static void menu () {
        System.out.println("\n***********MENU***********");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Calculating Exponential Number");
        System.out.println("6- Calculating Factorial");
        System.out.println("7- Calculating mode");
        System.out.println("8- Calculating The Rectangle's Area and Perimeter");
        System.out.println("0- Exit");
        System.out.print("\nSelect: ");
    }

    static void plus () {
        int n, i;
        double sum = 0.0, num;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you enter: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num = input.nextDouble();
            sum += num;
        }

        System.out.println("Result: " + sum);
    }

    static void minus () {
        int n, i;
        double diff = 0.0, num;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you enter: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num = input.nextDouble();

            if (i == 0) {
                diff = num;
                continue;
            }

            diff -= num;
        }

        System.out.println("Result: " + diff);

    }

    static void cross () {
        int n, i;
        double mul = 1.0, num;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you enter: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num = input.nextDouble();
            mul *= num;
        }

        System.out.println("Result: " + mul);
    }

    static void division () {
        int n, i;
        double div = 0.0, num;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you enter: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num = input.nextInt();

            if (i == 0) {
                div = num;
                continue;
            }

            div /= num;
        }

        System.out.println("Result: " + div);
    }

    static void power () {
        int base, exp, result = 1, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        base = input.nextInt();
        System.out.print("Enter the exponent value: ");
        exp = input.nextInt();

        for (i = 0; i < exp; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial () {
        int n, i, fact = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        n = input.nextInt();

        for (i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Result: " + fact);
    }

    static void modulo () {
        int numOne, numTwo;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number that will be found it's modulo: ");
        numOne = input.nextInt();

        System.out.print("Enter the number to find the modulo: ");
        numTwo = input.nextInt();

        System.out.println("Result: " + (numOne % numTwo));
    }

    static void rectangle () {
        double numOne, numTwo;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rectangle's first side's length: ");
        numOne = input.nextDouble();

        System.out.print("Enter the rectangle's other side's length: ");
        numTwo = input.nextDouble();

        System.out.println("The area of the rectangle is: " + (numOne * numTwo));
        System.out.println("The perimeter of the rectangle is: " + (numOne + numTwo) * 2);
    }

    public static void main(String[] args) {
        int select;
        boolean isExit = false;

        Scanner input = new Scanner(System.in);

        while (!isExit) {

            menu();
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    cross();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Bye Bye!");
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid access... Try again.");
            }
        }
        input.close();
    }
}
