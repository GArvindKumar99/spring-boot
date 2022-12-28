package com.te.pcm.procatdto;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductVariationsDto {
	private int ProductVariationId;
	private int productId;
	private int variationId;
	
}
