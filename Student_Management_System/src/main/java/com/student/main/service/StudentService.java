package com.student.main.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.student.main.entity.Student;

@Component
public interface StudentService {
	
	List<Student> getAllStudent();
	
	void addStudentDetails(Student student);

	Student updateStudent(Long id, Student updatedStudent);

	void deleteStudent(Long id);

}
