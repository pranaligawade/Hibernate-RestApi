package com.Restdemo.RestApiCreate.dao;

import com.Restdemo.RestApiCreate.Entity.Course;
import com.Restdemo.RestApiCreate.Entity.CourseJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<CourseJpa,Long> {
    public CourseJpa getCourseByTitle(String title);
}
