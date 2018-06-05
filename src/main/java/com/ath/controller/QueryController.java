package com.ath.controller;


import com.ath.dao.AthleteMapper;
import com.ath.dao.FormMapper;
import com.ath.dao.RefereeMapper;
import com.ath.dao.TeamMapper;
import com.ath.entity.Athlete;
import com.ath.entity.GradeForm;
import com.ath.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private AthleteMapper athleteMapper;

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private FormMapper formMapper;

    @Autowired
    private RefereeMapper refereeMapper;

    @RequestMapping("/athlete/all")
    public List<Athlete> queryAth(){
        return athleteMapper.getAll();
    }

    @RequestMapping("/team/all")
    public List<Team> queryTeamAll(){
        List<Team> teams = teamMapper.getTeamAll();
        return teams;
    }

    @RequestMapping("/team/name")
    public Team queryTeamByName(@RequestBody Map<String,String> map){
        String teamName = map.get("teamName");
        return teamMapper.findIdByName(teamName);
    }

    @RequestMapping("/grade/all")
    public List<GradeForm> queryGradeAll(){
        List<GradeForm> gradeForms = formMapper.findGradeFormAll();
        for(GradeForm gradeForm : gradeForms){
            gradeForm.setAthName(athleteMapper.getById(gradeForm.getAthId()).getName());
            gradeForm.setRefereeName(refereeMapper.findRefById(gradeForm.getRefId()).getName());
        }
        return gradeForms;
    }

}
