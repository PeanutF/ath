package com.ath.entity;

public class CompeteForm {

    private int id;
    private int athId;
    private int objId;
    private int groupNumber;
    private String athName;
    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getAthName() {
        return athName;
    }

    public void setAthName(String athName) {
        this.athName = athName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAthId() {
        return athId;
    }

    public void setAthId(int athId) {
        this.athId = athId;
    }

    public int getObjId() {
        return objId;
    }

    public void setObjId(int objId) {
        this.objId = objId;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
