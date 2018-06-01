package com.ath.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ath.entity.Athlete;
import com.ath.entity.Obj;
import com.ath.entity.Referee;
import com.ath.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/grade")
public class ScoreController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/mark")
    public void mark(@RequestBody Map<String,String> map){
        JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(map));
        JSONArray athNameArr = jsonObject.getJSONArray("athNames");
        List<String> athNames = JSON.parseArray(athNameArr.toJSONString(),String.class);
        String refereeName = map.get("refereeName");
        String objName = map.get("objectName");
        int groupNumber = Integer.parseInt(map.get("groupNumber"));
        gradeService.addForm(athNames,refereeName,objName,groupNumber);
    }
}
