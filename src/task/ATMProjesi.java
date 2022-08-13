package task;

import java.util.Scanner;

import static java.lang.System.exit;

public class ATMProjesi {

    static void menu () {
        System.out.println("\n******MENU******");
        System.out.println("1- Para Yatırma");
        System.out.println("2- Para Çekme");
        System.out.println("3- Bakiye Sorgula");
        System.out.println("4- Çıkış Yap");
        System.out.print("\nSeçiminiz: ");
    }

    public static void main(String[] args) {
        String userName, password;
        int right = 3, select, balance = 1500, price;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme giriş yaptınız.");
                break;
            }

            else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    exit(1);
                }
                System.out.println("Hatalı kullanıcı adi veya şifre. Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + right);
            }
        }

        System.out.println("Merhaba, Kodluyoruz Bankası'na hoş geldiniz!");
        menu();

        while (true){

            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Para miktarı: " + balance);
                    System.out.print("Yatırmak istediğiniz miktar: ");
                    price = input.nextInt();
                    balance += price;
                    menu();
                    break;
                case 2:
                    System.out.println("Para miktarı: " + balance);
                    System.out.print("Çekmek istediğiniz miktar: ");
                    price = input.nextInt();
                    int available;
                    available = (price > balance) ? 1 : 2;
                    switch (available) {
                        case 1:
                            System.out.println("Bakiye yetersiz.");
                            menu();
                            break;
                        default:
                            balance -= price;
                            menu();
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + balance);
                    menu();
                    break;
                case 4:
                    System.out.println("Tekrar görüşmek üzere!");
                    exit(0);
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız. Tekrar deneyiniz.");
                    menu();
            }

        }


    }
}
