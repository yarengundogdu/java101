package task;

import java.util.Arrays;
import java.util.Scanner;

public class TheClosestMaxMin {

    static void find(int[] arr, int num) {
        int max = 0, min = 0;

        if (num <= arr[0]) {
            max = num == arr[0] ? arr[1] : arr[0];
            System.out.println("The closest number that is greater than the number: " + max);
            System.out.println("There is not the closest number that is smaller than the number in the array.");
        }

        else if (num >= arr[arr.length - 1]) {
            min = num == arr[arr.length - 1] ? arr[arr.length - 2] : arr[arr.length - 1];
            System.out.println("The closest number that is smaller than the number: " + min);
            System.out.println("There is not the closest number that is greater than the number in the array.");
        }

        else {
            for (int j = 0; j < arr.length; j++) {
                if (num > arr[j] && num <= arr[j + 1]) {
                    min = arr[j];
                    if (num != arr[j + 1])
                        max = arr[j + 1];
                    else
                        max = arr[j + 2];
                }
            }
            System.out.println("The closest number that is greater than the number: " + max);
            System.out.println("The closest number that is smaller than the number: " + min);
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int num;
        Arrays.sort(arr);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        input.close();

        find(arr, num);
    }
}
