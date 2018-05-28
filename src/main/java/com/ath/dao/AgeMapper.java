package com.ath.dao;

import com.ath.entity.AgeGroup;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeMapper {
    @Insert("INSERT INTO age_group(ageMin,ageMax,sex)" +
                        "VALUES(#{ageMin},#{ageMax},#{sex})")
    public void insertAgeGroup(AgeGroup ageGroup);
}
