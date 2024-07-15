package com.syaiful.school_management.parents.entity;

import com.syaiful.school_management.helper.entity.AbstractEntity;
import com.syaiful.school_management.helper.entity.GenderEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "parents", schema = "school_management")
public class Parent extends AbstractEntity {

	@Column(name = "name", length = 100)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private GenderEntity gender;

	@Column(name = "address", length = 100)
	private String address;

	@Column(name = "occupation", length = 100)
	private String occupation;

	@Column(name = "status", length = 10)
	private String status;

	@Enumerated(EnumType.STRING)
	@ColumnDefault("Y")
	@Column(name = "is_alive")
	private Alive isAlive;
}