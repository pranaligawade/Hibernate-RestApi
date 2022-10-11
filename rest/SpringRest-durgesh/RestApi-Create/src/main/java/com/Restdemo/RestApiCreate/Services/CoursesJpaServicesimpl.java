package com.Restdemo.RestApiCreate.Services;

import com.Restdemo.RestApiCreate.Entity.CourseJpa;
import com.Restdemo.RestApiCreate.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//with db
@Service
public class CoursesJpaServicesimpl implements CourseJpaService {
    // public List<Course> list;
    @Autowired
    private CourseDao courseDao;

//    public CoursesJpaServicesimpl() {
////        list= new ArrayList<>();
////        list.add(new Course(12,"java core","this course contains basic of java"));
////        list.add(new Course(123,"spring boot","this course contains basic of rest api using spring boot"));
//    }

    @Override
    public List<CourseJpa> getJpaCourses() {

        //return list;
        return courseDao.findAll();
    }

    @Override
    public CourseJpa getJpaCourse(Long courseId) {
        //        Course c=null;
//         for (Course course:list
//              ) {
//             if (course.getId()==courseId){
//                 c=course;
//                 break;
//             }
//
//         }
//         return  c;

        return courseDao.getOne(courseId);
    }


    @Override
    public CourseJpa addJpaCourse(CourseJpa course) {
//
//        list.add(course);
//        return  course;
        return courseDao.save(course);
    }

    @Override
    public CourseJpa updateJpaCourse(CourseJpa course) {
//     list.forEach(e->{
//    if (e.getId()==course.getId()){
//        e.setTitle(course.getTitle());
//        e.setDescription(course.getDescription());
//    }
//});
//return course;
        courseDao.save(course);
        return course;
    }


    @Override
    public void deleteJpaCourse(Long parseLong) {
        //   list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        CourseJpa entity = courseDao.findById(parseLong).orElseThrow(()->new RuntimeException());
        courseDao.delete(entity);
    }
    // get data with title
    @Override
    public CourseJpa getCourseByTitle(String title) {
        return this.courseDao.getCourseByTitle(title);
    }


}
