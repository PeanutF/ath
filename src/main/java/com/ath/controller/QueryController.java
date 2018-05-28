package com.ath.controller;


import com.ath.dao.AthleteMapper;
import com.ath.entity.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private AthleteMapper athleteMapper;

    @RequestMapping("/athlete/all")
    public List<Athlete> queryAth(){
        return athleteMapper.getAll();
    }
}
