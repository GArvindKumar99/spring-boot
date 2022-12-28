package com.te.pcm.procatentity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CategoriesEntity implements Serializable {
	@Id
	private int categoryId;

	
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categoriesEntity")
	//@JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
	private List<ProductEntity> productEntity;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categoriesEntity")
//	@JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
	private List<VariationTypesEntity> variationTypesEntities;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categoriesEntity")
//	@JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
	private List<OptionTypesEntity> optionTypesEntities;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private DepartmentsEntity departmentsEntity;
}
