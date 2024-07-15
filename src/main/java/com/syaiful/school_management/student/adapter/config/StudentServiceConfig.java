package com.syaiful.school_management.student.adapter.config;

import com.syaiful.school_management.student.adapter.repository.StudentJpaRepository;
import com.syaiful.school_management.student.usecase.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentServiceConfig {
	@Bean
	public StudentService studentService(StudentJpaRepository studentJpaRepository) {
        return new StudentService(studentJpaRepository);
    }
}
