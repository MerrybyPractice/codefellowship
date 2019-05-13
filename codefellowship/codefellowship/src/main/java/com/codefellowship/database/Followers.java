package com.codefellowship.database;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Followers {
    @Id
    @GeneratedValue
    public long id;
    @ManyToOne(fetch = FetchType.EAGER)
    public CodefellowshipUser fromUser;
    @ManyToOne(fetch = FetchType.EAGER)
    public CodefellowshipUser toUser;
    @GeneratedValue
    public Date followedOn;

    public Followers() {

    }

    public Followers(CodefellowshipUser fromUser, CodefellowshipUser toUser) {
        setToUser(toUser);
        setFromUser(fromUser);
    }

    public long getId() {
        return id;
    }

    public CodefellowshipUser getFromUser() {
        return fromUser;
    }

    public void setFromUser(CodefellowshipUser fromUser) {
        this.fromUser = fromUser;
    }

    public CodefellowshipUser getToUser() {
        return toUser;
    }

    public void setToUser(CodefellowshipUser toUser) {
        this.toUser = toUser;
    }

    public Date getFollowedOn() {
        return followedOn;
    }
}
