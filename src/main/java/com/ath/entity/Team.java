package com.ath.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int id;
    private String teamName;
    private String leaderName, leaderPhoneN, leaderIdCard;
    private String doctorName, doctorPhoneN, doctorIdCard;
    private List<Athlete> members;
    private String teamUsername,teamPassword;

    public Team(){
        super();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamUsername() {
        return teamUsername;
    }

    public void setTeamUsername(String teamUsername) {
        this.teamUsername = teamUsername;
    }

    public String getTeamPassword() {
        return teamPassword;
    }

    public void setTeamPassword(String teamPassword) {
        this.teamPassword = teamPassword;
    }


    public List<Athlete> getMembers() {
        return members;
    }

    public void setMembers(List<Athlete> members) {
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderPhoneN() {
        return leaderPhoneN;
    }

    public void setLeaderPhoneN(String leaderPhoneN) {
        this.leaderPhoneN = leaderPhoneN;
    }

    public String getLeaderIdCard() {
        return leaderIdCard;
    }

    public void setLeaderIdCard(String leaderIdCard) {
        this.leaderIdCard = leaderIdCard;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPhoneN() {
        return doctorPhoneN;
    }

    public void setDoctorPhoneN(String doctorPhoneN) {
        this.doctorPhoneN = doctorPhoneN;
    }

    public String getDoctorIdCard() {
        return doctorIdCard;
    }

    public void setDoctorIdCard(String doctorIdCard) {
        this.doctorIdCard = doctorIdCard;
    }
}
