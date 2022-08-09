package task;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1, num2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();

        input.close();

        switch (secim) {
            case 1:
                System.out.println("Toplam: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Fark: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpım: " + (num1 * num2));
                break;
            case 4:
                switch (num2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.println("Bölüm: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
        }
    }
}
