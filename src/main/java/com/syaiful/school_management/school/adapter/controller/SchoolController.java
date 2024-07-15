package com.syaiful.school_management.school.adapter.controller;

import com.syaiful.school_management.school.entity.School;
import com.syaiful.school_management.school.usecase.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school")
public class SchoolController {
	private final SchoolService schoolService;

	@GetMapping("{id}")
	public Optional<School> getSchoolById(@PathVariable Long id) {
		return schoolService.getSchool(id);
	}

	@PostMapping
	public School createSchool(@RequestBody School school){
		return schoolService.saveSchool(school);
	}

	@PutMapping("{id}")
    public School updateSchool(@PathVariable Long id, @RequestBody School updatedSchool) {
        updatedSchool.setId(id);
        return schoolService.saveSchool(updatedSchool);
    }
}
