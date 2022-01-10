package Proje;

import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

/*)
1 - filtrele
2 - Araba satin al

*/

public class Kullanici {
    
    //! VARIABLES
    private String kullaniciAd;
    private String kullaniciMail;
    private String kullaniciTelefonNo;
    private String kullaniciSifre;
    private int kullaniciBakiye = 0;
    private boolean aktifKullanici = false;


    //! CONSTRUCTORS
    public Kullanici(String kullaniciAd, String kullaniciSifre, String kullaniciMail, String kullaniciTelefonNo, int kullaniciBakiye, boolean aktifKullanici) {
        this.kullaniciAd = kullaniciAd;
        this.kullaniciMail = kullaniciMail;
        this.kullaniciTelefonNo = kullaniciTelefonNo;
        this.kullaniciSifre = kullaniciSifre;
        this.kullaniciBakiye = kullaniciBakiye;
        this.aktifKullanici = aktifKullanici;
    }

    public Kullanici() {};

    //! GETTERS-SETTERS

    public boolean isAktifKullanici() {
        return aktifKullanici;
    }

    public void setAktifKullanici(boolean aktifKullanici) {
        this.aktifKullanici = aktifKullanici;
    }
 
    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }


    public String getKullaniciMail() {
        return kullaniciMail;
    }


    public void setKullaniciMail(String kullaniciMail) {
        this.kullaniciMail = kullaniciMail;
    }


    public String getKullaniciTelefonNo() {
        return kullaniciTelefonNo;
    }


    public void setKullaniciTelefonNo(String kullaniciTelefonNo) {
        this.kullaniciTelefonNo = kullaniciTelefonNo;
    }


    public String getKullaniciSifre() {
        return kullaniciSifre;
    }


    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

    public int getKullaniciBakiye() {
        return kullaniciBakiye;
    }

    public void setKullaniciBakiye(int kullaniciBakiye) {
        this.kullaniciBakiye = kullaniciBakiye;
    }
    
    //! METHODS

    public static Kullanici aktifKullanici() {
        for (int i = 0; i < Giris.kullaniciKayitOl.size(); i++) {
            if (Giris.kullaniciKayitOl.get(i).aktifKullanici) {
                return Giris.kullaniciKayitOl.get(i);
            }
        }
        return (new Kullanici());
    }

    public static void aracFiltrele() {

        Otomobil objectA = new Otomobil();
        SUV objectB = new SUV();
        Karavan objectC = new Karavan();

        Scanner scanner = new Scanner(System.in);

        String islemler = "\n1 - Otomobiller\n"
                          + "2 - SUV'lar\n"
                          + "3 - Karavanlar\n";

        System.out.println(islemler);
        System.out.print("Filtrelemek istediginiz arac turu --> ");

        int filtreSecim = scanner.nextInt();
        scanner.nextLine();

        switch(filtreSecim) {
            case 1: 
                objectA.aracBilgileriGoster();
                Arac.sayac = 0;
                break;
                
            case 2:
                objectB.aracBilgileriGoster();
                Arac.sayac = 0;
                break;

            case 3:
                objectC.aracBilgileriGoster();
                Arac.sayac = 0;
                break;
        }
        
    }

    public static void aracSatinAl() {

        Scanner scanner = new Scanner(System.in);

        Otomobil objectA = new Otomobil();
        SUV objectB = new SUV();
        Karavan objectC = new Karavan();

        Galeri.tumGaleriyiGor();

        System.out.print("Satin almak istediginiz arac --> ");  //! LISTEDEN SATIN ALINACAK ARAC SECILIR
        int satinAlinacakArac = scanner.nextInt();
        scanner.nextLine();

        int aracIndex = satinAlinacakArac - 1;

        if (satinAlinacakArac - Galeri.GaleridekiOtomobiller.size() > 0) {      //! OTOMOBIL ALGORITMA
            aracIndex = satinAlinacakArac - Galeri.GaleridekiOtomobiller.size();
        }
        else {
            System.out.println("\n*******************************************");
            objectA.aracBilgileriniGosterIndex(aracIndex);
            
            while(true) {
            System.out.println("1 - Satin al\n"
                             + "2 - Bakiye Yukle\n"
                             + "3 - Bakiye Goruntule");

            System.out.print("Secim --> ");
            int satinAlIslem = scanner.nextInt();
            scanner.nextLine();

            if (satinAlIslem == 1 && aktifKullanici().getKullaniciBakiye() < Galeri.GaleridekiOtomobiller.get(aracIndex).getaracFiyat()) {
                System.out.println("\nIslem icin yetersiz bakiye, lutfen once bakiye yukleyiniz...\n");
            }

            if (satinAlIslem == 1 && aktifKullanici().getKullaniciBakiye() >= Galeri.GaleridekiOtomobiller.get(aracIndex).getaracFiyat()) {
                System.out.println("\nSatin alimi onayliyor musunuz (E/H)\n(Faturaniz islemden sonra gonderilecektir.)");
                System.out.print("Secim --> ");
                String satinAlOnay = scanner.nextLine();
                
                if (satinAlOnay.equalsIgnoreCase("e")) {
                
                aktifKullanici().setKullaniciBakiye(aktifKullanici().getKullaniciBakiye() - Galeri.GaleridekiOtomobiller.get(aracIndex).getaracFiyat());
                    
                try {
 
                    FileWriter fWriter = new FileWriter("C:\\Users\\erayd\\Desktop\\Coding\\Languages\\Java\\Proje\\Fatura.txt");
         
                    fWriter.write("Sayin " + aktifKullanici().getKullaniciAd() + ",\n\n" + Galeri.GaleridekiOtomobiller.get(aracIndex).getaracAd() + " aracini satin aldiginiz icin tesekkurler...\nOdediginiz tutar: " + Galeri.GaleridekiOtomobiller.get(aracIndex).getaracFiyat() + "\nKalan bakiyeniz: " + aktifKullanici().kullaniciBakiye);
        
                    fWriter.close();
                }
         
                catch (IOException e) {
        
                    System.out.print(e.getMessage());
                }

                System.out.println("\nSatin alma islemi basarili..!\nYine bekleriz...");
                System.exit(0);

                }

                else {
                    System.out.println("\nSatin alma isleminiz iptal edildi...\n");
                }        
        }
        else if (satinAlIslem == 2) {
                System.out.print("\nYuklemek istediginiz miktar: ");
                int paraYukle = scanner.nextInt();

                aktifKullanici().setKullaniciBakiye(aktifKullanici().getKullaniciBakiye()+ paraYukle);

                System.out.println("Bakiyeniz guncellenmistir...");
                System.out.println("Yeni bakiye: " + aktifKullanici().getKullaniciBakiye() + "\n");
        }

        else if (satinAlIslem == 3) {
            System.out.println("\n" + aktifKullanici().getKullaniciAd() + " isimli kullanicinin bakiyesi: " + aktifKullanici().getKullaniciBakiye() + "\n"); 
        }
    }
            
    }

        if (aracIndex - Galeri.GaleridekiSUVlar.size() > 0) {
            aracIndex = aracIndex - Galeri.GaleridekiSUVlar.size();
        }

        else {
            System.out.println("\n*******************************************");
            objectB.aracBilgileriniGosterIndex(aracIndex - 1);

            while(true) {
                System.out.println("1 - Satin Al\n"
                                 + "2 - Bakiye Yukle\n"
                                 + "3 - Bakiye Goruntule");

            System.out.print("Secim --> ");
            int satinAlIslem = scanner.nextInt();
            scanner.nextLine();

            if (satinAlIslem == 1 && aktifKullanici().getKullaniciBakiye() < Galeri.GaleridekiSUVlar.get(aracIndex - 1).getaracFiyat()) {
                System.out.println("\nIslem icin yetersiz bakiye, lutfen once bakiye yukleyiniz...\n");
            }

            if (satinAlIslem == 1 && aktifKullanici().getKullaniciBakiye() >= Galeri.GaleridekiSUVlar.get(aracIndex - 1).getaracFiyat()) {
                System.out.println("\nSatin alimi onayliyor musunuz (E/H)\n(Faturaniz islemden sonra gonderilecektir.)");
                System.out.print("Secim --> ");
                String satinAlOnay = scanner.nextLine();
                
                if (satinAlOnay.equalsIgnoreCase("e")) {

                aktifKullanici().setKullaniciBakiye(aktifKullanici().getKullaniciBakiye() - Galeri.GaleridekiSUVlar.get(aracIndex - 1).getaracFiyat());

                try {
 
                    FileWriter fWriter = new FileWriter("C:\\Users\\erayd\\Desktop\\Coding\\Languages\\Java\\Proje\\Fatura.txt");
         
                    fWriter.write("Sayin " + aktifKullanici().getKullaniciAd() + ",\n\n" + Galeri.GaleridekiSUVlar.get(aracIndex - 1).getaracAd() + " aracini satin aldiginiz icin tesekkurler...\nOdediginiz tutar: " + Galeri.GaleridekiSUVlar.get(aracIndex - 1).getaracFiyat() + "\nKalan bakiyeniz: " + aktifKullanici().kullaniciBakiye);
        
        
                    fWriter.close();
                }
         
                catch (IOException e) {
        
                    System.out.print(e.getMessage());
                }

                System.out.println("\nSatin alma islemi basarili..!\nYine bekleriz...");
                System.exit(0);

                }

                else {
                    System.out.println("\nSatin alma isleminiz iptal edildi...\n");
                }        
        }
        else if (satinAlIslem == 2) {
                System.out.print("\nYuklemek istediginiz miktar: ");
                int paraYukle = scanner.nextInt();

                aktifKullanici().setKullaniciBakiye(aktifKullanici().getKullaniciBakiye() + paraYukle);

                System.out.println("Bakiyeniz guncellenmistir...");
                System.out.println("Yeni bakiye: " + aktifKullanici().getKullaniciBakiye() + "\n");
        }

        else if (satinAlIslem == 3) {
            System.out.println("\n" + aktifKullanici().getKullaniciAd() + " isimli kullanicinin bakiyesi: " + aktifKullanici().getKullaniciBakiye() + "\n"); 

        }
    }
 
            
    }

        if (aracIndex > Galeri.GaleridekiKaravanlar.size()) {
            System.out.println("Hatali tuslama...");
            System.exit(0);
        }
        else {
            System.out.println("\n*******************************************");
            objectC.aracBilgileriniGosterIndex(aracIndex - 1);

            while(true) {
                System.out.println("1 - Satin Al\n"
                                 + "2 - Bakiye Yukle\n"
                                 + "3 - Bakiye Goruntule");

            System.out.print("Secim --> ");
            int satinAlIslem = scanner.nextInt();
            scanner.nextLine();

            if (satinAlIslem == 1 && aktifKullanici().getKullaniciBakiye() < Galeri.GaleridekiKaravanlar.get(aracIndex - 1).getaracFiyat()) {
                System.out.println("\nIslem icin yetersiz bakiye, lutfen once bakiye yukleyiniz...\n");
            }

            if (satinAlIslem == 1 && aktifKullanici().getKullaniciBakiye() >= Galeri.GaleridekiKaravanlar.get(aracIndex - 1).getaracFiyat()) {
                System.out.println("\nSatin alimi onayliyor musunuz (E/H)\n(Faturaniz islemden sonra gonderilecektir.)");
                System.out.print("Secim --> ");
                String satinAlOnay = scanner.nextLine();
                
                if (satinAlOnay.equalsIgnoreCase("e")) {

                aktifKullanici().setKullaniciBakiye(aktifKullanici().getKullaniciBakiye() - Galeri.GaleridekiKaravanlar.get(aracIndex - 1).getaracFiyat());

                try {
 
                    FileWriter fWriter = new FileWriter("C:\\Users\\erayd\\Desktop\\Coding\\Languages\\Java\\Proje\\Fatura.txt");
         
                    fWriter.write("Sayin " + aktifKullanici().getKullaniciAd() + ",\n\n" + Galeri.GaleridekiKaravanlar.get(aracIndex - 1).getaracAd() + " aracini satin aldiginiz icin tesekkurler...\nOdediginiz tutar: " + Galeri.GaleridekiKaravanlar.get(aracIndex - 1).getaracFiyat() + "\nKalan bakiyeniz: " + aktifKullanici().kullaniciBakiye);
        
        
                    fWriter.close();
                }
         
                catch (IOException e) {
        
                    System.out.print(e.getMessage());
                }
                    
                System.out.println("\nSatin alma islemi basarili..!\nYine bekleriz...");
                System.exit(0);
                }

                else {
                    System.out.println("\nSatin alma isleminiz iptal edildi...\n");
                }        
        }
        else if (satinAlIslem == 2) {
                System.out.print("\nYuklemek istediginiz miktar --> ");
                int paraYukle = scanner.nextInt();

                aktifKullanici().setKullaniciBakiye(aktifKullanici().getKullaniciBakiye() + paraYukle);

                System.out.println("Bakiyeniz guncellenmistir...");
                System.out.println("Yeni bakiye: " + aktifKullanici().getKullaniciBakiye() + "\n");
        }

        else if (satinAlIslem == 3) {
            System.out.println("\n" + aktifKullanici().getKullaniciAd() + " isimli kullanicinin bakiyesi: " + aktifKullanici().getKullaniciBakiye() + "\n");
        }
    }  
        }
    }
}
