package com.syaiful.school_management.school.usecase;

import com.syaiful.school_management.school.adapter.repository.SchoolRepository;
import com.syaiful.school_management.school.entity.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SchoolService {
	private final SchoolRepository schoolRepository;

	public Optional<School> getSchool(Long id) {
		return schoolRepository.findById(id);
	}

	public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

	public School updateSchool(School school) {
		return schoolRepository.save(school);
    }
}
