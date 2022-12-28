package com.te.pcm.procatserviceimpl;

import java.util.List;

//import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.te.pcm.procatentity.ProductVariationEntity;
import com.te.pcm.procatentity.VariationTypesEntity;
import com.te.pcm.procatentity.VariationsEntity;
import com.te.pcm.procatexception.NoRecordInvalidIdException;
import com.te.pcm.procatrepository.CategoriesRepository;
import com.te.pcm.procatrepository.DepartmentsRepository;
import com.te.pcm.procatrepository.OptionTypesRepository;
import com.te.pcm.procatrepository.ProductVariationRepository;
import com.te.pcm.procatrepository.ProductsRepository;
import com.te.pcm.procatrepository.VariationTypesRepository;
import com.te.pcm.procatrepository.VariationsRepository;
import com.te.pcm.procatservice.PcmService;



@Service
public class PcmServiceImp implements PcmService {
	
	@Autowired
	private DepartmentsRepository  departmentsRepository;
	@Autowired
	private CategoriesRepository categoriesRepository;
	@Autowired
	private VariationTypesRepository variationTypesRepository;
	@Autowired
	private VariationsRepository variationsRepository;
	@Autowired
	private OptionTypesRepository  optionTypesRepository;
	@Autowired
	private ProductsRepository  productRepository;
	@Autowired
	private ProductVariationRepository productVariationRepository;
	
	
	
	@Autowired
	private CategoriesEntity  categoriesEntity;
	@Autowired
	private DepartmentsEntity  departmentsEntity;
	@Autowired
	private VariationTypesEntity  variationTypesEntity;
	@Autowired
	private VariationsEntity  variationsEntity;
	@Autowired
	private OptionTypesEntity  optionTypesEntity;
	@Autowired
	private ProductEntity  productEntity;
	@Autowired
	private ProductVariationEntity   productVariationEntity;
	
	
	
	

	@Override
	public DepartmentsEntity registerDepartment(DepartmentsDto departmentsDto) {

		BeanUtils.copyProperties(departmentsDto, departmentsEntity);
		return departmentsRepository.save(departmentsEntity);
	}

	@Override
	public List<DepartmentsEntity> getDepartment(DepartmentsDto departmentsDto) {

		BeanUtils.copyProperties(departmentsDto, departmentsEntity);
		return departmentsRepository.findAll();
	}
	
	@Override
	public DepartmentsEntity updateDeparment(DepartmentsDto departmentDto) {
		BeanUtils.copyProperties(departmentDto, departmentsEntity);
		DepartmentsEntity saveDepartments = departmentsRepository.findById(departmentsEntity.getDepartmentId()).orElse(null);
		if (saveDepartments != null) {
			saveDepartments.setDepartmentName(departmentDto.getDepartmentName());
			departmentsRepository.save(saveDepartments);
		
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	
	@Override
	public boolean deletedepartment(DepartmentsDto departmentDto) {
		DepartmentsEntity departments = departmentsRepository.findById(departmentDto.getDepartmentId()).orElse(null);
		if (departments != null) {
			this.departmentsRepository.delete(departments);
			return true;
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	

	@Override
	public CategoriesDto updateCategories(CategoriesDto categoriesDto) {
		BeanUtils.copyProperties(categoriesDto, categoriesEntity);
		CategoriesEntity categoriesReserve = categoriesRepository.findById(categoriesEntity.getCategoryId()).orElse(null);
		if (categoriesReserve != null) {
			categoriesReserve.setCategoryName(categoriesEntity.getCategoryName());
			categoriesRepository.save(		categoriesReserve);
			
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	
	@Override
	public boolean deleteCategories(CategoriesDto categoriesDto) {
		CategoriesEntity categories = categoriesRepository.findById(categoriesDto.getCategoryId()).orElse(null);
		if (categories != null) {
			this.categoriesRepository.delete(categories);
			return true;
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	

	@Override
	public VariationTypesEntity updateVariationType(VariationTypesDto variationTypeDto) {
		BeanUtils.copyProperties(variationTypeDto, variationTypesEntity);
		VariationTypesEntity variationTypes = variationTypesRepository.findById(variationTypesEntity.getVariationTypeId())
				.orElse(null);
		if (variationTypes != null) {
			variationTypes.setVariationTypeName(variationTypesEntity.getVariationTypeName());
			List<VariationsEntity> variations = variationTypeDto.getList();
		BeanUtils.copyProperties(variations, variationsEntity);
			variationTypesEntity.setVariationsEntities(variations);
			variationsRepository.save(variationsEntity);
			variationTypesRepository.save(variationTypes);
			return variationTypes;
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	
	
	@Override
	public boolean deleteVariationType(VariationTypesDto variationTypeDto) {
		VariationTypesEntity variationType = variationTypesRepository.findById(variationTypeDto.getVariationTypeId())
				.orElse(null);
		if (variationType != null) {
			this.variationTypesRepository.delete(variationType);
			return true;
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	

	

	
	
	

	@Override
	public OptionTypesEntity registoroptionType(OptionTypes optionTypeDto) {
		BeanUtils.copyProperties(optionTypeDto, optionTypesEntity);
		OptionTypesEntity optionstype = optionTypesRepository.findById(optionTypesEntity.getOptionTypeId()).orElse(null);
		if (optionstype != null) {
			optionstype.setOptionTypeName( optionTypesEntity.getOptionTypeId());
			optionTypesRepository.save(optionstype);
			return optionstype;
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}
	
	@Override
	public boolean deleteoptionType(OptionTypes optionTypeDto) {
		OptionTypesEntity optionTypes = optionTypesRepository.findById(optionTypeDto.getOptionTypeId()).orElse(null);
		if (optionTypes != null) {
			this.optionTypesRepository.delete(optionTypes);
			return true;

		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}

	
	
	
	 
	@Override
	public ProductEntity updateProduct(ProductsDto productDto) {
		BeanUtils.copyProperties(productDto, productEntity);
		ProductEntity reserveProduct = productRepository.findById(productEntity.getProductId()).orElse(null);
		if (reserveProduct != null) {
			reserveProduct.setProductTitle(productEntity.getProductTitle());
			productRepository.save(reserveProduct);
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}








	@Override
	public boolean deleteProduct(ProductsDto productDto) {
		ProductEntity product = productRepository.findById(productDto.getProductId()).orElse(null);
		if (product != null) {
			this.productRepository.delete(product);
			return true;
		}
		throw new NoRecordInvalidIdException("Please enter proper Id");
	}

	@Override
	public boolean registerCategories(CategoriesDto categoriesDto) {
		departmentsEntity = departmentsRepository.findById(categoriesDto.getDepartmentId()).orElse(null);
		if (departmentsEntity != null) {
			
			BeanUtils.copyProperties(categoriesDto, categoriesEntity);
			categoriesEntity.setDepartmentsEntity(departmentsEntity);
			categoriesRepository.save(categoriesEntity);
			return true;
		}
		throw new NoRecordInvalidIdException("enter proper Id");
	}

	@Override
	public boolean registerVariationType(VariationTypesDto variationTypeDto) {

		categoriesEntity = categoriesRepository.findById(variationTypeDto.getCategoryId()).orElse(null);
		variationTypesEntity.setCategoriesEntity(categoriesEntity);
		if (categoriesEntity != null) {
			BeanUtils.copyProperties(variationTypeDto, variationTypesEntity);
			List<VariationsEntity> variations = variationTypeDto.getList();

			BeanUtils.copyProperties(variations, variationsEntity);
			variationTypesEntity.setVariationsEntities(variations);
			variationsRepository.save(variationsEntity);
			variationTypesRepository.save(variationTypesEntity);
			return true;
		}
		throw new NoRecordInvalidIdException("enter proper Id");
	}

	@Override
	public boolean registeroptionType(OptionTypes optionTypeDto) {
		CategoriesEntity orElse = categoriesRepository.findById(optionTypeDto.getOptionTypeId()).orElse(null);
		optionTypesEntity.setCategoriesEntity(categoriesEntity);
		if (orElse != null) {
			BeanUtils.copyProperties(optionTypeDto, optionTypesEntity);
			optionTypesRepository.save(optionTypesEntity);
			return true;
		}
		throw new NoRecordInvalidIdException("enter proper Id");
	}

	@Override
	public boolean registerProduct(ProductsDto productDto) {
		categoriesEntity = categoriesRepository.findById(productDto.getCategoryId()).orElse(null);
		
		if (categoriesEntity !=null) {
			productEntity.setCategoriesEntity(categoriesEntity);
			departmentsEntity = departmentsRepository.findById(productDto.getDepartmentId()).orElse(null);
			productEntity.setDepartments(departmentsEntity);
			variationTypesEntity = variationTypesRepository.findById(productDto.getVariationTypeId()).orElse(null);
			productEntity.setDepartments(departmentsEntity);
			optionTypesEntity = optionTypesRepository.findById(productDto.getOptionTypeId()).orElse(null);
			productEntity.setOptionTypesEntity(optionTypesEntity);
			BeanUtils.copyProperties(productDto, productEntity);
			productRepository.save(productEntity);
			return true;
			
		}
		throw new NoRecordInvalidIdException("enter proper Id");
	}

	@Override
	public boolean registerProductvariation(ProductVariationsDto productVariationDto) {
		productEntity = productRepository.findById(productVariationDto.getProductId()).orElse(null);
		if (productEntity!=null) {
			productVariationEntity.setProduct(productEntity);
			variationsEntity = variationsRepository.findById(productVariationDto.getVariationId()).orElse(null);
			productVariationEntity.setVariation(variationsEntity);
			BeanUtils.copyProperties(productVariationDto, productVariationEntity);
			productVariationRepository.save(productVariationEntity);
			return false;
		}
		throw new NoRecordInvalidIdException("enter proper Id");
	}

	@Override
	public List<CategoriesEntity> getcategory(CategoriesDto categoriesDto) {

		BeanUtils.copyProperties(categoriesDto, categoriesEntity);
		return categoriesRepository.findAll();
		
	}

	@Override
	public List<VariationTypesEntity> getVariationType(VariationTypesDto variationTypesDto) {
		BeanUtils.copyProperties(variationTypesDto, variationTypesEntity);
		return variationTypesRepository.findAll();
	}

	@Override
	public List<OptionTypesEntity> getOptionType(OptionTypes optionTypeDto) {
		BeanUtils.copyProperties(optionTypeDto, optionTypesEntity);
		return optionTypesRepository.findAll();
	}

	@Override
	public List<ProductEntity> getProduct(ProductsDto productDto) {
		BeanUtils.copyProperties(productDto, productEntity);
		return productRepository.findAll();
	}


	

	
	
}
