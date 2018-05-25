package com.service;

import com.pojo.Student;

public interface StudentService {
    Student fetchbyId(int id );
    int insert(Student student);

    boolean delete(int id);

    boolean update(Student student);
}
