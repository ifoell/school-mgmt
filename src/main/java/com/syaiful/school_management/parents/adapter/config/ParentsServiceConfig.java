package com.syaiful.school_management.parents.adapter.config;

import com.syaiful.school_management.parents.adapter.repository.ParentsJpaRepository;
import com.syaiful.school_management.parents.usecase.ParentsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParentsServiceConfig {
	@Bean
	public ParentsService parentsService(ParentsJpaRepository parentsJpaRepository) {
        return new ParentsService(parentsJpaRepository);
    }
}
