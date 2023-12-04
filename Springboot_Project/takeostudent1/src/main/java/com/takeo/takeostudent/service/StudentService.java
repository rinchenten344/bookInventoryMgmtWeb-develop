package com.takeo.takeostudent.service;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.takeo.takeostudent.model.Student;
@Service
public class StudentService {
	
	
	
	public Student getStuDetails(int studentId) {
		
	Student student=new Student();
	student.setAddress("USA");
	student.setCourseId(101);
	student.setStuId(1);
	student.setStuName("Test1");
	
	Student student1=new Student();
	student1.setAddress("India");
	student1.setCourseId(102);
	student1.setStuId(2);
	student1.setStuName("Test2");
	
	Map<Integer,Student> students=new HashMap<>();
	students.put(1, student);
	students.put(2, student1);
		return students.get(studentId);
	}

}
