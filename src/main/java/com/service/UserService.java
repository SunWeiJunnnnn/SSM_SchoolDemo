package com.service;

import com.pojo.User;

public interface UserService {
    User checkLogin(String username, String password);
}
