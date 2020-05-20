package com.csdj.controller;

import com.csdj.pojo.TUserRose;
import com.csdj.service.TuserRoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TuserRoseController {
    @Autowired
    private TuserRoseService service;

    @RequestMapping("role")
    public String role(){
        return "role";
    }

    @RequestMapping("seletuse")
    @ResponseBody
    public Map<String, Object> seletuse(Integer page,Integer limit){
        List<TUserRose> list =service.seletuse(page,limit);
        Integer seletuses=service.seletuses();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", seletuses);
        map.put("data", list);
        return map;
    }
}
