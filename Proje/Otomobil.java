package Proje;

public class Otomobil extends Arac {

    //! VARIABLES
    private static int arabaninIndexi = 3 ;

    //! CONSTRUCTORS
    public Otomobil(String arabaAd, String arabaMarka, String arabaModel, int arabaBeygirGucu, int kapiSayisi,
            boolean ustuAcik, String renk, int arabaFiyat, String arabaSeriNo, String arabaYakitTuru,
            boolean arabaDuzVites, String arabaPlaka, String arabaHiz) {

        super(arabaAd, arabaMarka, arabaModel, arabaBeygirGucu, kapiSayisi, ustuAcik, renk, arabaFiyat, arabaSeriNo,
                arabaYakitTuru, arabaDuzVites, arabaPlaka, arabaHiz);
    }

    public Otomobil() {}

    //! GETTER-SETTERS
    public static int getArabaninIndexi() {
        return arabaninIndexi;
    }


    public static void setArabaninIndexi(int arabaninIndexi) {
        Otomobil.arabaninIndexi = arabaninIndexi;
    }

    
    public void aracBilgileriGoster() { //! TUM OTOMOBIL BILGILERINI YAZDIR
        
        String otomobilUstuAcik;
        String otomobilDuzVites;

        for (int i = 0; i < Galeri.GaleridekiOtomobiller.size(); i++, Arac.sayac++) {

            if (Galeri.GaleridekiOtomobiller.get(i).isUstuAcik()) 
                otomobilUstuAcik = "Evet";
            
            else 
                otomobilUstuAcik = "Hayir";
            

            if (Galeri.GaleridekiOtomobiller.get(i).isaracDuzVites()) 
                otomobilDuzVites = "Evet";
            
            else 
                otomobilDuzVites = "Hayir";
            

            System.out.println((Arac.sayac + 1) + " --------- OTOMOBIL -----------");
            System.out.println("Adi: " + Galeri.GaleridekiOtomobiller.get(i).getaracAd());
            System.out.println("Markasi: " + Galeri.GaleridekiOtomobiller.get(i).getaracMarka());
            System.out.println("Model: " + Galeri.GaleridekiOtomobiller.get(i).getaracModel());
            System.out.println("Gucu: " + Galeri.GaleridekiOtomobiller.get(i).getaracBeygirGucu());
            System.out.println("Kapi sayisi: " + Galeri.GaleridekiOtomobiller.get(i).getKapiSayisi());
            System.out.println("Ustu acik mi: " + otomobilUstuAcik);
            System.out.println("Renk: " + Galeri.GaleridekiOtomobiller.get(i).getRenk());
            System.out.println("Fiyat: " + Galeri.GaleridekiOtomobiller.get(i).getaracFiyat());
            System.out.println("Seri No: " + Galeri.GaleridekiOtomobiller.get(i).getaracSeriNo());
            System.out.println("Yakit turu: " + Galeri.GaleridekiOtomobiller.get(i).getaracYakitTuru());
            System.out.println("Duz vites mi: " + otomobilDuzVites);
            System.out.println("Arac plaka: " + Galeri.GaleridekiOtomobiller.get(i).getaracPlaka());
            System.out.println("Max hiz: " + Galeri.GaleridekiOtomobiller.get(i).getaracHiz());
            System.out.println();
         }
    }

    
    public void aracBilgileriniGosterIndex(int index) {   //! INDEX ILE OTOMOBIL CAGIR
    
            System.out.println("Adi: " + Galeri.GaleridekiOtomobiller.get(index).getaracAd());
            System.out.println("Markasi: " + Galeri.GaleridekiOtomobiller.get(index).getaracMarka());
            System.out.println("Model: " + Galeri.GaleridekiOtomobiller.get(index).getaracModel());
            System.out.println("Gucu: " + Galeri.GaleridekiOtomobiller.get(index).getaracBeygirGucu());
            System.out.println("Kapi sayisi: " + Galeri.GaleridekiOtomobiller.get(index).getKapiSayisi());
            System.out.println("Ustu acik mi: " + Galeri.GaleridekiOtomobiller.get(index).isUstuAcik());
            System.out.println("Renk: " + Galeri.GaleridekiOtomobiller.get(index).getRenk());
            System.out.println("Fiyat: " + Galeri.GaleridekiOtomobiller.get(index).getaracFiyat());
            System.out.println("Seri No:" + Galeri.GaleridekiOtomobiller.get(index).getaracSeriNo());
            System.out.println("Yakit turu:" + Galeri.GaleridekiOtomobiller.get(index).getaracYakitTuru());
            System.out.println("Duz vites mi: " + Galeri.GaleridekiOtomobiller.get(index).isaracDuzVites());
            System.out.println("Arac plaka: " + Galeri.GaleridekiOtomobiller.get(index).getaracPlaka());
            System.out.println("Max hiz: " + Galeri.GaleridekiOtomobiller.get(index).getaracHiz());
            System.out.println("*******************************************");
         
    }



    

    
    
}
