package task;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n, r, i, sonuc = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        r = input.nextInt();

        input.close();

        for (i = 0; i < r; i++)
            sonuc *= n;

        System.out.println("(" + n + ") ^ " + r + " = " + sonuc);
    }
}
