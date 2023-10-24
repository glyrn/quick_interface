package com.example.quick_interface.controller;

import com.example.quick_interface.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quickController {

    @GetMapping("/stu")
    public Student callBack() {

        Student student = new Student();

        student.setAge("20");
        student.setId("1");
        student.setPhone("123456");
        student.setEmail("123@d");

        return student;
    }
}
