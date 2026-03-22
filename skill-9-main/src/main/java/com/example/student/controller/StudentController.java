package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.exception.StudentNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {

        if(id != 1){
            throw new StudentNotFoundException("Student with ID " + id + " not found");
        }

        return new Student(1,"Rahul","CSE");
    }
}