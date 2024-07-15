package com.syaiful.school_management.subject.usecase;

import com.syaiful.school_management.subject.adapter.repository.SubjectRepository;
import com.syaiful.school_management.subject.entity.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubjectService {
	private final SubjectRepository subjectRepository;

	public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
	public Optional<Subject> getSubjectById(Long id) {
        return subjectRepository.findById(id);
    }

	public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

	public Subject updateSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

	public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }
}
