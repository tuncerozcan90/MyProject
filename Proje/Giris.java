package Proje;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;

public class Giris {

    //! VARIABLES
    static  ArrayList<Kullanici> kullaniciKayitOl = new ArrayList<Kullanici>();

    public static Kullanici aktifKullanici = null;

    

    public static boolean kullaniciGirisYaptiMi = false;
    public static boolean yoneticiGirisYaptiMi = false;

    public static boolean kullaniciKayitOlduMu = false;

    public static void yapilanGiris(String sayi) {
        
        Scanner scanner = new Scanner(System.in);

        //! ADMIN GIRIS
        if (sayi.equals("1")) { 

            while(true) {
                Yonetici admin = new Yonetici();
                System.out.print("\nKullanici adi: ");
                String adminLoginKulAd = scanner.nextLine();
                System.out.print("Sifre --> ");
                String adminLoginSifre = scanner.nextLine();

            if (adminLoginKulAd.equals(admin.getYoneticiAd()) && adminLoginSifre.equals(admin.getYoneticiSifre())) {
                System.out.println("\nGiris basarili... Hosgeldiniz, " + admin.getYoneticiAd() + "\n");
                yoneticiGirisYaptiMi = true;
                break;
            }
            else
                System.out.println("Kullanici adi veya sifre hatali... Tekrar deneyiniz.");
            }
            
        } 

        //! KULLANICI GİRİS
        if (sayi.equals("2")) { 
            
            
            while (true) {
            
            if (kullaniciGirisYaptiMi) {
                break;
            }
            System.out.println("\n1 - Kayit ol\n2 - Giris yap");
            System.out.print("Secim --> ");
            int kullaniciSecim = scanner.nextInt();
            scanner.nextLine();

            //! KAYIT OL
            if (kullaniciSecim == 1) {
                while (true) {

                
                System.out.print("\nKullanici adiniz: ");
                String kullaniciAdAl = scanner.nextLine();

                System.out.print("Kullanici sifreniz: ");
                String kullaniciSifreAl = scanner.nextLine();

                System.out.print("Kullanici mail: ");
                String kullaniciMailAl = scanner.nextLine();

                System.out.print("Kullanici telefon: ");
                String kullaniciTelefonAl = scanner.nextLine();

                int kullaniciBakiye = 0;

                kullaniciKayitOl.add(new Kullanici(kullaniciAdAl, kullaniciSifreAl, kullaniciMailAl, kullaniciTelefonAl, kullaniciBakiye, false));

                System.out.println("\nKayit basarili..!");

                kullaniciKayitOlduMu = true;

                break;
                }
            }
            //! GIRIS YAP
            else if (kullaniciSecim == 2) {

                System.out.print("\nKullanici adiniz: ");
                String kullaniciAdGiris = scanner.nextLine();

                System.out.print("Kullanici sifreniz: ");
                String kullaniciSifreGiris = scanner.nextLine();

                if (!kullaniciKayitOlduMu) {
                    System.out.println("\nHesap bulunamadi... Lutfen once kayit olunuz.");
                }
                for (int i = 0; i < kullaniciKayitOl.size(); i++) {
                    if (kullaniciAdGiris.equals(kullaniciKayitOl.get(i).getKullaniciAd()) && kullaniciSifreGiris.equals(kullaniciKayitOl.get(i).getKullaniciSifre())) {

                        System.out.println("\nGiris basarili, Hos geldin, " + kullaniciKayitOl.get(i).getKullaniciAd() + "\n");
                        
                        kullaniciGirisYaptiMi = true;
                        //! YENI
                        for (int j = 0; j < Giris.kullaniciKayitOl.size(); j++) {
                            Giris.kullaniciKayitOl.get(i).setAktifKullanici(false); //! YENI
                            
                            if (Giris.kullaniciKayitOl.get(i).getKullaniciAd().equals(kullaniciAdGiris) && Giris.kullaniciKayitOl.get(i).getKullaniciSifre().equals(kullaniciSifreGiris)) {
                                Giris.kullaniciKayitOl.get(i).setAktifKullanici(true);
                            }
                        }
                        
                        break;
                        
                    }
                    
                        
                    }
                    if (!kullaniciGirisYaptiMi) {
                        System.out.println("\nGiris basarisiz! Tekrar deneyin.");
                    }
                    
                    
                }
                
            }
        }
        
    }


    //! METHODS


    public static void kullaniciMenu() {
        Scanner scanner = new Scanner(System.in);

        String kullaniciMenuIslemler = ("1 - Tum Galeriyi Gor\n"
                                     +  "2 - Galeriyi Filtrele\n"
                                     +  "3 - Arac Satin Al\n"
                                     +  "4 - Cikis\n");

        while(true) {
            System.out.println(kullaniciMenuIslemler);

            System.out.print("Secim --> ");
            int kullaniciMenuSecim = scanner.nextInt();
            scanner.nextLine();

            if (kullaniciMenuSecim == 1) {
                Galeri.tumGaleriyiGor();
            }

            else if (kullaniciMenuSecim == 2) {
                Kullanici.aracFiltrele();
            }

            else if (kullaniciMenuSecim == 3) {
                Kullanici.aracSatinAl();
            }

            else if (kullaniciMenuSecim == 4) {
                System.out.println("Hesaptan cikis yapiliyor...\n");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {}

                return;
            }

            else {
                System.out.println("Hatali tuslama yaptiniz...");
            }
        }

        
    }

    public static void yoneticiMenu() {
        Scanner scanner = new Scanner(System.in);

        String adminMenuIslemler = ("1 - Tum Galeriyi Gor\n"
                                 +  "2 - Araba Ekle\n"
                                 +  "3 - Araba Sil\n"
                                 +  "4 - Araba Guncelle\n"
                                 +  "5 - Cikis\n");


            while(true) {
            System.out.println(adminMenuIslemler);

            System.out.print("Secim --> ");
            int adminMenuSecim = scanner.nextInt();
            scanner.nextLine();

            if (adminMenuSecim == 1) {
                Galeri.tumGaleriyiGor();
            }

            else if (adminMenuSecim == 2) {
                Fabrika object = new Fabrika();
            }

            else if (adminMenuSecim == 3) {
                Yonetici.arabaSil();
            }

            else if (adminMenuSecim == 4) {
                Yonetici.arabaGuncelle();
            }

            else if (adminMenuSecim == 5) {
                System.out.println("Hesaptan cikis yapiliyor...\n");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {}

                return;
            }

            else {
                System.out.println("Hatali tuslama yaptiniz...");
            }
        }
    }
}
