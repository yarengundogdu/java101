package task;

import java.util.Scanner;

public class DaireAlanCevreBulma {
    public static void main(String[] args) {
        int r;
        double alan, alfa, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Merkez açının ölçüsünü giriniz: ");
        alfa = input.nextDouble();

        input.close();

        alan = pi * r * r * alfa / 360;

        System.out.println("Dairenin alanı: " + alan);
    }
}
