package com.codewithdurgesh.blog.Dao;

import com.codewithdurgesh.blog.enttity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDao extends JpaRepository<Subject, Integer> {
}
