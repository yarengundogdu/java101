package task;

import java.util.Scanner;

import static java.lang.System.exit;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        yil = input.nextInt();

        input.close();

        switch (yil % 12) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz.");
                exit(1);
        }

        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
