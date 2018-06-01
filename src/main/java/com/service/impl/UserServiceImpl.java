package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    public User checkLogin(String username, String password) {
        if(true)
            throw new ClassCastException("类型错误信息");
        return dao.checkLogin(username,password);
    }
}
