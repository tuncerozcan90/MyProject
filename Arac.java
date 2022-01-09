package Proje;

public class Arac implements IAracBilgileri {

    //! VARIABLES
    static int sayac = 0;

    private String aracAd;
    private String aracMarka;
    private String aracModel;
    private int aracBeygirGucu;
    private int kapiSayisi;
    private boolean ustuAcik = false;
    private String renk;
    private int aracFiyat = 0;
    private String aracSeriNo;
    private String aracYakitTuru;
    private boolean aracDuzVites = false;
    private String aracPlaka;
    private String aracHiz;

    //! CONSTRUCTORS
    public Arac(String aracAd, String aracMarka, String aracModel, int aracBeygirGucu, int kapiSayisi,
            boolean ustuAcik, String renk, int aracFiyat, String aracSeriNo, String aracYakitTuru, boolean aracDuzVites, String aracPlaka, String aracHiz) {
        this.aracAd = aracAd;
        this.aracMarka = aracMarka;
        this.aracModel = aracModel;
        this.aracBeygirGucu = aracBeygirGucu;
        this.kapiSayisi = kapiSayisi;
        this.ustuAcik = ustuAcik;
        this.renk = renk;
        this.aracFiyat = aracFiyat;
        this.aracSeriNo = aracSeriNo;
        this.aracYakitTuru = aracYakitTuru;
        this.aracDuzVites = aracDuzVites;
        this.aracPlaka = aracPlaka;
        this.aracHiz = aracHiz;
    }

    public Arac() {};


    //! GETTER-SETTERS
    public String getaracAd() {
        return aracAd;
    }


    public void setaracAd(String aracAd) {
        this.aracAd = aracAd;
    }


    public String getaracMarka() {
        return aracMarka;
    }


    public void setaracMarka(String aracMarka) {
        this.aracMarka = aracMarka;
    }


    public String getaracModel() {
        return aracModel;
    }


    public void setaracModel(String aracModel) {
        this.aracModel = aracModel;
    }


    public int getaracBeygirGucu() {
        return aracBeygirGucu;
    }


    public void setaracBeygirGucu(int aracBeygirGucu) {
        this.aracBeygirGucu = aracBeygirGucu;
    }


    public int getKapiSayisi() {
        return kapiSayisi;
    }


    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }


    public boolean isUstuAcik() {
        return ustuAcik;
    }


    public void setUstuAcik(boolean ustuAcik) {
        this.ustuAcik = ustuAcik;
    }


    public String getRenk() {
        return renk;
    }


    public void setRenk(String renk) {
        this.renk = renk;
    }


    public int getaracFiyat() {
        return aracFiyat;
    }


    public void setaracFiyat(int aracFiyat) {
        this.aracFiyat = aracFiyat;
    }


    public String getaracSeriNo() {
        return aracSeriNo;
    }


    public void setaracSeriNo(String aracSeriNo) {
        this.aracSeriNo = aracSeriNo;
    }

    public String getaracYakitTuru() {
        return aracYakitTuru;
    }

    public void setaracYakitTuru(String aracYakitTuru) {
        this.aracYakitTuru = aracYakitTuru;
    }

    public boolean isaracDuzVites() {
        return aracDuzVites;
    }

    public void setaracDuzVites(boolean aracDuzVites) {
        this.aracDuzVites = aracDuzVites;
    }

    public String getaracPlaka() {
        return aracPlaka;
    }

    public void setaracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public String getaracHiz() {
        return aracHiz;
    }

    public void setaracHiz(String aracHiz) {
        this.aracHiz = aracHiz;
    }


    //! METHODS

    @Override
    public void aracBilgileriGoster() {}    //! HER ARAC TURU ICIN AYRI TANIMLANDI

    @Override
    public void aracBilgileriniGosterIndex(int index) {} //! HER ARAC TURU ICIN AYRI TANIMLANDI
}
