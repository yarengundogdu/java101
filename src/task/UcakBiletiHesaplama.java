package task;

import java.util.Scanner;

import static java.lang.System.exit;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int yas, yon;
        double mesafe, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-Tek Yön 2-Gidiş Dönüş): ");
        yon = input.nextInt();

        input.close();

        if (mesafe <= 0 || yas <= 0 || (yon != 1 && yon != 2)) {
            System.out.println("Hatalı veri girdiniz!");
            exit(1);
        }

        tutar = mesafe * 0.10;

        if (yas < 12)
            tutar -= tutar * 0.50;
        else if (yas <= 24)
            tutar -= tutar * 0.10;
        else if (yas > 65)
            tutar -= tutar * 0.30;

        if (yon == 2)
            tutar = (tutar - tutar * 0.20) * 2.0;

        System.out.println("Toplam tutar: " + tutar);
    }
}
