package com.te.pcm.procatentity;

import java.util.List;

//import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.ty.productmanagementsystem.entity.VariationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Component
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(unique = true, nullable = false)
	private int productId;
	@Column(length = 100)
	private String productTitle;
	
	
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "productId",referencedColumnName = "productId")
	private List<ProductVariationEntity> productVariationEntities;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private CategoriesEntity categoriesEntity;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private DepartmentsEntity departments;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private OptionTypesEntity optionTypesEntity;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private VariationTypesEntity variationType;



}
