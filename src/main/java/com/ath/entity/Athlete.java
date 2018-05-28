package com.ath.entity;

public class Athlete {

    private int id;
    private int ageGroupId;
    private int teamId;
    private String name;
    private String idCard;
    private int cultureGrade;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(int ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCultureGrade() {
        return cultureGrade;
    }

    public void setCultureGrade(int cultureGrade) {
        this.cultureGrade = cultureGrade;
    }
}
