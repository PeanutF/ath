package com.ath.dao;

import com.ath.entity.Athlete;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.ResultMap;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AthleteMapper {
    @Select("SELECT * FROM athlete")
    @Results(id = "athleteMap", value = {
            @Result(property = "id", column = "ath_id"),
            @Result(property = "ageGroupId", column = "age_group_id"),
            @Result(property = "teamId", column = "team_id"),
            @Result(property = "name", column = "ath_name"),
            @Result(property = "idCard", column = "ath_idCard"),
            @Result(property = "cultureGrade", column = "ath_culture_grade"),
            @Result(property = "age", column = "ath_age")
    })
    List<Athlete> getAll();

    @Select("SELECT * FROM athlete NATURE JOIN team WHERE team_name = #{teamName}")
    @org.apache.ibatis.annotations.ResultMap("athleteMap")
    List<Athlete> getByTeamName(@Param("teamName") String teamName);

    @Select("SELECT * FROM athlete WHERE ath_name = #{name}")
    @org.apache.ibatis.annotations.ResultMap("athleteMap")
    Athlete getByName(String name);

    @Select("SELECT * FROM athlete WHERE ath_id = #{id}")
    @org.apache.ibatis.annotations.ResultMap("athleteMap")
    Athlete getById(int id);

    @Insert("INSERT INTO athlete(age_group_id,team_id,ath_name,ath_idCard,ath_culture_grade,ath_age) " +
            "VALUES(#{ageGroupId},#{teamId},#{name},#{idCard},#{cultureGrade},#{age})")
    void insert(Athlete athlete);


}
