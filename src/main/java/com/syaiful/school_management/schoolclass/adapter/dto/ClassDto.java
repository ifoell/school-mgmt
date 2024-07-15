package com.syaiful.school_management.schoolclass.adapter.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.syaiful.school_management.schoolclass.entity.Class}
 */
@Value
public class ClassDto implements Serializable {
	String name;
	Long homeroomTId;
}