package com.syaiful.school_management.teacher.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.syaiful.school_management.helper.entity.AbstractEntity;
import com.syaiful.school_management.helper.entity.GenderEntity;
import com.syaiful.school_management.schoolclass.entity.Class;
import com.syaiful.school_management.subject.entity.Subject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "teacher", schema = "school_management")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Teacher extends AbstractEntity {

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "teacher_subject",
			joinColumns = @JoinColumn(name = "teacher_id"),
			inverseJoinColumns = @JoinColumn(name = "subject_id")
	)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Subject> subjects;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private GenderEntity gender;

	@Column(name = "unique_number", length = 100)
	private String uniqueNumber;

	@Column(name = "entry_year")
	private Integer entryYear;

	@OneToOne(mappedBy = "homeroomT", fetch = FetchType.EAGER)
	@JsonBackReference
	private Class schoolClass;
}