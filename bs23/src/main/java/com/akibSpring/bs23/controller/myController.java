package com.akibSpring.bs23.controller;

import com.akibSpring.bs23.entity.Course;
import com.akibSpring.bs23.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class myController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home()
    {
        return "myHome";
    }

    // for getting course
    @GetMapping("/courses")
    public List<Course>getCourse()
    {
        return this.courseService.getCourse();
    }


    // for single course get
    @GetMapping("courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return  this.courseService.getCourse(Long.parseLong(courseId) );
    }

    // for adding course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    //update course using PUT req
    /*public  Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }
    */

}
