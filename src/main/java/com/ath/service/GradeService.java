package com.ath.service;

import com.ath.dao.AthleteMapper;
import com.ath.dao.FormMapper;
import com.ath.dao.ObjMapper;
import com.ath.dao.RefereeMapper;
import com.ath.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private AthleteMapper athleteMapper;

    @Autowired
    private RefereeMapper refereeMapper;

    @Autowired
    private ObjMapper objMapper;

    @Autowired
    private FormMapper formMapper;

    public void addForm(List<String> athleteNames, String refereeName, String objName, int groupNumber){
        ArrayList<Athlete> athletes = new ArrayList<>();
        for(String name : athleteNames){
            athletes.add(athleteMapper.getByName(name));
        }
        Referee referee = refereeMapper.findRefByName(refereeName);
        Obj obj = objMapper.findObjByName(objName);
        for(Athlete athlete : athletes){
            CompeteForm competeForm = new CompeteForm();
            competeForm.setAthId(athlete.getId());
            competeForm.setGroupNumber(groupNumber);
            competeForm.setObjId(obj.getId());
            formMapper.insertCompeteForm(competeForm);
            GradeForm gradeForm = new GradeForm();
            gradeForm.setAthId(athlete.getId());
            gradeForm.setObjName(obj.getName());
            gradeForm.setRefId(referee.getId());
            formMapper.insertGradeForm(gradeForm);
        }
    }

    public void addGrade(List<String> athNames,String refName,int[] grades){
        int refId = refereeMapper.findRefByName(refName).getId();
        for(String name : athNames){
            int athId = athleteMapper.getByName(name).getId();
            int grade = grades[athNames.indexOf(name)];
            formMapper.setGrade(grade,athId,refId);
        }
    }
}
