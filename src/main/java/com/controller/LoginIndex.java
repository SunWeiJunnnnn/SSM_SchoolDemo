package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginIndex {
    @Autowired
    private UserService service;
    @RequestMapping("/login")
    public String loginPage(){
        return "loginPage";
    }
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String doLogin(String username,String password){
        User loginUser = null;
        loginUser = service.checkLogin(username,password);
        if(loginUser !=null) {return "SUCCESS";}else {return "FAIL";}
    }
}
