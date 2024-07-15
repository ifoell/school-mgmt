package com.syaiful.school_management.schoolclass.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.syaiful.school_management.helper.entity.AbstractEntity;
import com.syaiful.school_management.teacher.entity.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "class", schema = "school_management")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Class extends AbstractEntity {

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@OneToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.SET_NULL)
	@JoinColumn(name = "homeroom_t")
	private Teacher homeroomT;

}