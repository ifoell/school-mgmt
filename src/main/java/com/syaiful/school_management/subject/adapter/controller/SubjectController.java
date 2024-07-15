package com.syaiful.school_management.subject.adapter.controller;

import com.syaiful.school_management.subject.entity.Subject;
import com.syaiful.school_management.subject.usecase.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subject")
public class SubjectController {

	private final SubjectService subjectService;

	@GetMapping
	public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

	@GetMapping("/{id}")
    public Optional<Subject> getSubjectById(@PathVariable Long id){
        return subjectService.getSubjectById(id);
    }

	@PostMapping
	public Subject createSubject(@RequestBody Subject subject){
        return subjectService.saveSubject(subject);
    }

	@PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subject){
        subject.setId(id);
        return subjectService.updateSubject(subject);
    }

	@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSubject(@PathVariable Long id){
        try {
			subjectService.deleteSubject(id);
			return ResponseEntity.ok("Subject with id: " + id + " deleted successfully");
        } catch (Exception e){
	        System.out.println("Error occurred while deleting subject: " + e.getMessage());
			return ResponseEntity.badRequest().body("Failed to delete subject with id: " + id);
        }
    }
}
