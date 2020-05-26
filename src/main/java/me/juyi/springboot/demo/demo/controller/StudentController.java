package me.juyi.springboot.demo.demo.controller;

import me.juyi.springboot.demo.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/juyi/")
public class StudentController {

    @Autowired
    private IStudentService service;

    @GetMapping("/students")
    public List<String> getStudent() {
        // null pointer
        return service.getStudents();
    }

}
