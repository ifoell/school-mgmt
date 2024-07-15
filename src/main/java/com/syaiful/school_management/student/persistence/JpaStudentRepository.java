package com.syaiful.school_management.student.persistence;

import com.syaiful.school_management.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaStudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
}