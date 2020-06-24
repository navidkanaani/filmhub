package com.kaen.filmhub_j.models;
//slides class
public class Slide {
    private String image;
    private String title;
    private String url;

    public Slide(String image, String title, String url) {
        this.image = image;
        this.title = title;
        this.url = url;
    }

    public Slide(String image, String title) {
        this.image = image;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
