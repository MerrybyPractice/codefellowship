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

    public Date followedOn;
}
