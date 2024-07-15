package com.syaiful.school_management.parents.adapter.repository;

import com.syaiful.school_management.parents.entity.Parent;

import java.util.List;
import java.util.Optional;

public interface ParentsRepository {
	List<Parent> findAll();
	Optional<Parent> findById(Long id);
	Parent save(Parent parents);
	Parent update(Parent parents);
	void deleteById(Long id);
}
