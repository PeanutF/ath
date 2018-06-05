package com.ath.dao;

import com.ath.entity.Team;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMapper {

    @Insert("INSERT INTO team(leader_name,leader_phoneN,leader_idCard,doctor_name,doctor_phoneN,doctor_idCard, team_name,team_username,team_password)"+
                " VALUES(#{leaderName},#{leaderPhoneN},#{leaderIdCard},#{doctorName},#{doctorPhoneN},#{doctorIdCard},#{teamName},#{teamUsername},#{teamPassword})")
    public void insert(Team team);

    @Select("SELECT team_id FROM team WHERE team_name = #{teamName}")
    @Results(id = "teamMap",value = {
            @Result(property = "id",column = "team_id"),
            @Result(property = "leaderName",column = "leader_name"),
            @Result(property = "leaderPhoneN",column = "leader_phoneN"),
            @Result(property = "leaderIdCard",column = "leader_idCard"),
            @Result(property = "doctorName",column = "doctor_name"),
            @Result(property = "doctorPhoneN",column = "doctor_phoneN"),
            @Result(property = "doctorIdCard",column = "doctor_idCard"),
            @Result(property = "teamName",column = "team_name"),
            @Result(property = "teamUsername",column = "team_username"),
            @Result(property = "teamPassword",column = "team_password")
    })
    Team findIdByName(String teamName);

    @Select("SELECT * FROM team")
    @ResultMap("teamMap")
    List<Team> getTeamAll();
}
