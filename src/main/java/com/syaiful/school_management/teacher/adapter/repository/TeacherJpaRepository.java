package com.syaiful.school_management.teacher.adapter.repository;

import com.syaiful.school_management.teacher.entity.Teacher;
import com.syaiful.school_management.teacher.infrastructure.persistence.JpaTeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TeacherJpaRepository implements TeacherRepository{
	private final JpaTeacherRepository jpaTeacherRepository;


	@Override
	public List<Teacher> findAll() {
		return jpaTeacherRepository.findAll();
	}

	@Override
	public Optional<Teacher> findById(Long id) {
		return jpaTeacherRepository.findById(id);
	}

	@Override
	public Teacher save(Teacher teacher) {
		return jpaTeacherRepository.save(teacher);
	}

	@Override
	public Teacher update(Teacher teacher) {
		return jpaTeacherRepository.save(teacher);
	}

	@Override
	public void deleteById(Long id) {
		jpaTeacherRepository.deleteById(id);
	}
}
