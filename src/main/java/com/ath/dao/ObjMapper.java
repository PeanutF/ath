package com.ath.dao;

import com.ath.entity.Obj;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjMapper {

    @Select("SELECT * FROM object WHERE obj_name = #{name}")
    @Results(id = "objMap",value = {
            @Result(property = "name",column = "obj_name"),
            @Result(property = "id",column = "obj_id"),
            @Result(property = "sex",column = "obj_sex")
    })
    public Obj findObjByName(String name);
}
