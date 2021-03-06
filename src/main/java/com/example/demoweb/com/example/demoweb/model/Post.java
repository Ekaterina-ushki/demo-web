package com.example.demoweb.com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate){
        this.id=id;
        this.text=text;
        this.creationDate=creationDate;
        this.likes=0;
    }

    public Long getId() {return id;}

    public String getText() {
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate(){return creationDate;}

    public void setLikes(int likes){
        this.likes=likes;
    }
}
