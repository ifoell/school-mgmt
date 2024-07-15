package com.syaiful.school_management.school.adapter.repository;

import com.syaiful.school_management.school.entity.School;

import java.util.Optional;

public interface SchoolRepository {
	Optional<School> findById(Long id);
	School save(School school);
	School update(School school);
}
