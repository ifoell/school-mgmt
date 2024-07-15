package com.syaiful.school_management.schoolclass.persistence;

import com.syaiful.school_management.schoolclass.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaClassRepository extends JpaRepository<Class, Long>, JpaSpecificationExecutor<Class> {
}