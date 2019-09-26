package com.example.tekberproject2.model;

public class GuestStar {

    private String nama;
    private String gender;
    private String nama2;
    private String gender2;

    public GuestStar() {
    }

    public GuestStar(String nama, String gender, String nama2, String gender2) {
        this.nama = nama;
        this.gender = gender;
        this.nama2 = nama2;
        this.gender2 = gender2;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNama2() {
        return nama2;
    }

    public void setNama2(String nama2) {
        this.nama2 = nama2;
    }

    public String getGender2() {
        return gender2;
    }

    public void setGender2(String gender2) {
        this.gender2 = gender2;
    }
}
