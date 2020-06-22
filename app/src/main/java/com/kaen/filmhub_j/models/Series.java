package com.kaen.filmhub_j.models;
//series class
public class Series {
    private String title, description,rating,streamLink;
    private int thumbnail,cover,episodes;

    public Series(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public Series(String title, int thumbnail, int cover) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.cover = cover;
    }

    public Series(String title, String description, String rating, String streamLink, int thumbnail, int cover, int episodes) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.streamLink = streamLink;
        this.thumbnail = thumbnail;
        this.cover = cover;
        this.episodes = episodes;
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

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
