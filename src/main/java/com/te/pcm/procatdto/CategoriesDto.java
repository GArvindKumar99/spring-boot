package com.te.pcm.procatdto;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesDto {
	private Integer categoryId;
	private String categoryName;
	private Integer departmentId;
	
}
