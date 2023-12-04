package com.takeo.takeocourse.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans. factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.takeocourse.model.Course;
import com.takeo.takeocourse.service.CourseService;




@RestController
public class CourseController {
	
	 private static final Logger LOGGER = LogManager.getLogger(CourseController.class);
	
	@Autowired
    CourseService courseService;
	
	@GetMapping(value = "/course/{id}")
	public Course  getCourseDetail(@PathVariable("id") int courseId) {
		
		return courseService.getCourseDetails(courseId);
		
	}
	
	@GetMapping(value = "/course")
	public Course  getStudentDetails() {
		
		return null;
		
	}
	
	
	@PostMapping(value = "/course")
	public Course  saveCourse(@RequestBody Course student) {
		
		LOGGER.info("Hi this is sample course api");
		return null;
		
	}
	
	
	@PutMapping(value = "/course/{id}")
	public Course  updateStudentDetails(@PathVariable("id") int courseId) {
		
		LOGGER.info("Hi this is sample course api"+ courseId);
		return null;
		
	}
	
	@DeleteMapping(value = "/course/{id}")
	public Course  DeleteCourseDetails(@PathVariable("id") int courseId) {
		
		LOGGER.info("Hi this is sample course api"+ courseId);
		return null;
		
	}

}


