package task;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutari, kdvliFiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();

        input.close();

        kdvOrani = (0 < tutar && tutar < 1000) ? 0.18 : 0.08;

        kdvTutari = kdvOrani * tutar;
        kdvliFiyat = kdvTutari + tutar;

        System.out.println("KDV'siz fiyat: " + tutar);
        System.out.println("KDV oranı: " + kdvOrani);
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyatı: " + kdvliFiyat);
    }
}
