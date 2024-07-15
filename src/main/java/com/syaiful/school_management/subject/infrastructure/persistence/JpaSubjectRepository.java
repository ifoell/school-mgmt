package com.syaiful.school_management.subject.infrastructure.persistence;

import com.syaiful.school_management.subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSubjectRepository extends JpaRepository<Subject, Long>, JpaSpecificationExecutor<Subject> {
}