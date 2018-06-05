package com.ath.service;

import com.ath.dao.AthleteMapper;
import com.ath.dao.RefereeMapper;
import com.ath.dao.TeamMapper;
import com.ath.entity.Athlete;
import com.ath.entity.Referee;
import com.ath.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddService {

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private AthleteMapper athleteMapper;

    @Autowired
    private RefereeMapper refereeMapper;

    public void addTeam(Team team){
        teamMapper.insert(team);
        team.setId(teamMapper.findIdByName(team.getTeamName()).getId());
        List<Athlete> members = team.getMembers();
        for(Athlete athlete:members) {
            athlete.setTeamId(team.getId());
            athleteMapper.insert(athlete);
        }
    }

    public void addAthlete(Athlete athlete){
        athleteMapper.insert(athlete);
    }

    public void addReferee(Referee referee){
        refereeMapper.insertReferee(referee);
    }
}
