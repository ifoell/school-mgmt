package com.syaiful.school_management.parents.usecase;

import com.syaiful.school_management.parents.adapter.repository.ParentsRepository;
import com.syaiful.school_management.parents.entity.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParentsService {
	private final ParentsRepository parentsRepository;

	public List<Parent> getAllParents() {
		return parentsRepository.findAll();
	}

	public Optional<Parent> getParentsById(Long id) {
        return parentsRepository.findById(id);
    }

	public Parent saveParents(Parent parent) {
        return parentsRepository.save(parent);
    }

	public Parent updateParents(Parent parent) {
        return parentsRepository.update(parent);
    }

	public void deleteParents(Long id) {
        parentsRepository.deleteById(id);
    }
}
