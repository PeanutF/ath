package com.ath.dao;

import com.ath.entity.Referee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.Ref;

@Repository
public interface RefereeMapper {

    @Insert("INSERT INTO referee(ref_name,ref_phoneN,ref_idCard,ref_username,ref_password)" +
                "VALUES(#{name},#{refPhoneN},#{refIdCard},#{refUsername},#{refPassword})")
    public void insertReferee(Referee referee);

    @Select("SELECT * FROM referee WHERE ref_name = #{name}")
    @Results(id = "refereeMap", value = {
            @Result(property = "id",column = "ref_id"),
            @Result(property = "name",column = "ref_name"),
            @Result(property = "refUsername",column = "ref_username"),
            @Result(property = "refPassword",column = "ref_password"),
            @Result(property = "refPhoneN",column = "ref_phoneN"),
            @Result(property = "refIdCard",column = "ref_idCard")
    })
    public Referee findRefByName(String name);

    @Select("SELECT * FROM referee WHERE ref_id = #{id}")
    @ResultMap("refereeMap")
    Referee findRefById(int id);
}
