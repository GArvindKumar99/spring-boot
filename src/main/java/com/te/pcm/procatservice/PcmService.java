package com.te.pcm.procatservice;


import java.util.List;

import com.te.pcm.procatdto.CategoriesDto;
import com.te.pcm.procatdto.DepartmentsDto;
import com.te.pcm.procatdto.OptionTypes;
import com.te.pcm.procatdto.ProductVariationsDto;
import com.te.pcm.procatdto.ProductsDto;
import com.te.pcm.procatdto.VariationTypesDto;
import com.te.pcm.procatentity.CategoriesEntity;
import com.te.pcm.procatentity.DepartmentsEntity;
import com.te.pcm.procatentity.OptionTypesEntity;
import com.te.pcm.procatentity.ProductEntity;
import com.te.pcm.procatentity.User;
import com.te.pcm.procatentity.VariationTypesEntity;

public interface PcmService {
	DepartmentsEntity registerDepartment(DepartmentsDto departmentsDto);

	List<DepartmentsEntity> getDepartment(DepartmentsDto departmentsDto);



	CategoriesDto updateCategories(CategoriesDto categoriesDto);

	VariationTypesEntity updateVariationType(VariationTypesDto variationTypeDto);

	OptionTypesEntity registoroptionType(OptionTypes optionTypeDto);

	ProductEntity updateProduct(ProductsDto productDto);

	boolean deletedepartment(DepartmentsDto departmentDto);

	boolean deleteCategories(CategoriesDto categoriesDto);

	boolean deleteVariationType(VariationTypesDto variationTypeDto);

	boolean deleteoptionType(OptionTypes optionTypeDto);

	boolean deleteProduct(ProductsDto productDto);

	DepartmentsEntity updateDeparment(DepartmentsDto departmentDto);

	public 	boolean registerCategories(CategoriesDto categoriesDto);

	public boolean registerVariationType(VariationTypesDto variationTypeDto);

	public 	boolean registeroptionType(OptionTypes optionTypeDto);

	public boolean registerProduct(ProductsDto productDto);

	public boolean registerProductvariation(ProductVariationsDto productVariationDto);

	public 	List<CategoriesEntity> getcategory(CategoriesDto categoriesDto);

	public 	List<VariationTypesEntity> getVariationType(VariationTypesDto variationTypesDto);

	public  List<OptionTypesEntity> getOptionType(OptionTypes optionTypeDto);


public 	List<ProductEntity> getProduct(ProductsDto productDto);








}
