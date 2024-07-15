package com.syaiful.school_management.schoolclass.adapter.repository;

import com.syaiful.school_management.schoolclass.entity.Class;
import com.syaiful.school_management.schoolclass.persistence.JpaClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClassJpaRepository implements ClassRepository {
	private final JpaClassRepository jpaClassRepository;


	@Override
	public List<Class> findAll() {
		return jpaClassRepository.findAll();
	}

	@Override
	public Optional<Class> findById(Long id) {
		return jpaClassRepository.findById(id);
	}

	@Override
	public Class save(Class schoolClass) {
		return jpaClassRepository.save(schoolClass);
	}

	@Override
	public Class update(Class schoolClass) {
		return jpaClassRepository.save(schoolClass);
	}

	@Override
	public void deleteById(Long id) {
		jpaClassRepository.deleteById(id);
	}
}
