package com.te.pcm.procatdto;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentsDto {

	private int departmentId;
	private String departmentTitle;
	private String departmentName;
	

}
