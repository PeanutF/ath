package com.ath.dao;

import com.ath.entity.Obj;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjMapper {

    @Select("SELECT * FROM object WHERE obj_name = #{name} AND obj_sex = #{objSex}")
    @Results(id = "objMap",value = {
            @Result(property = "name",column = "obj_name"),
            @Result(property = "id",column = "obj_id"),
            @Result(property = "sex",column = "obj_sex")
    })
    Obj findObjByNameAndSex(@Param("name") String name,@Param("objSex") int sex);

    @Select("SELECT * FROM object WHERE obj_id = #{objId}")
    @ResultMap("objMap")
    Obj findById(@Param("objId") int id);
}
