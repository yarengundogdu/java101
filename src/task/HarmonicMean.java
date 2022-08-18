package task;

import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        int n;
        double harmonicMean = 0, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the arrays length: ");
        n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("All of the numbers must be positive.");

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter the index " + i + " : ");
                arr[i] = input.nextInt();
            } while (arr[i] <= 0);
        }

        input.close();

        for (int i = 0; i < n; i++) {
            harmonicMean += 1.0 / arr[i];
        }

        result = n / harmonicMean;

        System.out.println("The harmonic mean of the array is: " + result);
    }
}
