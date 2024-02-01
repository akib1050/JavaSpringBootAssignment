package com.akibSpring.bs23.services;

import com.akibSpring.bs23.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceIMPL implements CourseService{
    List<Course>list;

    public CourseServiceIMPL()
    {
        list =  new ArrayList<>();
        list.add(new Course(143,"Hellow ","Java"));
        list.add(new Course(122,"This is ","Java"));

    }
    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourse(Long courseId) {
        Course c= null;
        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e->{
            if(e.getId()== course.getId())
            {
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }


}
