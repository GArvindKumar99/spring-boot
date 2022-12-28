package com.te.pcm.procatentity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariationEntity {
	@Id
	private int productVariation;
	
//	@OneToMany(mappedBy = "productVariationEntity")
//	@JoinColumn(name = "productVariation",referencedColumnName = "productVariation")
	
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "productVariationId",referencedColumnName = "productVariation")
	private List<ProductVariationOptionsEntity> productVariationOptionsEntities;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductEntity product;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private VariationsEntity variation;
	
	
}
