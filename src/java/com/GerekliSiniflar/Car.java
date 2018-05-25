package com.GerekliSiniflar;

/**
 *
 * @author Sercan
 */
public class Car {
    
    private String BarkodNo;
    private String Marka;
    private int Yil;
    private String Renk;
    private int Fiyat;
    private boolean Durum;
 
    
    public Car(String barkodNo,String marka,int yil,String renk,int fiyat,boolean durum){
    
        this.BarkodNo = barkodNo;
        this.Marka = marka;
        this.Yil = yil;
        this.Renk = renk;
        this.Fiyat = fiyat;
        this.Durum = durum;
        
    }

    public String getBarkodNo() {
        return BarkodNo;
    }

    public void setBarkodNo(String BarkodNo) {
        this.BarkodNo = BarkodNo;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    public int getYil() {
        return Yil;
    }

    public void setYil(int Yil) {
        this.Yil = Yil;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String Renk) {
        this.Renk = Renk;
    }

    public int getFiyat() {
        return Fiyat;
    }

    public void setFiyat(int Fiyat) {
        this.Fiyat = Fiyat;
    }

    public boolean isDurum() {
        return Durum;
    }

    public void setDurum(boolean Durum) {
        this.Durum = Durum;
    }
    
    
}
