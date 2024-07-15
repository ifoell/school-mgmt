package com.syaiful.school_management.student.adapter.repository;

import com.syaiful.school_management.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
	List<Student> findAll();
	Optional<Student> findById(Long id);
	Student save(Student student);
	Student update(Student student);
	void deleteById(Long id);
}
