package com.syaiful.school_management.subject.adapter.config;

import com.syaiful.school_management.subject.adapter.repository.SubjectJpaRepository;
import com.syaiful.school_management.subject.usecase.SubjectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubjectServiceConfig {
	@Bean
	public SubjectService subjectService(SubjectJpaRepository subjectJpaRepository) {
        return new SubjectService(subjectJpaRepository);
    }
}
