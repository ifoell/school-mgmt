package com.syaiful.school_management.school.infrastructure.persistence;

import com.syaiful.school_management.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSchoolRepository extends JpaRepository<School, Long>, JpaSpecificationExecutor<School> {
}