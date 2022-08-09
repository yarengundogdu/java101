package task;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınınz.");
        }
        else if (userName.equals("patika")) {
                System.out.print("Şifrenizi sıfırlamak ister misiniz\n1-Evet\n2-Hayır\nSeçiminiz: ");
                secim = input.nextInt();

                if (secim == 1) {

                    System.out.print("Yeni şifrenizi giriniz: ");
                    input.nextLine();

                    while (true) {
                        password = input.nextLine();
                        if (password.equals("java123"))
                            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                        else
                            break;
                    }

                    System.out.println("Şifre oluşturuldu.");
                }

                else if (secim == 2){
                    System.out.println("Şifre sıfırlama işlemi reddedildi.");
                }

                else {
                    System.out.println("Geçersiz bir seçim yapıldı.");
                }
        }
        else
            System.out.println("Giriş yapılamadı.");
        
        input.close();
    }
}
