package com.te.pcm.procatentity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariationOptionsEntity {
	@Id
	private int productvariationOptionId;

//	@ManyToOne(cascade = CascadeType.ALL)
//	private OptionsEntity optionsEntity;
//	
//	@ManyToOne(cascade = CascadeType.MERGE)
//	private ProductVariationEntity productVariationEntity;

}
