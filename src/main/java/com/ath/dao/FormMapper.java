package com.ath.dao;

import com.ath.entity.CompeteForm;
import com.ath.entity.GradeForm;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface FormMapper {

    @Insert("INSERT INTO compete_form(obj_id,ath_id,group_member)" +
                "VALUES(#{objId},#{ath_id},#{group_member})")
    public void insertCompeteForm(CompeteForm competeForm);

    @Insert("INSERT INTO grade_form(ref_id,ath_id,grade,obj_name)" +
                "VALUES(#{refId},#{athId},#{grade},#{objName})")
    public void insertGradeForm(GradeForm gradeForm);
}
