package com.syaiful.school_management.student.adapter.repository;

import com.syaiful.school_management.student.entity.Student;
import com.syaiful.school_management.student.persistence.JpaStudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class StudentJpaRepository implements StudentRepository {
	private final JpaStudentRepository jpaStudentRepository;


	@Override
	public List<Student> findAll() {
		return jpaStudentRepository.findAll();
	}

	@Override
	public Optional<Student> findById(Long id) {
		return jpaStudentRepository.findById(id);
	}

	@Override
	public Student save(Student student) {
		return jpaStudentRepository.save(student);
	}

	@Override
	public Student update(Student student) {
		return jpaStudentRepository.save(student);
	}

	@Override
	public void deleteById(Long id) {
		jpaStudentRepository.deleteById(id);
	}
}
