package com.kaen.filmhub_j.models;

import java.util.List;
//movies class
public class Movie {

    private String title;
    private String description;
    private int thumbnail;
    private String rating;
    private String streamLink;
    private int cover;

    public Movie(String streamLink) {
        this.streamLink = streamLink;
    }

    public Movie(String title, int thumbnail, int cover) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.cover = cover;
    }

    public Movie(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public Movie(String title, String description, int thumbnail, String rating, String streamLink) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.rating = rating;
        this.streamLink = streamLink;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStreamLink() {
        return streamLink;
    }

    public void setStreamLink(String streamLink) {
        this.streamLink = streamLink;
    }
}
