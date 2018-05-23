package com.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class HomeController extends AbstractController {
    //使用默认HandlerMapping
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("students",new String[]{"张三","李四","王五"});
        ModelAndView mav = new ModelAndView("home",map);
        return mav;
    }
}
