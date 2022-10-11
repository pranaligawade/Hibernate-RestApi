package com.codewithdurgesh.blog.controller;

import com.codewithdurgesh.blog.enttity.Student;
import com.codewithdurgesh.blog.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
     @GetMapping("/stu")
    public List<Student> getall(){
      return  studentService.allStudent();
    }
    @PostMapping("/stu")
    public Student addstudent(@RequestBody Student student){
        studentService.saveStud(student);
         return student;
    }
}

