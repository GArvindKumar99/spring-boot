package com.te.pcm.procatdto;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductsDto {
	private int productId;
	private String productTitle;
	private int departmentId;
	private int categoryId;
	private int variationTypeId;
	private int optionTypeId;

}
