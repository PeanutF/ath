package com.ath.controller;


import com.ath.dao.*;
import com.ath.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
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

    @Autowired
    private ObjMapper objMapper;

    @RequestMapping("/athlete/all")
    public List<Athlete> queryAth(){
        return athleteMapper.getAll();
    }

    @RequestMapping("/athlete/teamName")
    public List<Athlete> queryByTeam(@RequestBody Map<String,String> map){
        String teamName = map.get("teamName");
        return athleteMapper.getByTeamName(teamName);
    }

    @RequestMapping("/team/all")
    public List<Team> queryTeamAll(){
        List<Team> teams = teamMapper.getTeamAll();
        return teams;
    }

    @RequestMapping("/team/name")
    public Team queryTeamByName(@RequestBody Map<String,String> map){
        String teamName = map.get("teamName");
        if(teamMapper.findByName(teamName) == null)
            return new Team();
        else return teamMapper.findByName(teamName);

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

    @RequestMapping("/arrange/object")
    public List<GradeForm> findByObj(@RequestBody Map<String,String> map){
        return null;//todo
    }

    @RequestMapping("/arrange/all")
    public List<CompeteForm> findAll(){
        List<CompeteForm> competeForms = formMapper.findCompeteFormAll();
        for(CompeteForm competeForm: competeForms){
            competeForm.setAthName(athleteMapper.getById(competeForm.getAthId()).getName());
            int objId = competeForm.getObjId();
            Obj obj = objMapper.findById(objId);
            String name = obj.getName();
            competeForm.setObjName(objMapper.findById(competeForm.getObjId()).getName());
        }
        return competeForms;
    }

}
