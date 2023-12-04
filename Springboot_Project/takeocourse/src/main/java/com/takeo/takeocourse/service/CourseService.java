package com.takeo.takeocourse.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.takeo.takeocourse.model.Course;


@Service
public class CourseService {
	
	public Course getCourseDetails(int courseId) {
		
		Course course=new Course();
		course.setCourseId(101);
		course.setCourseName("Java");
		course.setDuration(1);
		
		
		
		Map<Integer,Course> course1=new HashMap<>();
		course1.putAll(course1);
			return course1.get(courseId);
		}
	
	

}
