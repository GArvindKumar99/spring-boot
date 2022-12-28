package com.te.pcm.procatentity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentsEntity {
	@Id
	private int departmentId;
	
	private String departmentTitle;
	
	private String departmentName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
	private List<ProductEntity> productEntity;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
	private List<CategoriesEntity> categoriesEntities;


}
