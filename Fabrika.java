package Proje;

import java.util.Scanner;

public class Fabrika {

    //! CONSTRUCTOR
    public Fabrika() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Eklemek istediginiz araba turunu seciniz...");
        
        String fabrikaIslemler = "1 - Otomobil\n"
                               + "2 - SUV\n"
                               + "3 - Karavan\n";

        System.out.print(fabrikaIslemler);
        System.out.print("Secim --> ");

        int fabrikaSecim = scanner.nextInt();
        scanner.nextLine();

        if (fabrikaSecim == 1) {
            System.out.print("\nAdi: ");
            String otomobilKayitAd = scanner.nextLine();

            System.out.print("Markasi: ");
            String otomobilKayitMarka = scanner.nextLine();

            System.out.print("Model: ");
            String otomobilKayitModel = scanner.nextLine();

            System.out.print("Gucu: ");
            int otomobilKayitGucu = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Kapi sayisi: ");
            int otomobilKayitKapiSayisi = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ustu acik mi (E/H): ");
            String otomobilKayitUstuAcik = scanner.nextLine();

            boolean otomobilKayitUstuAcikB = false;
            if (otomobilKayitUstuAcik.equalsIgnoreCase("e")) {      
                otomobilKayitUstuAcikB = true;
            }

            System.out.print("Renk: ");
            String otomobilKayitRenk = scanner.nextLine();

            System.out.print("Fiyat: ");
            int otomobilKayitFiyat = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Seri no: ");
            String otomobilKayitSeriNo = scanner.nextLine();

            System.out.print("Yakit turu: ");
            String otomobilKayitYakitTuru = scanner.nextLine();

            System.out.print("Duz vites mi (E/H): ");
            String otomobilKayitDuzVites = scanner.nextLine();

            boolean otomobilKayitDuzVitesB = false;
            if (otomobilKayitDuzVites.equalsIgnoreCase("e")) {      
                otomobilKayitDuzVitesB = true;
            }

            System.out.print("Arac plaka: ");
            String otomobilKayitPlaka = scanner.nextLine();

            System.out.print("Max hiz: ");
            String otomobilKayitHiz = scanner.nextLine();

            Otomobil otomobilKayit = new Otomobil(otomobilKayitAd, otomobilKayitMarka, otomobilKayitModel, otomobilKayitGucu, otomobilKayitKapiSayisi, otomobilKayitUstuAcikB, otomobilKayitRenk, otomobilKayitFiyat, otomobilKayitSeriNo, otomobilKayitYakitTuru, otomobilKayitDuzVitesB, otomobilKayitPlaka, otomobilKayitHiz);
            
            Galeri.GaleridekiOtomobiller.add(otomobilKayit);

            System.out.println("\nOtomobil basariyla kayit edildi...\n");

            Otomobil.setArabaninIndexi(Otomobil.getArabaninIndexi() + 1);
        }

        else if (fabrikaSecim == 2) {
            System.out.print("\nAdi: ");
            String SUVKayitAd = scanner.nextLine();

            System.out.print("Markasi: ");
            String SUVKayitMarka = scanner.nextLine();

            System.out.print("Model: ");
            String SUVKayitModel = scanner.nextLine();

            System.out.print("Gucu: ");
            int SUVKayitGucu = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Kapi sayisi: ");
            int SUVKayitKapiSayisi = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ustu acik mi (E/H): ");
            String SUVKayitUstuAcik = scanner.nextLine();

            boolean SUVKayitUstuAcikB = false;
            if (SUVKayitUstuAcik.equalsIgnoreCase("e")) {      
                SUVKayitUstuAcikB = true;
            }

            System.out.print("Renk: ");
            String SUVKayitRenk = scanner.nextLine();

            System.out.print("Fiyat: ");
            int SUVKayitFiyat = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Seri no: ");
            String SUVKayitSeriNo = scanner.nextLine();

            System.out.print("Yakit turu: ");
            String SUVKayitYakitTuru = scanner.nextLine();

            System.out.print("Duz vites mi (E/H): ");
            String SUVKayitDuzVites = scanner.nextLine();

            boolean SUVKayitDuzVitesB = false;
            if (SUVKayitDuzVites.equalsIgnoreCase("e")) {    
                SUVKayitDuzVitesB = true;
            }

            System.out.print("Arac plaka: ");
            String SUVKayitPlaka = scanner.nextLine();

            System.out.print("Max hiz: ");
            String SUVKayitHiz = scanner.nextLine();

            System.out.print("Yukseklik (cm): ");
            int SUVKayitYukseklik = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Arazi mi (E/H): ");
            String SUVKayitArazi = scanner.nextLine();

            boolean SUVKayitAraziB = false;
            if (SUVKayitArazi.equalsIgnoreCase("e")) {      
                SUVKayitAraziB = true;
            }

            System.out.print("Tekerlek tipi (Arazi/Sehir): ");
            String SUVKayitTekerlekTipi = scanner.nextLine();

            System.out.print("Vinc var mi (E/H): ");
            String SUVKayitVinc = scanner.nextLine();

            boolean SUVKayitVincB = false;
            if (SUVKayitVinc.equalsIgnoreCase("e")) {     
                SUVKayitVincB = true;
            }

            SUV SUVKayit = new SUV(SUVKayitAd, SUVKayitMarka, SUVKayitModel, SUVKayitGucu, SUVKayitKapiSayisi, SUVKayitUstuAcikB, SUVKayitRenk, SUVKayitFiyat, SUVKayitSeriNo, SUVKayitYakitTuru, SUVKayitDuzVitesB, SUVKayitPlaka, SUVKayitHiz, SUVKayitYukseklik, SUVKayitAraziB, SUVKayitTekerlekTipi, SUVKayitVincB);
            
            // Galeri.GaleridekiSUVlar().add(SUVKayit);
            Galeri.GaleridekiSUVlar.add(SUVKayit);

            System.out.println("\nSUV basariyla kayit edildi..!\n");

            SUVKayit.setSUVIndex(SUVKayit.getSUVIndex() + 1);
        }

        else if (fabrikaSecim == 3) {
            System.out.print("\nAdi: ");
            String karavanKayitAd = scanner.nextLine();

            System.out.print("Markasi: ");
            String karavanKayitMarka = scanner.nextLine();

            System.out.print("Model: ");
            String karavanKayitModel = scanner.nextLine();

            System.out.print("Gucu: ");
            int karavanKayitGucu = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Kapi sayisi: ");
            int karavanKayitKapiSayisi = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ustu acik mi (E/H): ");
            String karavanKayitUstuAcik = scanner.nextLine();

            boolean karavanKayitUstuAcikB = false;
            
            if (karavanKayitUstuAcik.equalsIgnoreCase("e")) {     
                karavanKayitUstuAcikB = true;
            }

            System.out.print("Renk: ");
            String karavanKayitRenk = scanner.nextLine();

            System.out.print("Fiyat: ");
            int karavanKayitFiyat = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Seri no: ");
            String karavanKayitSeriNo = scanner.nextLine();

            System.out.print("Yakit turu: ");
            String karavanKayitYakitTuru = scanner.nextLine();

            System.out.print("Duz vites mi (E/H): ");
            String karavanKayitDuzVites = scanner.nextLine();

            boolean karavanKayitDuzVitesB = false;

            if (karavanKayitDuzVites.equalsIgnoreCase("e")) {    
                karavanKayitDuzVitesB = true;
            }

            System.out.print("Arac plaka: ");
            String karavanKayitPlaka = scanner.nextLine();

            System.out.print("Max hiz: ");
            String karavanKayitHiz = scanner.nextLine();

            System.out.print("Metrekare: ");
            int karavanKayitMetreKare = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Yatak sayisi: ");
            int karavanKayitYatakSay = scanner.nextInt();
            scanner.nextLine();

            Karavan karavanKayit = new Karavan(karavanKayitAd, karavanKayitMarka, karavanKayitModel, karavanKayitGucu, karavanKayitKapiSayisi, karavanKayitUstuAcikB, karavanKayitRenk, karavanKayitFiyat, karavanKayitSeriNo, karavanKayitYakitTuru, karavanKayitDuzVitesB, karavanKayitPlaka, karavanKayitHiz, karavanKayitMetreKare, karavanKayitYatakSay);
            
            Galeri.GaleridekiKaravanlar.add(karavanKayit);

            System.out.println("\nKaravan basariyla kayit edildi..!\n");

            karavanKayit.setKaravanIndex(karavanKayit.getKaravanIndex() + 1);
        }
        
    } //! CONSTRUCTOR END
}
