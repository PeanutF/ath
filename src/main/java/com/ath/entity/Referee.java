package com.ath.entity;

public class Referee {
    private int id;
    private String name;
    private String refPhoneN;
    private String refIdCard;
    private String refUsername, refPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefPhoneN() {
        return refPhoneN;
    }

    public void setRefPhoneN(String refPhoneN) {
        this.refPhoneN = refPhoneN;
    }

    public String getRefIdCard() {
        return refIdCard;
    }

    public void setRefIdCard(String refIdCard) {
        this.refIdCard = refIdCard;
    }

    public String getRefUsername() {
        return refUsername;
    }

    public void setRefUsername(String refUsername) {
        this.refUsername = refUsername;
    }

    public String getRefPassword() {
        return refPassword;
    }

    public void setRefPassword(String refPassword) {
        this.refPassword = refPassword;
    }
}
