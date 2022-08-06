package task;

import java.util.Scanner;

public class NotOrtHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        input.close();

        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ort = toplam / 6.0;

        System.out.println("Ortalamanız: " + ort);

        String sonuc = (ort > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);
    }
}
