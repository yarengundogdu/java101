package task;

import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome (int n) {
        int  newNum = 0, num;

        num = n;

        while (n > 0) {
            newNum *= 10;
            newNum += n % 10;
            n /= 10;
        }

        return num == newNum;
    }

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        input.close();

        if (isPalindrome(num))
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }
}
