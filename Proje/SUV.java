package Proje;

public class SUV extends Arac {

    //! VARIABLES
    private int SUVIndex = 2;

    private int suvYukseklik;
    private boolean suvArazi;
    private String suvTekerlekTipi;
    private boolean suvVinc;

    //! CONSTRUCTORS
    public SUV(String arabaAd, String arabaMarka, String arabaModel, int arabaBeygirGucu, int kapiSayisi,
            boolean ustuAcik, String renk, int arabaFiyat, String arabaSeriNo, String arabaYakitTuru,
            boolean arabaDuzVites, String arabaPlaka, String arabaHiz, int suvYukseklik, boolean suvArazi,
            String suvTekerlekTipi, boolean suvVinc) {


        super(arabaAd, arabaMarka, arabaModel, arabaBeygirGucu, kapiSayisi, ustuAcik, renk, arabaFiyat, arabaSeriNo,
                arabaYakitTuru, arabaDuzVites, arabaPlaka, arabaHiz);

        this.suvYukseklik = suvYukseklik;
        this.suvArazi = suvArazi;
        this.suvTekerlekTipi = suvTekerlekTipi;
        this.suvVinc = suvVinc;
    }

    public SUV() {};

    //! GETTER-SETTERS
    public int getSUVIndex() {
        return SUVIndex;
    }

    public void setSUVIndex(int sUVIndex) {
        SUVIndex = sUVIndex;
    }

    public int getSuvYukseklik() {
        return suvYukseklik;
    }


    public void setSuvYukseklik(int suvYukseklik) {
        this.suvYukseklik = suvYukseklik;
    }


    public boolean isSuvArazi() {
        return suvArazi;
    }


    public void setSuvArazi(boolean suvArazi) {
        this.suvArazi = suvArazi;
    }


    public String getSuvTekerlekTipi() {
        return suvTekerlekTipi;
    }


    public void setSuvTekerlekTipi(String suvTekerlekTipi) {
        this.suvTekerlekTipi = suvTekerlekTipi;
    }


    public boolean isSuvVinc() {
        return suvVinc;
    }


    public void setSuvVinc(boolean suvVinc) {
        this.suvVinc = suvVinc;
    }

    //! METHODS

    public void aracBilgileriGoster() { //! TUM SUV BILGILERINI YAZDIR

        String SUVUstuAcik;
        String SUVDuzVites;
        String SUVAraziTipi;
        String SUVVinc;

        for (int i = 0; i < Galeri.GaleridekiSUVlar.size(); i++, Arac.sayac++) {

            if (Galeri.GaleridekiSUVlar.get(i).isUstuAcik()) 
                SUVUstuAcik = "Evet";
            
            
            else 
                SUVUstuAcik = "Hayir";
            

            if (Galeri.GaleridekiSUVlar.get(i).isaracDuzVites()) 
                SUVDuzVites = "Evet";
            
            else 
                SUVDuzVites = "Hayir";
            

            if (Galeri.GaleridekiSUVlar.get(i).isSuvArazi()) 
                SUVAraziTipi = "Evet";
            
            else
                SUVAraziTipi = "Hayir";

            if (Galeri.GaleridekiSUVlar.get(i).isSuvVinc()) 
                SUVVinc = "Evet";
            
            else
                SUVVinc = "Hayir";


            System.out.println((Arac.sayac + 1) + " --------- SUV -----------");
            System.out.println("Adi: " + Galeri.GaleridekiSUVlar.get(i).getaracAd());
            System.out.println("Markasi: " + Galeri.GaleridekiSUVlar.get(i).getaracMarka());
            System.out.println("Model: " + Galeri.GaleridekiSUVlar.get(i).getaracModel());
            System.out.println("Gücü: " + Galeri.GaleridekiSUVlar.get(i).getaracBeygirGucu());
            System.out.println("Kapi sayisi: " + Galeri.GaleridekiSUVlar.get(i).getKapiSayisi());
            System.out.println("Ustu acik mi: " + SUVUstuAcik);
            System.out.println("Renk: " + Galeri.GaleridekiSUVlar.get(i).getRenk());
            System.out.println("Fiyat: " + Galeri.GaleridekiSUVlar.get(i).getaracFiyat());
            System.out.println("Seri No: " + Galeri.GaleridekiSUVlar.get(i).getaracSeriNo());
            System.out.println("Yakit turu: " + Galeri.GaleridekiSUVlar.get(i).getaracYakitTuru());
            System.out.println("Duz vites mi: " + SUVDuzVites);
            System.out.println("arac plaka: " + Galeri.GaleridekiSUVlar.get(i).getaracPlaka());
            System.out.println("Max hiz: " + Galeri.GaleridekiSUVlar.get(i).getaracHiz());
            System.out.println("Yukseklik: " + Galeri.GaleridekiSUVlar.get(i).getSuvYukseklik());
            System.out.println("Arazi tipi mi: " + SUVAraziTipi);
            System.out.println("Tekerlek tipi: " + Galeri.GaleridekiSUVlar.get(i).getSuvTekerlekTipi());
            System.out.println("Vinc var mi: " + SUVVinc);
            System.out.println();
         }
    }

    
    public void aracBilgileriniGosterIndex(int index) {   //! INDEX ILE SUV CAGIR
        
            System.out.println("Adi: " + Galeri.GaleridekiSUVlar.get(index).getaracAd());
            System.out.println("Markasi: " + Galeri.GaleridekiSUVlar.get(index).getaracMarka());
            System.out.println("Model: " + Galeri.GaleridekiSUVlar.get(index).getaracModel());
            System.out.println("Gücü: " + Galeri.GaleridekiSUVlar.get(index).getaracBeygirGucu());
            System.out.println("Kapi sayisi: " + Galeri.GaleridekiSUVlar.get(index).getKapiSayisi());
            System.out.println("Ustu acik mi: " + Galeri.GaleridekiSUVlar.get(index).isUstuAcik());
            System.out.println("Renk: " + Galeri.GaleridekiSUVlar.get(index).getRenk());
            System.out.println("Fiyat: " + Galeri.GaleridekiSUVlar.get(index).getaracFiyat());
            System.out.println("Seri No: " + Galeri.GaleridekiSUVlar.get(index).getaracSeriNo());
            System.out.println("Yakit turu: " + Galeri.GaleridekiSUVlar.get(index).getaracYakitTuru());
            System.out.println("Duz vites mi: " + Galeri.GaleridekiSUVlar.get(index).isaracDuzVites());
            System.out.println("arac plaka: " + Galeri.GaleridekiSUVlar.get(index).getaracPlaka());
            System.out.println("Max hiz: " + Galeri.GaleridekiSUVlar.get(index).getaracHiz());
            System.out.println("Yukseklik: " + Galeri.GaleridekiSUVlar.get(index).getSuvYukseklik());
            System.out.println("Arazi tipi mi: " + Galeri.GaleridekiSUVlar.get(index).isSuvArazi());
            System.out.println("Tekerlek tipi: " + Galeri.GaleridekiSUVlar.get(index).getSuvTekerlekTipi());
            System.out.println("Vinc var mi: " + Galeri.GaleridekiSUVlar.get(index).isSuvVinc());
            System.out.println("*******************************************");
         
    }



    


    
   

    

    
    
}
