package com.ath.entity;

public class GradeForm {

    private int refId;//裁判的id
    private int ath_id;
    private int grade;
    private String objName;

    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    public int getAth_id() {
        return ath_id;
    }

    public void setAth_id(int ath_id) {
        this.ath_id = ath_id;
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
