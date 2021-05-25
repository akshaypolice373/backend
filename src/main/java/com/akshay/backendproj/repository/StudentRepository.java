package com.akshay.backendproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akshay.backendproj.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
