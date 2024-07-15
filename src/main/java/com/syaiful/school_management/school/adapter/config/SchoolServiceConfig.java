package com.syaiful.school_management.school.adapter.config;

import com.syaiful.school_management.school.adapter.repository.SchoolJpaRepository;
import com.syaiful.school_management.school.usecase.SchoolService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolServiceConfig {
	@Bean
	public SchoolService schoolService(SchoolJpaRepository schoolJpaRepository) {
        return new SchoolService(schoolJpaRepository);
    }
}
