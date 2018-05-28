package com.ath.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ath.entity.Athlete;
import com.ath.entity.Obj;
import com.ath.entity.Referee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/grade")
public class ScoreController {

    @RequestMapping("/mark")
    public void mark(@RequestBody Map<String,String> map){
        JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(map));
        JSONArray athNameArr = jsonObject.getJSONArray("athNames");
        List<String> athNames = JSON.parseArray(athNameArr.toJSONString(),String.class);
        JSONObject refNameObj = jsonObject.getJSONObject("refereeName");
        String refereeName = JSON.parseObject(refNameObj.toJSONString(),String.class);
        JSONObject objNameObj = jsonObject.getJSONObject("objectName");//项目
        String objName = JSON.parseObject(objNameObj.toJSONString(),String.class);
        int groupNumber = Integer.parseInt(map.get("groupNumber"));
    }
}
