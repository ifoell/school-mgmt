package com.syaiful.school_management.teacher.adapter.repository;

import com.syaiful.school_management.teacher.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository {
	List<Teacher> findAll();
	Optional<Teacher> findById(Long id);
	Teacher save(Teacher teacher);
	Teacher update(Teacher teacher);
	void deleteById(Long id);
}
