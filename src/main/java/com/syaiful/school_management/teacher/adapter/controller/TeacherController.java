package com.syaiful.school_management.teacher.adapter.controller;

import com.syaiful.school_management.teacher.adapter.dto.TeacherDto;
import com.syaiful.school_management.teacher.entity.Teacher;
import com.syaiful.school_management.teacher.usecase.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teacher")
public class TeacherController {
	private final TeacherService teacherService;

	@GetMapping
	public List<Teacher> getAllTeachers(){
		return teacherService.getAllTeachers();
	}

	@GetMapping("{id}")
	public Optional<Teacher> getTeacherById(@PathVariable Long id){
		return teacherService.getTeacherById(id);
	}

	@PostMapping
	public Teacher createTeacher(@RequestBody TeacherDto teacherDto){
		return teacherService.saveTeacher(teacherDto);
	}

	@PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Long id, @RequestBody TeacherDto teacherDto){
		return teacherService.updateTeacher(id, teacherDto);
    }

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTeacher(@PathVariable Long id){
		try {
			teacherService.deleteTeacher(id);
			return ResponseEntity.ok("Teacher with id: "+ id +" deleted successfully");
		} catch (Exception e){
			System.out.println("Error occurred while deleting teacher: " + e.getMessage());
			return ResponseEntity.badRequest().body("Error occurred while deleting teacher with id " + id);
		}

	}
}
