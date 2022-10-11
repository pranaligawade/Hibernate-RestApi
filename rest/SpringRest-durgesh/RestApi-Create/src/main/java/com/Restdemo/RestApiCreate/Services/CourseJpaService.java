package com.Restdemo.RestApiCreate.Services;

//parent

import com.Restdemo.RestApiCreate.Entity.CourseJpa;

import java.util.List;


public interface CourseJpaService {
    public List<CourseJpa> getJpaCourses();
    public CourseJpa getJpaCourse(Long a);

   public CourseJpa addJpaCourse(CourseJpa course);

    public CourseJpa updateJpaCourse(CourseJpa course);

     public  void deleteJpaCourse(Long parseLong);
    // get data with title
     public CourseJpa getCourseByTitle(String title);
}
