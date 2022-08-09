package task;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int gun, ay;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = input.nextInt();

        input.close();

        if (ay == 1) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 21)
                burc = "Oğlak";
            else
                burc = "Kova";
        }
        else if (ay == 2) {
            if (gun <= 0 || gun > 29)
                isError = true;
            else if (gun <= 19)
                burc = "Kova";
            else
                burc = "Balık";
        }
        else if (ay == 3) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 20)
                burc = "Balık";
            else
                burc = "Koç";
        }
        else if (ay == 4) {
            if (gun <= 0 || gun > 30)
                isError = true;
            else if (gun <= 20)
                burc = "Koç";
            else
                burc = "Boğa";
        }
        else if (ay == 5) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 21)
                burc = "Boğa";
            else
                burc = "İkizler";
        }
        else if (ay == 6) {
            if (gun <= 0 || gun > 30)
                isError = true;
            else if (gun <= 22)
                burc = "İkizler";
            else
                burc = "Yengeç";
        }
        else if (ay == 7) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 22)
                burc = "Yengeç";
            else
                burc = "Aslan";
        }
        else if (ay == 8) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 22)
                burc = "Aslan";
            else
                burc = "Başak";
        }
        else if (ay == 9) {
            if (gun <= 0 || gun > 30)
                isError = true;
            else if (gun <= 22)
                burc = "Başak";
            else
                burc = "Terazi";
        }
        else if (ay == 10) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 22)
                burc = "Twrazi";
            else
                burc = "Başak";
        }
        else if (ay == 11) {
            if (gun <= 0 || gun > 30)
                isError = true;
            else if (gun <= 21)
                burc = "Akrep";
            else
                burc = "Yay";
        }
        else if (ay == 12) {
            if (gun <= 0 || gun > 31)
                isError = true;
            else if (gun <= 21)
                burc = "Yay";
            else
                burc = "Oğlak";
        }
        else
            isError = true;

        if (isError)
            System.out.println("Girdiğiniz değerler yanlıştır.");
        else
            System.out.println("Burcunuz: " + burc);
    }
}
