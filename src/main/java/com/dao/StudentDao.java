package com.dao;

import com.pojo.Student;
import java.util.*;


public interface StudentDao {
     Student fetchById(int id );
     void add(Student student);

    boolean delete(int id);

    boolean update(Student student);

    List<Student> getAll();
}
