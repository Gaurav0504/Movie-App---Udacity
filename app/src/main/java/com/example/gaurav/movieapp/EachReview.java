package com.example.gaurav.movieapp;

public class EachReview {

    private String id;
    private String content;
    private String author;
    private String url;

    public EachReview(String id, String author, String content, String url){
        this.id = id;
        this.author = author;
        this.content = content;
        this.url =  url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
