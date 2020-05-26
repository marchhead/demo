package me.juyi.springboot.demo.demo.service;

import me.juyi.springboot.demo.demo.dao.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentDao dao;

    @Override
    public List<String> getStudents() {

        return dao.getStudents();
    }
}
