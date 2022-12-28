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
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OptionsEntity {
	@Id
	private int optionId;
	@Column(length = 45)
	private String optionTitle;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "optionId",referencedColumnName = "optionId")
	private List<ProductVariationOptionsEntity> productVariationOptionsEntities;
	
}
