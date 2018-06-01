package com.ath.dao;

import com.ath.entity.CompeteForm;
import com.ath.entity.GradeForm;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormMapper {

    @Insert("INSERT INTO compete_form(obj_id,ath_id,group_number)" +
                "VALUES(#{objId},#{athId},#{groupNumber})")
    public void insertCompeteForm(CompeteForm competeForm);

    @Insert("INSERT INTO grade_form(ref_id,ath_id,grade,obj_name)" +
                "VALUES(#{refId},#{athId},#{grade},#{objName})")
    public void insertGradeForm(GradeForm gradeForm);

    @Select("SELECT * FROM compete_form")
    @Results(id = "competeFormMap",value = {
            @Result(property = "objId",column = "obj_id"),
            @Result(property = "athId",column = "ath_id"),
            @Result(property = "groupNumber",column = "group_number")
    })
    public List<CompeteForm> findCompeteFormAll();

    @Select("SELECT * FROM grade_form")
    @Results(id = "gradeFormMap",value = {
            @Result(property = "refId",column = "ref_id"),
            @Result(property = "athId",column = "ath_id"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "objName",column = "obj_name")
    })
    public List<GradeForm> findGradeFormAll();

    @Update("UPDATE grade_form SET grade = #{grade} WHERE ath_id = #{athId} AND ref_id = #{refId}")
    void setGrade(int grade,int athId,int refId);
}
