package task;

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, endeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        input.close();

        endeks = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + endeks);

    }
}
