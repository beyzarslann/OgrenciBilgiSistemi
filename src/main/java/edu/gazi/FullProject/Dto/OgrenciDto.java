package edu.gazi.FullProject.Dto;

public class OgrenciDto {
    private Long num;
    private String ad;
    private String soyad;
    private Integer yas;

    public OgrenciDto() {
    }

    public OgrenciDto(Long num, String ad, String soyad, Integer yas) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }
}
