package com.syaiful.school_management.school.entity;

import com.syaiful.school_management.helper.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "school", schema = "school_management")
public class School extends AbstractEntity {

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "address", nullable = false, length = 100)
	private String address;

	@Column(name = "nss", length = 20)
	private String nss;

	@Column(name = "npsn", length = 20)
	private String npsn;

	@Column(name = "phone", length = 20)
	private String phone;

	@Column(name = "email", length = 30)
	private String email;

	@Column(name = "website", length = 30)
	private String website;

	@Column(name = "accredited", length = 5)
	private String accredited;

	@Column(name = "accr_year")
	private Integer accrYear;

}