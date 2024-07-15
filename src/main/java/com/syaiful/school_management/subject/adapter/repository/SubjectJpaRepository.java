package com.syaiful.school_management.subject.adapter.repository;

import com.syaiful.school_management.subject.entity.Subject;
import com.syaiful.school_management.subject.infrastructure.persistence.JpaSubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SubjectJpaRepository implements SubjectRepository{
	private final JpaSubjectRepository jpaSubjectRepository;

	@Override
	public List<Subject> findAll() {
		return jpaSubjectRepository.findAll();
	}

	@Override
	public Optional<Subject> findById(Long id) {
		return jpaSubjectRepository.findById(id);
	}

	@Override
	public Subject save(Subject subject) {
		return jpaSubjectRepository.save(subject);
	}

	@Override
	public Subject update(Subject subject) {
		return jpaSubjectRepository.save(subject);
	}

	@Override
	public void deleteById(Long id) {
		jpaSubjectRepository.deleteById(id);
	}
}
