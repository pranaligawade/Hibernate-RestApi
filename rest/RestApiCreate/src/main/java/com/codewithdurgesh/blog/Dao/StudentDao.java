package com.codewithdurgesh.blog.Dao;

import com.codewithdurgesh.blog.enttity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
