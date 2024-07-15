package com.syaiful.school_management.parents.adapter.controller;

import com.syaiful.school_management.parents.entity.Parent;
import com.syaiful.school_management.parents.usecase.ParentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/parents")
public class ParentsController {
	private final ParentsService parentsService;

	@GetMapping
	public List<Parent> getAllTeachers(){
		return parentsService.getAllParents();
	}

	@GetMapping("{id}")
	public Optional<Parent> getTeacherById(@PathVariable Long id){
		return parentsService.getParentsById(id);
	}

	@PostMapping
	public Parent createTeacher(@RequestBody Parent parent){
		return parentsService.saveParents(parent);
	}

	@PutMapping("/{id}")
    public Parent updateParents(@PathVariable Long id, @RequestBody Parent parent){
        parent.setId(id);
		return parentsService.updateParents(parent);
    }

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTeacher(@PathVariable Long id){
		try {
			parentsService.deleteParents(id);
			return ResponseEntity.ok("Parent with id: "+ id +" deleted successfully");
		} catch (Exception e){
			System.out.println("Error occurred while deleting parent: " + e.getMessage());
			return ResponseEntity.badRequest().body("Error occurred while deleting parent with id " + id);
		}

	}
}
