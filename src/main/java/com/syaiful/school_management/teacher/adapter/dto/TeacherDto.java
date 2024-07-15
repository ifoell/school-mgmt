package com.syaiful.school_management.teacher.adapter.dto;

import com.syaiful.school_management.helper.entity.GenderEntity;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.syaiful.school_management.teacher.entity.Teacher}
 */
@Value
@Data
public class TeacherDto implements Serializable {
	String name;
	Set<Long> subjects;
	GenderEntity gender;
	String uniqueNumber;
	Integer entryYear;
}