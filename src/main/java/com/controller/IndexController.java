package com.controller;

import com.dao.StudentDao;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.*;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Map<String,Object> model){
        model.put("slogan","hello world");
        return "index";
    }
}

