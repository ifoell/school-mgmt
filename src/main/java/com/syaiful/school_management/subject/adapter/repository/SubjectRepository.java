package com.syaiful.school_management.subject.adapter.repository;

import com.syaiful.school_management.subject.entity.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository {
	List<Subject> findAll();
	Optional<Subject> findById(Long id);
	Subject save(Subject subject);
	Subject update(Subject subject);
	void deleteById(Long id);
}
