package task;

import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, secim, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        secim = input.nextDouble();

        toplam = armut * secim;

        System.out.print("Elma kaç kilo? : ");
        secim = input.nextDouble();

        toplam += secim * elma;

        System.out.print("Domates kaç kilo? : ");
        secim = input.nextDouble();

        toplam += secim * domates;

        System.out.print("Muz kaç kilo? : ");
        secim = input.nextDouble();

        toplam += secim * muz;

        System.out.print("Patlıcan kaç kilo? : ");
        secim = input.nextDouble();

        toplam += secim* patlican;

        System.out.println("Toplam tutar: " + toplam);

    }
}
