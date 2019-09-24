package com.example.tekberproject2.model;

public class DataTV {
    private int id;
    private int airedSeason;
    private String episodeName;
    private String firstAired;;
    private String director;
    private double rating;
    private GuestStar guestStar;

    public DataTV() {
    }

    public DataTV(int id, int airedSeason, String episodeName, String firstAired, String director, double rating, GuestStar guestStar) {
        this.id = id;
        this.airedSeason = airedSeason;
        this.episodeName = episodeName;
        this.firstAired = firstAired;
        this.director = director;
        this.rating = rating;
        this.guestStar = guestStar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAiredSeason() {
        return airedSeason;
    }

    public void setAiredSeason(int airedSeason) {
        this.airedSeason = airedSeason;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public GuestStar getGuestStar() {
        return guestStar;
    }

    public void setGuestStar(GuestStar guestStar) {
        this.guestStar = guestStar;
    }
}
