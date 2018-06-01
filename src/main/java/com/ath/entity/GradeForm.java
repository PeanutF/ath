package com.ath.entity;

public class GradeForm {

    private int refId;//裁判的id
    private int athId;
    private int grade;
    private String objName;
    private String athName;
    private String refereeName;

    public String getAthName() {
        return athName;
    }

    public void setAthName(String athName) {
        this.athName = athName;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    public int getAthId() {
        return athId;
    }

    public void setAthId(int ath_id) {
        this.athId = ath_id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }
}
