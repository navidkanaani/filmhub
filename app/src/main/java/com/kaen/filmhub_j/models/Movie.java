package com.kaen.filmhub_j.models;

//movies class
public class Movie {

    private int id;
    private String Name;
    private String Description;
    private String SubtitleUrl;
    private String ProductionYear;
    private String NetflixRanking;
    private String IMDBRanking;
    private String RottenTomatoesRanking;
    private String MetaCritic;
    private String MovieDatabaseRanking;
    private String AverageRanking;
    private String Director;
    private String Stars;
    private String Duration;
    private int thumbnail;
    private String AgeRating;
    private String VideoUrl;
    private String TitleBanerUrl;
    private String RootId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubtitleUrl() {
        return SubtitleUrl;
    }

    public void setSubtitleUrl(String subtitleUrl) {
        SubtitleUrl = subtitleUrl;
    }

    public String getProductionYear() {
        return ProductionYear;
    }

    public void setProductionYear(String productionYear) {
        ProductionYear = productionYear;
    }

    public String getNetflixRanking() {
        return NetflixRanking;
    }

    public void setNetflixRanking(String netflixRanking) {
        NetflixRanking = netflixRanking;
    }

    public String getIMDBRanking() {
        return IMDBRanking;
    }

    public void setIMDBRanking(String IMDBRanking) {
        this.IMDBRanking = IMDBRanking;
    }

    public String getRottenTomatoesRanking() {
        return RottenTomatoesRanking;
    }

    public void setRottenTomatoesRanking(String rottenTomatoesRanking) {
        RottenTomatoesRanking = rottenTomatoesRanking;
    }

    public String getMetaCritic() {
        return MetaCritic;
    }

    public void setMetaCritic(String metaCritic) {
        MetaCritic = metaCritic;
    }

    public String getMovieDatabaseRanking() {
        return MovieDatabaseRanking;
    }

    public void setMovieDatabaseRanking(String movieDatabaseRanking) {
        MovieDatabaseRanking = movieDatabaseRanking;
    }

    public String getAverageRanking() {
        return AverageRanking;
    }

    public void setAverageRanking(String averageRanking) {
        AverageRanking = averageRanking;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getStars() {
        return Stars;
    }

    public void setStars(String stars) {
        Stars = stars;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getRootId() {
        return RootId;
    }

    public void setRootId(String rootId) {
        RootId = rootId;
    }

    public Movie(int id, String name, String description, String subtitleUrl, String productionYear, String netflixRanking, String IMDBRanking, String rottenTomatoesRanking, String metaCritic, String movieDatabaseRanking, String averageRanking, String director, String stars, String duration, int thumbnail, String ageRating, String videoUrl, String titleBanerUrl, String rootId) {
        this.id = id;
        Name = name;
        Description = description;
        SubtitleUrl = subtitleUrl;
        ProductionYear = productionYear;
        NetflixRanking = netflixRanking;
        this.IMDBRanking = IMDBRanking;
        RottenTomatoesRanking = rottenTomatoesRanking;
        MetaCritic = metaCritic;
        MovieDatabaseRanking = movieDatabaseRanking;
        AverageRanking = averageRanking;
        Director = director;
        Stars = stars;
        Duration = duration;
        this.thumbnail = thumbnail;
        AgeRating = ageRating;
        VideoUrl = videoUrl;
        TitleBanerUrl = titleBanerUrl;
        RootId = rootId;
    }

    public Movie(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    public Movie(String Name, int thumbnail, String TitleBanerUrl) {
        this.Name = Name;
        this.thumbnail = thumbnail;
        this.TitleBanerUrl = TitleBanerUrl;
    }

    public Movie(String Name, int thumbnail) {
        this.Name = Name;
        this.thumbnail = thumbnail;
    }

    public Movie(String Name, String description, int thumbnail, String AgeRating, String VideoUrl) {
        this.Name = Name;
        this.Description = description;
        this.thumbnail = thumbnail;
        this.AgeRating = AgeRating;
        this.VideoUrl = VideoUrl;
    }

    public String getTitleBanerUrl() {
        return TitleBanerUrl;
    }

    public void setTitleBanerUrl(String titleBanerUrl) {
        this.TitleBanerUrl = titleBanerUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getAgeRating() {
        return AgeRating;
    }

    public void setAgeRating(String ageRating) {
        this.AgeRating = ageRating;
    }

    public String getVideoUrl() {
        return VideoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.VideoUrl = videoUrl;
    }
}
