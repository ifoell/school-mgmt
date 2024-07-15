package com.syaiful.school_management.student.usecase;

import com.syaiful.school_management.student.adapter.repository.StudentRepository;
import com.syaiful.school_management.student.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
	private final StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

	public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

	public Student updateStudent(Student student) {
        return studentRepository.update(student);
    }

	public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
