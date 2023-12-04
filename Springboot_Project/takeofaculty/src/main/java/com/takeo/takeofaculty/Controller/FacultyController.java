package com.takeo.takeofaculty.Controller;

import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.takeofaculty.Service.FacultyService;
import com.takeo.takeofaculty.model.Faculty;









@RestController
public class FacultyController {
	
	 private static final Logger LOGGER = LogManager.getLogger(FacultyController.class);
	 
	 @Autowired
	  FacultyService facultyService;
		
		@GetMapping(value = "/faculty/{id}")
		public Faculty  getFacultyDetail(@PathVariable("id") int facultyId) {
			
			return facultyService.getFacultyDetails(facultyId);
			
		}
		@GetMapping(value = "/faculty")
		public Faculty  getFacultyDetails() {
			
			return null;
			
		}
		
		
		
		@PostMapping(value = "/faculty")
		public Faculty  saveStudent(@RequestBody Faculty faculty) {
			
			LOGGER.info("Hi this is sample faculty api");
			return null;
			
		}
		
		@PutMapping(value = "/faculty/{id}")
		public Faculty  updateFacultyDetails(@PathVariable("id") int facultyId) {
			
			LOGGER.info("Hi this is sample faculty api"+ facultyId);
			return null;
		}
		
		
		@DeleteMapping(value = "/faculty/{id}")
		public Faculty  DeleteFacultyDetails(@PathVariable("id") int facultyId) {
			
			LOGGER.info("Hi this is sample faculty api"+ facultyId);
			return null;
			
		}
}

















