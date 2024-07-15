package com.syaiful.school_management.teacher.usecase;

import com.syaiful.school_management.subject.adapter.repository.SubjectRepository;
import com.syaiful.school_management.subject.entity.Subject;
import com.syaiful.school_management.teacher.adapter.dto.TeacherDto;
import com.syaiful.school_management.teacher.adapter.repository.TeacherRepository;
import com.syaiful.school_management.teacher.entity.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TeacherService{
	private final TeacherRepository teacherRepository;
	private final SubjectRepository subjectRepository;

	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}

	public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

	public Teacher saveTeacher(TeacherDto teacherDto) {
		Teacher teacher = new Teacher();
		teacher.setName(teacherDto.getName());
		teacher.setGender(teacherDto.getGender());
		teacher.setUniqueNumber(teacherDto.getUniqueNumber());
		teacher.setEntryYear(teacherDto.getEntryYear());

		Set<Subject> subjects = new HashSet<>();
		for (Long subjectId : teacherDto.getSubjects()) {
			Subject subject = subjectRepository.findById(subjectId).orElseThrow(()
					-> new RuntimeException("Subject not found"));
			subjects.add(subject);
		}
		teacher.setSubjects(subjects);

		return teacherRepository.save(teacher);
    }

	public Teacher updateTeacher(Long id, TeacherDto teacherDto) {
		Teacher teacher = teacherRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Teacher not found: " + id));
		teacher.setName(teacherDto.getName());
		teacher.setGender(teacherDto.getGender());
		teacher.setUniqueNumber(teacherDto.getUniqueNumber());
		teacher.setEntryYear(teacherDto.getEntryYear());

		Set<Subject> subjects = new HashSet<>();
		for (Long subjectId : teacherDto.getSubjects()) {
			Subject subject = subjectRepository.findById(subjectId).orElseThrow(() -> new RuntimeException("Subject not found"));
			subjects.add(subject);
		}
		teacher.setSubjects(subjects);
        return teacherRepository.update(teacher);
    }

	public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
