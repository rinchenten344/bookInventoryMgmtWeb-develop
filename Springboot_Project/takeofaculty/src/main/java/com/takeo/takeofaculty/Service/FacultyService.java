package com.takeo.takeofaculty.Service;

import java.util.HashMap;
import java.util.Map;

import com.takeo.takeofaculty.model.Faculty;



public class FacultyService {
	
	
	public Faculty getFacultyDetails(int facultyId) {
		
		Faculty faculty=new Faculty();
		faculty.setFacultyName("John");
		faculty.setFacultyId(20);
		faculty.setCourseId(101);
		
		Map<Integer, Faculty> faculty1=new HashMap<>();
		faculty1.putAll(faculty1);

			return faculty1.get(facultyId);
		}
		
		
	}
	

