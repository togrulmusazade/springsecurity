package com.company.springsecurity.controller;


import com.company.springsecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    public static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Togrul Musazade"),
            new Student(2,"Togrul Musazade"),
            new Student(3,"Togrul Musazade")
    );


    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){
        return STUDENTS
                .stream()
                .filter(student -> student.getId().equals(studentId))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("student "+studentId+" does not exists"));
    }





}



