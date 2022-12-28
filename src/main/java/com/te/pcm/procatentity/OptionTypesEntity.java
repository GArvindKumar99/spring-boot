package com.te.pcm.procatentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
@Data

@Setter

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class OptionTypesEntity implements Serializable {
	@Id
	private Integer optionTypeId;
	
@Length(max=45)
	private Integer optionTypeName; 
	
	/*
	 * @OneToMany(cascade = CascadeType.MERGE) //@JoinColumn(name = "optionTypeId",
	 * referencedColumnName = "optionTypeId") private List<ProductEntity>
	 * productEntity;
	 */
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "productVariationOptionsEntities")
	//@JoinColumn(name = "optionTypeId", referencedColumnName = "optionTypeId")
	private List<OptionsEntity> optionsEntities=new ArrayList<>();

	@ManyToOne(cascade = CascadeType.ALL)
	private CategoriesEntity categoriesEntity;

	







	
	
}


