package com.wrongkey.hibernate.model;

import java.util.Date;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/15
 *@version v1.0
 *
 */
public class Event {
    private int id;

    private String title;
    private Date date;

    public Event() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event:\nid:    "+id+"\ntitle: "+title+"\ndate:   "+date;
    }
}