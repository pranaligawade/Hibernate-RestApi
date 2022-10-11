package com.codewithdurgesh.blog.service;

import com.codewithdurgesh.blog.Dao.StudentDao;
import com.codewithdurgesh.blog.enttity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService  {
    @Autowired
    private StudentDao studentDao;

    public List<Student> allStudent(){
       return studentDao.findAll();
   }

    public  Student saveStud(Student s){
       return studentDao.save(s);
    }
}
