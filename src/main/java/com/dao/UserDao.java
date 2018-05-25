package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.*;
public interface UserDao {
    User fetchById(int id);

    void add(User user);

    void delete(int id);

    void edit(User user);

    List<User> getAll();

    User checkLogin(@Param("username") String username, @Param("password") String password);
}
