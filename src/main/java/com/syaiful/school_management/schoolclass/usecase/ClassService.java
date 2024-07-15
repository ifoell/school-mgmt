package com.syaiful.school_management.schoolclass.usecase;

import com.syaiful.school_management.schoolclass.adapter.dto.ClassDto;
import com.syaiful.school_management.schoolclass.adapter.repository.ClassRepository;
import com.syaiful.school_management.schoolclass.entity.Class;
import com.syaiful.school_management.teacher.adapter.repository.TeacherRepository;
import com.syaiful.school_management.teacher.entity.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClassService {
	private final ClassRepository classRepository;
	private final TeacherRepository teacherRepository;

	public List<Class> getAllClass() {
		return classRepository.findAll();
	}

	public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }

	public Class saveClass(ClassDto classDto) {
		Class schoolClass = new Class();
		schoolClass.setName(classDto.getName());
		Teacher teacher = teacherRepository.findById(classDto.getHomeroomTId()).orElseThrow(()
				-> new RuntimeException("Teacher not found"));
		schoolClass.setHomeroomT(teacher);
        return classRepository.save(schoolClass);
    }

	public Class updateClass(Long id, ClassDto classDto) {
		Class schoolClass = classRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Class not found"));
		schoolClass.setName(classDto.getName());
		Teacher teacher = teacherRepository.findById(classDto.getHomeroomTId()).orElseThrow(()
				-> new RuntimeException("Teacher not found"));
		schoolClass.setHomeroomT(teacher);
        return classRepository.update(schoolClass);
    }

	public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
