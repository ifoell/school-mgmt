package com.syaiful.school_management.student.adapter.controller;

import com.syaiful.school_management.student.entity.Student;
import com.syaiful.school_management.student.usecase.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
	private final StudentService studentService;

	@GetMapping
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}

	@GetMapping("{id}")
	public Optional<Student> getStudentById(@PathVariable Long id){
		return studentService.getStudentById(id);
	}

	@PostMapping
	public Student createStudent(@RequestBody Student student){
		return studentService.saveStudent(student);
	}

	@PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        student.setId(id);
		return studentService.updateStudent(student);
    }

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id){
		try {
			studentService.deleteStudent(id);
			return ResponseEntity.ok("Student with id: "+ id +" deleted successfully");
		} catch (Exception e){
			System.out.println("Error occurred while deleting student: " + e.getMessage());
			return ResponseEntity.badRequest().body("Error occurred while deleting student with id " + id);
		}

	}
}
