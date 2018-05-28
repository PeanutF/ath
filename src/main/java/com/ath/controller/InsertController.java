package com.ath.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.ath.dao.AgeMapper;
import com.ath.dao.AthleteMapper;
import com.ath.dao.TeamMapper;
import com.ath.entity.AgeGroup;
import com.ath.entity.Athlete;
import com.ath.entity.Referee;
import com.ath.entity.Team;
import com.ath.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/add")
public class InsertController {

    @Autowired
    private AgeMapper ageMapper;

    @Autowired
    private AddService addService;

    @RequestMapping("/athlete")
    public void insert(@RequestBody Athlete athlete){
        addService.addAthlete(athlete);
    }

    @RequestMapping("/team")
    public void insert(@RequestBody Map<String,String> map){
        JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(map));
        JSONObject teamObj = jsonObject.getJSONObject("team");
        JSONArray membersArr = jsonObject.getJSONArray("members");
        List<Athlete> athletes = JSON.parseArray(membersArr.toJSONString(),Athlete.class);
        Team team = JSON.parseObject(teamObj.toJSONString(),Team.class);
        team.setMembers(athletes);
        addService.addTeam(team);
    }

    @RequestMapping("/referee")
    public void insert(@RequestBody Referee referee){
        addService.addReferee(referee);
    }

    //test
    @RequestMapping("/age_group")
    public String insert(AgeGroup ageGroup){
        ageMapper.insertAgeGroup(ageGroup);
        return "success";
    }
}
