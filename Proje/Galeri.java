package Proje;

import java.util.ArrayList;

public class Galeri {

    //! VARIABLES
    static ArrayList<Otomobil> GaleridekiOtomobiller = new ArrayList<Otomobil>();
    static ArrayList<SUV> GaleridekiSUVlar = new ArrayList<SUV>();
    static ArrayList<Karavan> GaleridekiKaravanlar = new ArrayList<Karavan>();
    
    //! METHODS
    public static ArrayList<Otomobil> GaleridekiOtomobiller() {
        
        GaleridekiOtomobiller.add(new Otomobil("Benz E 500 Avantgarde", "Mercedes", "2003", 325, 4, false, "Gri", 420, "#01", "Dizel", true, "34 ABC 0101", "280"));
        GaleridekiOtomobiller.add(new Otomobil("Fiat Fiorino 1.4", "Fiat", "2021", 150, 5, false, "Kirmizi", 200, "#02", "Dizel", false, "34 ABC 0202", "200"));
        GaleridekiOtomobiller.add(new Otomobil("VW. POLO 1.0e", "Volkswagen", "2021", 300, 4, false, "Beyaz", 225, "#03", "Benzinli", true, "34 ABC 0303", "300"));
        GaleridekiOtomobiller.add(new Otomobil("AUTO-PT CRUISER-115", "Chrysler", "2005", 350, 2, true, "Gumus", 165, "#04", "Benzinli", true, "34 ABC 0404", "400"));
    
        return GaleridekiOtomobiller;
    }

    public static void aracBilgileriniGosterIndex(Otomobil birObje) { //! GALERIYE DEFAULT OTOMOBILLERI EKLER EKLER
        GaleridekiOtomobiller.add(birObje);
    }

    public static ArrayList<SUV> GaleridekiSUVlar() {
        
        GaleridekiSUVlar.add(new SUV("L200", "Mitsubishi", "2012", 400, 4, false, "Siyah", 166, "#05", "Dizel", true, "34 ABC 0505", "270", 2, true, "Arazi", false));
        GaleridekiSUVlar.add(new SUV("Ranger", "Ford", "2016", 325, 4, false, "Yesil", 470, "#06", "Dizel", false, "34 ABC 0606", "300", 3, true, "Arazi", true));
        GaleridekiSUVlar.add(new SUV("Amarok", "Wolkswagen", "2017", 300, 4, false, "Beyaz", 480, "#07", "Benzinli", false, "34 ABC 0707", "250", 2, false, "Sehir", false));

        return GaleridekiSUVlar;
    }

    public static void aracBilgileriniGosterIndex(SUV birObje) { //! GALERIYE DEFAULT SUVLARI EKLER
        GaleridekiSUVlar.add(birObje);
    }

    public static ArrayList<Karavan> GaleridekiKaravanlar() {

        GaleridekiKaravanlar.add(new Karavan("Dukato", "Fiat", "2012", 150, 5, false, "Siyah", 175, "#08", "Dizel + LPG", true, "34 ABC 0808", "190", 12, 2));
        GaleridekiKaravanlar.add(new Karavan("Crafter", "Wolkswagen", "2013", 160, 5, false, "Beyaz", 200, "#09", "Dizel + LPG", false, "34 ABC 0909", "200", 10, 1));
        GaleridekiKaravanlar.add(new Karavan("Cruiser", "Opel", "2010", 130, 4, false, "Gri", 110, "#10", "Benzin", true, "34 ABC 1010", "160", 8, 1));

        return GaleridekiKaravanlar;
    }

    public static void aracBilgileriniGosterIndex(Karavan birObje) { //! GALERIYE DEFAULT KARAVANLARI EKLER
        GaleridekiKaravanlar.add(birObje);
    }

    
    public static void tumGaleriyiGor() {   //! GALERIDEKI TUM ARACLARI SIRAYLA YAZDIRIR

        Otomobil objectO = new Otomobil();
        SUV objectS = new SUV();
        Karavan objectK = new Karavan();

        objectO.aracBilgileriGoster();
        objectS.aracBilgileriGoster();
        objectK.aracBilgileriGoster();

        Arac.sayac = 0;
    }

    
}
