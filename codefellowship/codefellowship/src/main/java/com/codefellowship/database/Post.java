package com.codefellowship.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

    @ManyToOne
    private CodefellowshipUser user;
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String body;
    private String timestamp;

    public CodefellowshipUser getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public long getId() {
        return id;
    }

}
