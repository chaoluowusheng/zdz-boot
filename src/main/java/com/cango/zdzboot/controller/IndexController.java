package com.cango.zdzboot.controller;


import com.cango.zdzboot.dao.MSequenceDao;
import com.cango.zdzboot.entity.MSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private MSequenceDao mSequenceDao;
    @RequestMapping("/hello")
    @ResponseBody
     String index() {

        List<MSequence> list =mSequenceDao.createInsureNo();
        System.out.println("asdsadasd"
        );
        return "asda";
    }

}
