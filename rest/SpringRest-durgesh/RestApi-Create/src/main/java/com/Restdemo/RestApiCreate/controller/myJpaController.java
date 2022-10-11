package com.Restdemo.RestApiCreate.controller;

import com.Restdemo.RestApiCreate.Entity.CourseJpa;
import com.Restdemo.RestApiCreate.Services.CourseJpaService;
import com.Restdemo.RestApiCreate.Services.CourseService;
import com.Restdemo.RestApiCreate.Services.CoursesJpaServicesimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//presentation layer
@RestController
public class myJpaController {

    @Autowired
     private CourseJpaService courseService;

    @GetMapping("/home1")
    public String home(){
        return " welcome to course application !";
    }


//    @GetMapping("/courses")
//    public List<Course> getCourse(){
//        return this.courseService.getCourses();
//
//    }

    //alternative
    @RequestMapping(path = "/courses1",method = RequestMethod.GET)
    public List<CourseJpa> getCourse(){
        return this.courseService.getJpaCourses();
    }

    @GetMapping("courses1/{courseId}")
    public CourseJpa getCourse(@PathVariable Long courseId){
        return  this.courseService.getJpaCourse(courseId);
    }

    @PostMapping("/courses1")
     public CourseJpa addCourses(@RequestBody CourseJpa course){
return  this.courseService.addJpaCourse(course);
     }

     @PutMapping("/courses1")
     public CourseJpa updateCourse(@RequestBody CourseJpa course){
        return this.courseService.updateJpaCourse(course);
     }
     @DeleteMapping("/courses1/{courseId}")
      public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
         try {
         this.courseService.deleteJpaCourse(Long.parseLong(courseId));
         return new ResponseEntity<>(HttpStatus.OK);

     }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
// get data with title
     @GetMapping("/{title}")
    public CourseJpa getCourseByTitle(@PathVariable String title) {
        return this.courseService.getCourseByTitle(title);
    }
}

