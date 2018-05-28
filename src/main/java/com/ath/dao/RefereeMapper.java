package com.ath.dao;

import com.ath.entity.Referee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

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
}
