package com.syaiful.school_management.schoolclass.adapter.repository;

import com.syaiful.school_management.schoolclass.entity.Class;

import java.util.List;
import java.util.Optional;

public interface ClassRepository {
	List<Class> findAll();
	Optional<Class> findById(Long id);
	Class save(Class schoolClass);
	Class update(Class schoolClass);
	void deleteById(Long id);
}
