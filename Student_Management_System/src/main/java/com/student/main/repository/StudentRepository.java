package com.student.main.repository;

import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.student.main.entity.Student;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.core.support.DefaultCrudMethods;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
