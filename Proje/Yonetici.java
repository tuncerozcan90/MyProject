package Proje;

import java.util.Scanner;

//! ARAC BASARIYLA GUNCELLENDI EKLENECEK

public class Yonetici {

    //! VARIABLES
    private String yoneticiAd = "ahmet";
    private String yoneticiSifre = "elma1";

    //! CONSTRUCTORS
    public Yonetici(String yoneticiAd, String yoneticiSifre) {
        this.yoneticiAd = yoneticiAd;
        this.yoneticiSifre = yoneticiSifre;

    }

    public Yonetici() {}

    //! GETTER-SETTERS
    public String getYoneticiAd() {
        return yoneticiAd;
    }


    public void setYoneticiAd(String yoneticiAd) {
        this.yoneticiAd = yoneticiAd;
    }


    public String getYoneticiSifre() {
        return yoneticiSifre;
    }


    public void setYoneticiSifre(String yoneticiSifre) {
        this.yoneticiSifre = yoneticiSifre;
    }


    //! METHODS

    public static void arabaSil() {
        Scanner scanner = new Scanner(System.in);

        int aracIndex = 0;

        Galeri.tumGaleriyiGor();
        
        System.out.print("Silmek istediginiz arac --> ");
        int silenecekAraba = scanner.nextInt();
        scanner.nextLine();

        if (silenecekAraba - Galeri.GaleridekiOtomobiller.size() > 0) {
            aracIndex = silenecekAraba - Galeri.GaleridekiOtomobiller.size();
        }
        else {
            Galeri.GaleridekiOtomobiller.remove(silenecekAraba - 1);
            System.out.println("Arac basariyla silindi!\n");
            return;
            
        }

        if (aracIndex - Galeri.GaleridekiSUVlar.size() > 0) {
            aracIndex = aracIndex - Galeri.GaleridekiSUVlar.size();
        }

        else {
            Galeri.GaleridekiSUVlar.remove(aracIndex - 1);
            System.out.println("Arac basariyla silindi!\n");
            return;
        }

        if (aracIndex - Galeri.GaleridekiKaravanlar.size() > 0) {
            aracIndex = aracIndex - Galeri.GaleridekiSUVlar.size();
        }
        else {
            Galeri.GaleridekiKaravanlar.remove(aracIndex - 1);
            System.out.println("Arac basariyla silindi!\n");
            return;
        }

        if (aracIndex > 0) {
            System.out.println("Hatali tuslama yapildi...");
            return;
        }

        

    }

    public static void arabaGuncelle() {

        boolean guncelleCik = true;

        String AracIslemler =     "0 - Cikis\n"
                                + "1 - Adi\n"
                                + "2 - Markasi\n"
                                + "3 - Modeli\n"
                                + "4 - Gucu\n"
                                + "5 - Kapi Sayisi\n"
                                + "6 - Ustu Acilma Durumu\n"
                                + "7 - Renk\n"
                                + "8 - Fiyat\n"
                                + "9 - Seri No\n"
                                + "10 - Yakit Turu\n"
                                + "11 - Vites Tipi\n"
                                + "12 - Arac Plaka\n"
                                + "13 - Max Hiz\n";

        String SUVIslemler= "14 - Yukseklik\n"
                           + "15 - Kullanim Tipi\n"
                           + "16 - Tekerlek Tipi\n"
                           + "17 - Vinc Bulunma Durumu\n";

        String KaravanIslemler = "14 - Metrekare\n"
                               + "15 - Yatak\n";

        Scanner scanner = new Scanner(System.in);

        
        
        
        while (guncelleCik) {
            Galeri.tumGaleriyiGor();

            System.out.print("Guncellemek istediginiz arac --> ");
            int guncellenecekArac = scanner.nextInt();
            int aracIndex = guncellenecekArac;
            scanner.nextLine();
            System.out.println();

            if (guncellenecekArac - Galeri.GaleridekiOtomobiller.size() > 0) { //! OTOMOBIL MI KONTROLU (DEGILSE)
                aracIndex = guncellenecekArac - Galeri.GaleridekiOtomobiller.size();
            }
            else {
                
                System.out.println(AracIslemler);
                System.out.print("Secim --> ");
                int otomobilDegistir = scanner.nextInt();
                scanner.nextLine();

                boolean otomobilCik = true;
                while (otomobilCik) {
                    switch (otomobilDegistir) {
                        case 0:
                            System.out.println("Cikis yapiliyor...");
                            otomobilCik = false;
                            break;
                        
                        case 1:
                            System.out.print("\nYeni Ad: ");
                            String otomobilYeniAd = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracAd(otomobilYeniAd);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 2:
                            System.out.print("\nYeni Marka: ");
                            String otomobilYeniMarka = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracMarka(otomobilYeniMarka);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 3:
                            System.out.print("\nYeni Model: ");
                            String otomobilYeniModel = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracModel(otomobilYeniModel);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 4:
                            System.out.print("\nYeni Guc: ");
                            int otomobilYeniGuc = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracBeygirGucu(otomobilYeniGuc);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 5:
                            System.out.print("\nYeni Kapi Sayisi: ");
                            int otomobilYeniKapiS = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setKapiSayisi(otomobilYeniKapiS);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 6:
                            boolean otomobilYeniUstuAcB = false;
                            System.out.print("Ustu Acilma Durumu (E/H): ");
                            String otomobilYeniUstuAc = scanner.nextLine();
    
                            if (otomobilYeniUstuAc.equalsIgnoreCase("e")) {
                                otomobilYeniUstuAcB = true;
                            }
    
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setUstuAcik(otomobilYeniUstuAcB);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 7:
                            System.out.print("\nYeni Renk: ");
                            String otomobilYeniRenk = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setRenk(otomobilYeniRenk);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 8:
                            System.out.print("\nYeni Fiyat: ");
                            int otomobilYeniFiyat = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracFiyat(otomobilYeniFiyat);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 9:
                            System.out.print("\nYeni Seri No: ");
                            String otomobilYeniSeriNo = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracSeriNo(otomobilYeniSeriNo);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 10:
                            System.out.print("\nYeni Yakit Turu: ");
                            String otomobilYeniYakitTuru = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracYakitTuru(otomobilYeniYakitTuru);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 11:
                            boolean otomobilYeniDuzVitesB = false;
    
                            System.out.print("\nDuz mu Otomatik mi (D/O): ");
                            String otomobilYeniVitesTuru = scanner.nextLine();
                            
                            if (otomobilYeniVitesTuru.equalsIgnoreCase("d")) {
                                otomobilYeniUstuAcB = true;
                            }
                            
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracDuzVites(otomobilYeniDuzVitesB);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 12:
                            System.out.print("\nYeni Plaka: ");
                            String otomobilYeniPlaka = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracPlaka(otomobilYeniPlaka);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 13:
                            System.out.print("\nYeni Max Hiz: ");
                            String otomobilYeniMaxHiz = scanner.nextLine();
                            Galeri.GaleridekiOtomobiller.get(aracIndex - 1).setaracHiz(otomobilYeniMaxHiz);
                            guncelleCik = false;
                            otomobilCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        default:
                            System.out.println("Hatali tuslama yapildi...");
                    }
                }

            }
    
            if (aracIndex - Galeri.GaleridekiSUVlar.size() > 0) {
                aracIndex = aracIndex - Galeri.GaleridekiSUVlar.size();
            }
    
            else {
                System.out.println(AracIslemler + SUVIslemler);
                System.out.print("Secim --> ");
                int SUVDegistir = scanner.nextInt();
                scanner.nextLine();


                boolean SUVCik = true;
                while (SUVCik) {
                    switch (SUVDegistir) {
                        case 0:
                            System.out.println("Cikis yapiliyor...");
                            SUVCik = false;
                            break;
                        
                        case 1:
                            System.out.print("\nYeni Ad: ");
                            String SUVYeniAd = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracAd(SUVYeniAd);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 2:
                            System.out.print("\nYeni Marka: ");
                            String SUVYeniMarka = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracMarka(SUVYeniMarka);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 3:
                            System.out.print("\nYeni Model: ");
                            String SUVYeniModel = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracModel(SUVYeniModel);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 4:
                            System.out.print("\nYeni Guc: ");
                            int SUVYeniGuc = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracBeygirGucu(SUVYeniGuc);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 5:
                            System.out.print("\nYeni Kapi Sayisi: ");
                            int SUVYeniKapiS = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setKapiSayisi(SUVYeniKapiS);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 6:
                            boolean SUVYeniUstuAcB = false;
                            System.out.print("Ustu Acilma Durumu (E/H): ");
                            String SUVYeniUstuAc = scanner.nextLine();
    
                            if (SUVYeniUstuAc.equalsIgnoreCase("e")) {
                                SUVYeniUstuAcB = true;
                            }
    
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setUstuAcik(SUVYeniUstuAcB);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 7:
                            System.out.print("\nYeni Renk: ");
                            String SUVYeniRenk = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setRenk(SUVYeniRenk);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 8:
                            System.out.print("\nYeni Fiyat: ");
                            int SUVYeniFiyat = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracFiyat(SUVYeniFiyat);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 9:
                            System.out.print("\nYeni Seri No: ");
                            String SUVYeniSeriNo = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracSeriNo(SUVYeniSeriNo);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 10:
                            System.out.print("\nYeni Yakit Turu: ");
                            String SUVYeniYakitTuru = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracYakitTuru(SUVYeniYakitTuru);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 11:
                            boolean SUVYeniDuzVitesB = false;
    
                            System.out.print("\nDuz mu Otomatik mi (D/O): ");
                            String SUVYeniVitesTuru = scanner.nextLine();
                            
                            if (SUVYeniVitesTuru.equalsIgnoreCase("d")) {
                                SUVYeniUstuAcB = true;
                            }
                            
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracDuzVites(SUVYeniDuzVitesB);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 12:
                            System.out.print("\nYeni Plaka: ");
                            String SUVYeniPlaka = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracPlaka(SUVYeniPlaka);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 13:
                            System.out.print("\nYeni Max Hiz: ");
                            String SUVYeniMaxHiz = scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setaracHiz(SUVYeniMaxHiz);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 14:
                            System.out.print("\nYeni Yukseklik: ");
                            int SUVYeniYukseklik = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setSuvYukseklik(SUVYeniYukseklik);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 15:
                            boolean SUVYeniAraziMiB = false;
                            System.out.print("Arazi mi Sehir mi (A/S): ");
                            String SUVYeniAraziMi= scanner.nextLine();
                            scanner.nextLine();
    
                            if (SUVYeniAraziMi.equalsIgnoreCase("a")) {
                                SUVYeniAraziMiB = true;
                            }
    
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setSuvArazi(SUVYeniAraziMiB);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 16:
                        System.out.print("\nYeni Tekerlek Tipi: ");
                        String SUVYeniTekerlekTipi = scanner.nextLine();
                        Galeri.GaleridekiSUVlar.get(aracIndex - 1).setSuvTekerlekTipi(SUVYeniTekerlekTipi);
                        guncelleCik = false;
                        SUVCik = false;
                        System.out.println("\nArac basariyla guncellendi..!\n");
                        break;
    
                        case 17:
                        boolean SUVYeniVincB = false;
                            System.out.print("Vinc var mi (E/H): ");
                            String SUVYeniVinc= scanner.nextLine();
                            scanner.nextLine();
    
                            if (SUVYeniVinc.equalsIgnoreCase("e")) {
                                SUVYeniAraziMiB = true;
                            }
    
                            Galeri.GaleridekiSUVlar.get(aracIndex - 1).setSuvVinc(SUVYeniVincB);
                            guncelleCik = false;
                            SUVCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        default:
                            System.out.println("Hatali tuslama yapildi...");
                    }
                }
                

            }
    
            if (aracIndex > Galeri.GaleridekiKaravanlar.size()) {
                System.out.println("Hatali tuslama...");
            }
            else {
                System.out.println(AracIslemler + KaravanIslemler);
                System.out.print("Secim --> ");
                int karavanDegistir = scanner.nextInt();
                scanner.nextLine();


                boolean karavanCik = true;
                while (karavanCik) {
                    switch (karavanDegistir) {
                        case 0:
                            System.out.println("Cikis yapiliyor...");
                            karavanCik = false;
                            break;
                        
                        case 1:
                            System.out.print("\nYeni Ad: ");
                            String karavanYeniAd = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracAd(karavanYeniAd);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 2:
                            System.out.print("\nYeni Marka: ");
                            String karavanYeniMarka = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracMarka(karavanYeniMarka);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 3:
                            System.out.print("\nYeni Model: ");
                            String karavanYeniModel = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracModel(karavanYeniModel);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 4:
                            System.out.print("\nYeni Guc: ");
                            int karavanYeniGuc = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracBeygirGucu(karavanYeniGuc);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 5:
                            System.out.print("\nYeni Kapi Sayisi: ");
                            int karavanYeniKapiS = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setKapiSayisi(karavanYeniKapiS);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 6:
                            boolean karavanYeniUstuAcB = false;
                            System.out.print("Ustu Acilma Durumu (E/H): ");
                            String karavanYeniUstuAc = scanner.nextLine();
    
                            if (karavanYeniUstuAc.equalsIgnoreCase("e")) {
                                karavanYeniUstuAcB = true;
                            }
    
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setUstuAcik(karavanYeniUstuAcB);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 7:
                            System.out.print("\nYeni Renk: ");
                            String karavanYeniRenk = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setRenk(karavanYeniRenk);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 8:
                            System.out.print("\nYeni Fiyat: ");
                            int karavanYeniFiyat = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracFiyat(karavanYeniFiyat);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 9:
                            System.out.print("\nYeni Seri No: ");
                            String karavanYeniSeriNo = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracSeriNo(karavanYeniSeriNo);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 10:
                            System.out.print("\nYeni Yakit Turu: ");
                            String karavanYeniYakitTuru = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracYakitTuru(karavanYeniYakitTuru);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 11:
                            boolean karavanYeniDuzVitesB = false;
    
                            System.out.print("\nDuz mu Otomatik mi (D/O): ");
                            String karavanYeniVitesTuru = scanner.nextLine();
                            
                            if (karavanYeniVitesTuru.equalsIgnoreCase("d")) {
                                karavanYeniUstuAcB = true;
                            }
                            
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracDuzVites(karavanYeniDuzVitesB);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 12:
                            System.out.print("\nYeni Plaka: ");
                            String karavanYeniPlaka = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracPlaka(karavanYeniPlaka);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 13:
                            System.out.print("\nYeni Max Hiz: ");
                            String karavanYeniMaxHiz = scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setaracHiz(karavanYeniMaxHiz);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 14:
                            System.out.print("\nYeni Metrekare ");
                            int karavanYeniMetreKare = scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setKaravanMetreKare(karavanYeniMetreKare);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        case 15:
                            System.out.print("\nYeni Yatak Sayisi: ");
                            int karavanYeniYatakS= scanner.nextInt();
                            scanner.nextLine();
                            Galeri.GaleridekiKaravanlar.get(aracIndex - 1).setKaravanYatakSayisi(karavanYeniYatakS);
                            guncelleCik = false;
                            karavanCik = false;
                            System.out.println("\nArac basariyla guncellendi..!\n");
                            break;
    
                        default:
                            System.out.println("Hatali tuslama yapildi...");
                    }
                }

            }
        }
        return;
    }

    





}
