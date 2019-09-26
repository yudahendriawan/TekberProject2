package com.example.tekberproject2.model;

public class DataTV {
    private String id;
    private String airedSeason;
    private String episodeName;
    private String firstAired;
    private String director;
    private String rating;

    //biar bisa mengakses method set get yang ada di guest stars
    private GuestStar guestStar = new GuestStar();
    private String photos;

    public DataTV() {
    }

    public DataTV(String id, String airedSeason, String episodeName, String firstAired, String director, String rating, GuestStar guestStar, String photos) {
        this.id = id;
        this.airedSeason = airedSeason;
        this.episodeName = episodeName;
        this.firstAired = firstAired;
        this.director = director;
        this.rating = rating;
        this.guestStar = guestStar;
        this.photos = photos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAiredSeason() {
        return airedSeason;
    }

    public void setAiredSeason(String airedSeason) {
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public GuestStar getGuestStar() {
        return guestStar;
    }

    public void setGuestStar(GuestStar guestStar) {
        this.guestStar = guestStar;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "DataTV{" +
                "id=" + id +
                ", airedSeason=" + airedSeason +
                ", episodeName='" + episodeName + '\'' +
                ", firstAired='" + firstAired + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                ", guestStar=" + guestStar +
                '}';
    }
}
