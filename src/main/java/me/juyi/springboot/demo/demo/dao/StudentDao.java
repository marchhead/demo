package me.juyi.springboot.demo.demo.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("dao1")
public class StudentDao implements IStudentDao {
    @Override
    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        students.add("YD");
        students.add("LYK");
        students.add("YZZ");
        return students;
    }
}
