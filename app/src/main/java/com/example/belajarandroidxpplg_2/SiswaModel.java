package com.example.belajarandroidxpplg_2;

public class SiswaModel {
    String nama ;
    String NoPunggung ;
    String Negara ;
    String Posisi;
    int ImageUser;
    String detailinfo;

    public String getNama() {
        return nama;
    }

    public String getNoPunggung() {
        return NoPunggung;
    }

    public String getNegara() {
        return Negara;
    }

    public String getPosisi(){ return Posisi; }


    public int getImageUser(){
        return ImageUser;
    }

    public String getDetailinfo(){
        return detailinfo;
    }

    public SiswaModel(String nama, String nopunggung, String negara, String posisi, int imageUser, String detailinfo) {
        this.nama = nama;
        this.NoPunggung = nopunggung;
        this.Negara = negara;
        this.Posisi = posisi;
        this.ImageUser = imageUser;   
        this.detailinfo = detailinfo;



    }

    public static class PemainModel {

        String nama ;
        String NoPunggung ;
        String Negara ;
        String Posisi;
        int ImageUser;
        String detailinfo;

        public String getNama() {
            return nama;
        }

        public String getNoPunggung() {
            return NoPunggung;
        }

        public String getNegara() {
            return Negara;
        }

        public String getPosisi(){ return Posisi; }


        public int getImageUser(){
            return ImageUser;
        }

        public String getDetailinfo(){
            return detailinfo;
        }

        public PemainModel(String nama, String nopunggung, String negara, String posisi, int imageUser, String detailinfo) {
            this.nama = nama;
            this.NoPunggung = nopunggung;
            this.Negara = negara;
            this.Posisi = posisi;
            this.ImageUser = imageUser;
            this.detailinfo = detailinfo;



        }
    }
}
