package Proje;

public class Karavan extends Arac {
    
    //! VARIABLES
    private int karavanIndex = 2;
    private int karavanMetreKare;
    private int karavanYatakSayisi;

    //! CONSTRUCTORS
    public Karavan(String arabaAd, String arabaMarka, String arabaModel, int arabaBeygirGucu, int kapiSayisi,
            boolean ustuAcik, String renk, int arabaFiyat, String arabaSeriNo, String arabaYakitTuru,
            boolean arabaDuzVites, String arabaPlaka, String arabaHiz, int karavanMetreKare, int karavanYatakSayisi) {

        super(arabaAd, arabaMarka, arabaModel, arabaBeygirGucu, kapiSayisi, ustuAcik, renk, arabaFiyat, arabaSeriNo,
                arabaYakitTuru, arabaDuzVites, arabaPlaka, arabaHiz);
        this.karavanMetreKare = karavanMetreKare;
        this.karavanYatakSayisi = karavanYatakSayisi;
    }

    public Karavan() {};


    //! GETTER-SETTERS
    public int getKaravanIndex() {
        return karavanIndex;
    }

    public void setKaravanIndex(int karavanIndex) {
        this.karavanIndex = karavanIndex;
    }

    public int getKaravanMetreKare() {
        return karavanMetreKare;
    }


    public void setKaravanMetreKare(int karavanMetreKare) {
        this.karavanMetreKare = karavanMetreKare;
    }


    public int getKaravanYatakSayisi() {
        return karavanYatakSayisi;
    }


    public void setKaravanYatakSayisi(int karavanYatakSayisi) {
        this.karavanYatakSayisi = karavanYatakSayisi;
    }

    //! METHODS
    
    public void aracBilgileriGoster() {     //! TUM KARAVAN BILGILERINI YAZDIR

        String karavanUstuAcik;
        String karavanDuzVites;

        for (int i = 0; i < Galeri.GaleridekiKaravanlar.size(); i++, Arac.sayac++) {

            if (Galeri.GaleridekiKaravanlar.get(i).isUstuAcik()) 
                karavanUstuAcik = "Evet";
            
            else 
                karavanUstuAcik = "Hayir";
            

            if (Galeri.GaleridekiKaravanlar.get(i).isaracDuzVites()) 
                karavanDuzVites = "Evet";
            
            else 
                karavanDuzVites = "Hayir";
            



            System.out.println((Arac.sayac + 1) + " --------- KARAVAN-----------");
            System.out.println("Adi: " + Galeri.GaleridekiKaravanlar.get(i).getaracAd());
            System.out.println("Markasi: " + Galeri.GaleridekiKaravanlar.get(i).getaracMarka());
            System.out.println("Model: " + Galeri.GaleridekiKaravanlar.get(i).getaracModel());
            System.out.println("Gücü: " + Galeri.GaleridekiKaravanlar.get(i).getaracBeygirGucu());
            System.out.println("Kapi sayisi: " + Galeri.GaleridekiKaravanlar.get(i).getKapiSayisi());
            System.out.println("Ustu acik mi: " + karavanUstuAcik);
            System.out.println("Renk: " + Galeri.GaleridekiKaravanlar.get(i).getRenk());
            System.out.println("Fiyat: " + Galeri.GaleridekiKaravanlar.get(i).getaracFiyat());
            System.out.println("Seri No: " + Galeri.GaleridekiKaravanlar.get(i).getaracSeriNo());
            System.out.println("Yakit turu: " + Galeri.GaleridekiKaravanlar.get(i).getaracYakitTuru());
            System.out.println("Duz vites mi: " + karavanDuzVites);
            System.out.println("arac plaka: " + Galeri.GaleridekiKaravanlar.get(i).getaracPlaka());
            System.out.println("Max hiz: " + Galeri.GaleridekiKaravanlar.get(i).getaracHiz());
            System.out.println("Metrekare: " + Galeri.GaleridekiKaravanlar.get(i).getaracHiz());
            System.out.println("Yatak: " + Galeri.GaleridekiKaravanlar.get(i).getaracHiz());
            System.out.println();
         }
        
    }

    
    public void aracBilgileriniGosterIndex(int index) { //! INDEX ILE KARAVAN CAGIR
        
            System.out.println("Adi: " + Galeri.GaleridekiKaravanlar.get(index).getaracAd());
            System.out.println("Markasi: " + Galeri.GaleridekiKaravanlar.get(index).getaracMarka());
            System.out.println("Model: " + Galeri.GaleridekiKaravanlar.get(index).getaracModel());
            System.out.println("Gücü: " + Galeri.GaleridekiKaravanlar.get(index).getaracBeygirGucu());
            System.out.println("Kapi sayisi: " + Galeri.GaleridekiKaravanlar.get(index).getKapiSayisi());
            System.out.println("Ustu acik mi: " + Galeri.GaleridekiKaravanlar.get(index).isUstuAcik());
            System.out.println("Renk: " + Galeri.GaleridekiKaravanlar.get(index).getRenk());
            System.out.println("Fiyat: " + Galeri.GaleridekiKaravanlar.get(index).getaracFiyat());
            System.out.println("Seri No: " + Galeri.GaleridekiKaravanlar.get(index).getaracSeriNo());
            System.out.println("Yakit turu : " + Galeri.GaleridekiKaravanlar.get(index).getaracYakitTuru());
            System.out.println("Duz vites mi : " + Galeri.GaleridekiKaravanlar.get(index).isaracDuzVites());
            System.out.println("arac plaka: " + Galeri.GaleridekiKaravanlar.get(index).getaracPlaka());
            System.out.println("Max hiz: " + Galeri.GaleridekiKaravanlar.get(index).getaracHiz());
            System.out.println("Metrekare: " + Galeri.GaleridekiKaravanlar.get(index).getaracHiz());
            System.out.println("Yatak: " + Galeri.GaleridekiKaravanlar.get(index).getaracHiz());
            System.out.println("*******************************************");
        
        
    }

    //! METHODS



    

    
    

    

}
