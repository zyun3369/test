package com.example.controller;

import com.example.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "hello springboot";
    }

    @RequestMapping("/testobj")
    public Student testobj(){
        Student student = new Student();
        student.setAge(11);
        student.setName("gg");
        return student;
    }
}
