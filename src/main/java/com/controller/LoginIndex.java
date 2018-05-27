package com.controller;

import com.pojo.User;
import com.service.UserService;

import java.io.IOException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginIndex {
    @Autowired
    private UserService service;
    @RequestMapping("/login")
    public String loginPage(){
        return "loginPage";
    }
    @ResponseBody
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public Map<String,Object> doLogin(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password, HttpSession session){
        User loginUser = null;
        loginUser = service.checkLogin(username,password);
        Map<String,Object> json = new HashMap<String, Object>();
        if(loginUser !=null) {
            session.setAttribute("loginUser",loginUser.getId());
            json.put("Msg","SUCCESS");
            json.put("loginUser", loginUser.getId());
            return json;
        }else {
            json.put("Msg","FAIL");
            return json;
        }
    }
    @RequestMapping(value = "/signup")
    public String signUpPage(){
        return "signup";
    }
    @RequestMapping(value ="/success")
    public String success(){
        return "success";
    }

}
