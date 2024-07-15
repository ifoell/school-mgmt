package com.syaiful.school_management.schoolclass.adapter.controller;

import com.syaiful.school_management.schoolclass.adapter.dto.ClassDto;
import com.syaiful.school_management.schoolclass.entity.Class;
import com.syaiful.school_management.schoolclass.usecase.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/class")
public class ClassController {
	private final ClassService classService;

	@GetMapping
	public List<Class> getAllTeachers(){
		return classService.getAllClass();
	}

	@GetMapping("{id}")
	public Optional<Class> getTeacherById(@PathVariable Long id){
		return classService.getClassById(id);
	}

	@PostMapping
	public Class createTeacher(@RequestBody ClassDto schoolClass){
		return classService.saveClass(schoolClass);
	}

	@PutMapping("/{id}")
    public Class updateTeacher(@PathVariable Long id, @RequestBody ClassDto schoolClass){
		return classService.updateClass(id, schoolClass);
    }

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteClass(@PathVariable Long id){
		try {
			classService.deleteClass(id);
			return ResponseEntity.ok("Class with id: "+ id +" deleted successfully");
		} catch (Exception e){
			System.out.println("Error occurred while deleting class: " + e.getMessage());
			return ResponseEntity.badRequest().body("Error occurred while deleting class with id " + id);
		}

	}
}
