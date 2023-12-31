package com.takeo.takeostudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.takeostudent.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
