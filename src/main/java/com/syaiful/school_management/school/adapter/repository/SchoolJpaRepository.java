package com.syaiful.school_management.school.adapter.repository;

import com.syaiful.school_management.school.entity.School;
import com.syaiful.school_management.school.infrastructure.persistence.JpaSchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SchoolJpaRepository implements SchoolRepository{
	private final JpaSchoolRepository jpaSchoolRepository;

	@Override
	public Optional<School> findById(Long id) {
		return jpaSchoolRepository.findById(id);
	}

	@Override
	public School save(School school) {
		return jpaSchoolRepository.save(school);
	}

	@Override
	public School update(School school) {
		return jpaSchoolRepository.save(school);
	}
}
