package com.te.pcm.procatentity;

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
import lombok.NonNull;
@Component
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VariationTypesEntity {
	@Id
	private int variationTypeId;
	@Column(length = 45)
	private String variationTypeTitle;
	
	private String   variationTypeName;
	
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "variationTypeId", referencedColumnName = "variationTypeId")
	private List<ProductEntity> productEntity;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "variationTypeId", referencedColumnName = "variationTypeId")
	private List<VariationsEntity> variationsEntities;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CategoriesEntity categoriesEntity;







}
