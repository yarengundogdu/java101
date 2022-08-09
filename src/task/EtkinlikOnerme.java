package task;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat = input.nextInt();

        input.close();

        if (heat < 5)
            System.out.println("Kayak yapabilirsiniz.");
        else if (heat <= 15) {
            if (heat <= 10)
                System.out.println("Sinemaya gidebilirsiniz.");
            else
                System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        }
        else if (heat <= 25)
            System.out.println("Pikniğe gidebilirsiniz.");
        else
            System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
