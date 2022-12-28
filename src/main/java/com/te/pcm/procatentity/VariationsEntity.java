package com.te.pcm.procatentity;

//import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

//import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Component
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VariationsEntity {
	@Id
	private int variationId;
	@Column(length = 45)

	private String VariationName;
	
	/*
	 * private List<VariationsEntity> list;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "variationId",referencedColumnName = "variationId")
	 * private List<ProductVariationEntity> productVariationEntities;
	 */
}
