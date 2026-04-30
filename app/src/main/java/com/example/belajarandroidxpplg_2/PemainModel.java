package com.example.belajarandroidxpplg_2;

public class PemainModel {
    String nama;
    String NoPunggung;
    String negara;
    String posisi;
    int ImageUser;
    String detail;

    public PemainModel(String nama, String NoPunggung, String negara, String posisi, int ImageUser, String detail) {
        this.nama = nama;
        this.NoPunggung = NoPunggung;
        this.negara  = negara;
        this.posisi = posisi;
        this.ImageUser = ImageUser;
        this.detail = detail;

    }

    public String getNama(){
        return nama;
    }
    public String getNoPunggung(){
        return NoPunggung;
    }
    public String getNegara(){
        return negara;
    }
    public String getPosisi(){
        return posisi;
    }
    public int getImageUser(){
        return ImageUser;
    }
    public String getDetail(){
        return  detail;
    }
}
