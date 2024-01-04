package com.student.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.main.entity.Student;
import com.student.main.service.StudentService;

@RestController
@RequestMapping("/Students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> getAllStudentList()
	{
		return studentService.getAllStudent();
	}
	
	@PostMapping("/register")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudentDetails(student);
	}
	
	 @PutMapping("/{id}")
     public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
	     return studentService.updateStudent(id, updatedStudent);
	 }

	 @DeleteMapping("/{id}")
	 public void deleteStudent(@PathVariable Long id) {
	      studentService.deleteStudent(id);
	 }
	
}
