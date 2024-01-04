package com.student.main.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.main.entity.Student;
import com.student.main.repository.StudentRepository;
import com.student.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {	
	 List<Student> list = studentRepository.findAll();
	 System.out.println("List is :"+list);
	 return list;
	}

	@Override
	public void addStudentDetails(Student student) {
		studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Long studentId, Student updatedStudent) {
		  // Find the existing student
        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // Update the fields
        existingStudent.setFirstName(updatedStudent.getFirstName());
        existingStudent.setLastName(updatedStudent.getLastName());
        existingStudent.setUsername(updatedStudent.getUsername());
        existingStudent.setPassword(updatedStudent.getPassword());

        // Save and return the updated student
        return studentRepository.save(existingStudent);
	}

	@Override
	public void deleteStudent(Long studentId) {
	    // Check if the student exists
        if (!studentRepository.existsById(studentId)) {
            throw new RuntimeException("Student not found");
        }

        // Delete the student by ID
        studentRepository.deleteById(studentId);
	}

}
