package com.syaiful.school_management.schoolclass.adapter.config;

import com.syaiful.school_management.schoolclass.adapter.repository.ClassJpaRepository;
import com.syaiful.school_management.schoolclass.usecase.ClassService;
import com.syaiful.school_management.teacher.adapter.repository.TeacherJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassServiceConfig {
	@Bean
	public ClassService classService(ClassJpaRepository classJpaRepository, TeacherJpaRepository teacherJpaRepository) {
        return new ClassService(classJpaRepository, teacherJpaRepository);
    }
}
