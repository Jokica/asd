package com.eimt.emit.Domain.Models;


import javax.persistence.OneToOne;
import java.util.Date;

public class Token {
    private String value;
    private Date date;
    @OneToOne
    private User user;

    public Token(String value, Date date, User user) {
        this.value = value;
        this.date = date;
        this.user = user;
    }
    public  boolean isToken(String token){
        return  this.value == token;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Token(String value, Date date) {
        this.value = value;
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
