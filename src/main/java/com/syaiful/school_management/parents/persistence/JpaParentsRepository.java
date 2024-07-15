package com.syaiful.school_management.parents.persistence;

import com.syaiful.school_management.parents.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaParentsRepository extends JpaRepository<Parent, Long>, JpaSpecificationExecutor<Parent> {
}