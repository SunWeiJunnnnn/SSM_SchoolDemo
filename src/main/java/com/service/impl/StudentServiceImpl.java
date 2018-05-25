package com.service.impl;

import com.dao.StudentDao;
import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    public Student fetchById(int id) {
        return null;
    }

    public Student fetchbyId(int id) {
        return null;
    }

    public int insert(Student student) {
        return 0;
    }

    public boolean delete(int id) {
        return false;
    }

    public boolean update(Student student) {
        return false;
    }
}
