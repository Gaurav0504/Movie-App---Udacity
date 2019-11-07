package com.example.gaurav.movieapp;

import java.io.Serializable;

public class MyMovie implements Serializable {

    private String title;
    private String rating;
    private String overview;
    String poster_path;
    private long id;
    private String backdrop_path;
    public String release_date;
    private String voteCount;
    private boolean favorite;

    public MyMovie(long id, String title, String overview, String poster_path, String backdrop_path, String rating, String release_date, String voteCount, boolean favorite){
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.poster_path = poster_path;
        this.backdrop_path = backdrop_path;
        this.rating = rating;
        this.release_date = release_date;
        this.voteCount = voteCount;
        this.favorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId(){ return id;}

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
