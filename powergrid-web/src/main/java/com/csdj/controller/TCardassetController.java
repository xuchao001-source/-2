package com.csdj.controller;

import com.csdj.pojo.TCardasset;
import com.csdj.service.TCardassetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TCardassetController {

    @Autowired
    private TCardassetService service;

    @RequestMapping("getTCardasset")
    @ResponseBody
    public Map<String, Object> getTCardasset(String CARDSTATECHANGE, String ORGName,String CARDREGUSER,Integer page,Integer limit){
     List<TCardasset> list=service.getTCardasset(CARDSTATECHANGE,ORGName,CARDREGUSER,page,limit);
     System.out.println("来了:"+CARDSTATECHANGE+ORGName+CARDREGUSER);
     int getcount=service.getTCardassetcount(CARDSTATECHANGE,ORGName,CARDREGUSER);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", getcount);
        map.put("data", list);
        return  map;
    }
}
