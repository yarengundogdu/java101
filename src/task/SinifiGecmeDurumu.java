package task;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double ort, i = 5.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        if (mat < 0 || mat > 100) {
            i -= 1.0;
            mat = 0;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        if (fizik < 0 || fizik > 100) {
            i -= 1.0;
            fizik = 0;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        if (turkce < 0 || turkce > 100) {
            i -= 1.0;
            turkce = 0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        if (kimya < 0 || kimya > 100) {
            i -= 1.0;
            kimya = 0;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (muzik < 0 || muzik > 100) {
            i -= 1.0;
            muzik = 0;
        }

        input.close();

        ort = (mat + fizik + turkce + kimya + muzik) / i;

        if (ort < 55) {
            System.out.println("Ortalamanız: " + ort);
            System.out.println("Sınıfta kaldınız.");
        }
        else {
            System.out.println("Ortalamanız: " + ort);
            System.out.println("Sınıfı geçtiniz.");
        }
    }
}
