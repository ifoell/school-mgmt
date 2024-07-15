package com.syaiful.school_management.subject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.syaiful.school_management.helper.entity.AbstractEntity;
import com.syaiful.school_management.teacher.entity.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "subject", schema = "school_management")
public class Subject extends AbstractEntity {

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "class_id", nullable = false)
	private Short classId;

	@Column(name = "schedule_day", length = 10)
	private String scheduleDay;

	@ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
	@JsonBackReference
	private Set<Teacher> teachers;
}