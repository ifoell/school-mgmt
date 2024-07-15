package com.syaiful.school_management.teacher.adapter.config;

import com.syaiful.school_management.subject.adapter.repository.SubjectJpaRepository;
import com.syaiful.school_management.teacher.adapter.repository.TeacherJpaRepository;
import com.syaiful.school_management.teacher.usecase.TeacherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherServiceConfig {
	@Bean
	public TeacherService teacherService(TeacherJpaRepository teacherJpaRepository, SubjectJpaRepository subjectJpaRepository) {
        return new TeacherService(teacherJpaRepository, subjectJpaRepository);
    }
}
