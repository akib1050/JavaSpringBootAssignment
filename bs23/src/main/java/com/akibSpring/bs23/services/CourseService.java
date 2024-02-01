package com.akibSpring.bs23.services;

import com.akibSpring.bs23.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course>getCourse();

    public Course getCourse(Long courseId);
    public Course addCourse(Course course);


}
