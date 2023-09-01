package com.example.Durgesh_project.service;

import com.example.Durgesh_project.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(long parseLong);
}
