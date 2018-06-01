package com.ath.dao;

import com.ath.entity.AgeGroup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgeMapper {
    @Insert("INSERT INTO age_group(ageMin,ageMax,sex)" +
                        "VALUES(#{ageMin},#{ageMax},#{sex})")
    void insertAgeGroup(AgeGroup ageGroup);

    @Select("SELECT * FROM age_group")
    @Results(id = "ageGroupMap",value = {
            @Result(property = "ageMin",column = "ageMin"),
            @Result(property = "ageMax",column = "ageMax"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "id",column = "age_group_id")
    })
    List<AgeGroup> findAgeGroupAll();
}
