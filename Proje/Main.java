package Proje;

import java.util.Scanner;

public class Main { //! TEST
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Galeri.GaleridekiOtomobiller();     //! DEFAULT ARACLAR GALERIYE YUKLENIR
        Galeri.GaleridekiSUVlar();  //! DEFAULT ARACLAR GALERIYE YUKLENIR
        Galeri.GaleridekiKaravanlar();  //! DEFAULT ARACLAR GALERIYE YUKLENIR

        while (true) {
        System.out.println("**********************************************");
        
        System.out.println("Hos geldiniz...\n\nLutfen giris yapiniz.\n(1 - Yonetici girisi)\n(2 - Kullanici girisi)");

        System.out.print("Secim --> ");
        String loginSec = scanner.nextLine();

        Giris.yapilanGiris(loginSec);   //! ADMIN GIRIS YAPAR VEYA KULLANICI KAYIT OLUR/GIRIS YAPAR

        if (Giris.kullaniciGirisYaptiMi) { //! KULLANICI MENU
            Giris.kullaniciMenu();
            Giris.kullaniciGirisYaptiMi = false;
            
        }
        else if (Giris.yoneticiGirisYaptiMi) { //! YONETICI MENU    
            Giris.yoneticiMenu();
            Giris.yoneticiGirisYaptiMi = false;
        }
    }
        

        

        
    }
}
