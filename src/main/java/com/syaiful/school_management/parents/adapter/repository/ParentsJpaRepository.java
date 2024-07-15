package com.syaiful.school_management.parents.adapter.repository;

import com.syaiful.school_management.parents.entity.Parent;
import com.syaiful.school_management.parents.persistence.JpaParentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ParentsJpaRepository implements ParentsRepository {
	private final JpaParentsRepository jpaParentsRepository;


	@Override
	public List<Parent> findAll() {
		return jpaParentsRepository.findAll();
	}

	@Override
	public Optional<Parent> findById(Long id) {
		return jpaParentsRepository.findById(id);
	}

	@Override
	public Parent save(Parent parent) {
		return jpaParentsRepository.save(parent);
	}

	@Override
	public Parent update(Parent parent) {
		return jpaParentsRepository.save(parent);
	}

	@Override
	public void deleteById(Long id) {
		jpaParentsRepository.deleteById(id);
	}
}
