package com.te.pcm.procatcontroller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.pcm.procatdto.AppResponse;
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
import com.te.pcm.procatentity.VariationTypesEntity;
import com.te.pcm.procatexception.NoRecordFoundException;
import com.te.pcm.procatservice.PcmService;


@RestController
@RequestMapping("/pcm")
public class PcmController {
	@Autowired
	private AppResponse response;
	@Autowired
	private PcmService service;
	
	@PostMapping("/registerdepartment")
	public ResponseEntity<AppResponse> registerDepartment(@RequestBody DepartmentsDto departmentsDto) {
		if(service.registerDepartment(departmentsDto)!=null) {
			response.setMessage("Data is registered");
			response.setStatus("200");
			response.setData(departmentsDto);
			
	
		}
		return new ResponseEntity<AppResponse>(response,HttpStatus.OK);
	}
	
	
	@GetMapping("/getdepartment")
	public ResponseEntity<AppResponse>getDepartment(@RequestBody  DepartmentsDto departmentsDto){
		List<DepartmentsEntity> list = service.getDepartment(departmentsDto);
		if(list!=null) {
			response.setMessage("BatchList retrieved ");
			response.setStatus("Successfully");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		throw new NoRecordFoundException();
		
	}
	
	
	@PutMapping("/updateDeparment")
	public ResponseEntity<AppResponse> updateDeparment(@RequestBody DepartmentsDto departmentDto) {
		DepartmentsEntity departmentsEntity = service.updateDeparment(departmentDto);
		if (departmentsEntity != null) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.OK);
		}
		return null;

	}
	
	@GetMapping("/getcategory")
	public ResponseEntity<AppResponse>getcategory(@RequestBody  CategoriesDto categoriesDto){
		List<CategoriesEntity> list = service.getcategory(categoriesDto);
		if(list!=null) {
			response.setMessage("BatchList retrieved ");
			response.setStatus("Successfully");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		throw new NoRecordFoundException();
		
	}

	@PutMapping("/updateCategories")
	public ResponseEntity<AppResponse> updateCategories(@RequestBody CategoriesDto categoriesDto) {
		CategoriesDto categories = service.updateCategories(categoriesDto);
		if (categories != null) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	@GetMapping("/getVariationType")
	public ResponseEntity<AppResponse>getVariationType(@RequestBody   VariationTypesDto variationTypeDto){
		List<VariationTypesEntity> list = service.getVariationType( variationTypeDto);
		if(list!=null) {
			response.setMessage("BatchList retrieved ");
			response.setStatus("Successfully");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		throw new NoRecordFoundException();
		
	}
	
	

	@PutMapping("/updateVariationType")
	public ResponseEntity<AppResponse> updateVariationType(@RequestBody VariationTypesDto variationTypeDto) {
		VariationTypesEntity variationType = service.updateVariationType(variationTypeDto);
		if (variationType != null) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	
	@GetMapping("/getOptionType")
	public ResponseEntity<AppResponse>getOptionType(@RequestBody  OptionTypes optionTypeDto){
		List<OptionTypesEntity> list = service.getOptionType( optionTypeDto);
		if(list!=null) {
			response.setMessage("BatchList retrieved ");
			response.setStatus("Successfully");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		throw new NoRecordFoundException();
		
	}

	@PutMapping("/updateoptionType")
	public ResponseEntity<AppResponse> updateoptionType(@RequestBody OptionTypes optionTypeDto) {
		OptionTypesEntity optionTypes = service.registoroptionType(optionTypeDto);

		if (optionTypes != null) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<AppResponse>getProduct(@RequestBody ProductsDto productDto){
		List<ProductEntity> list = service.getProduct(  productDto);
		if(list!=null) {
			response.setMessage("BatchList retrieved ");
			response.setStatus("Successfully");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		throw new NoRecordFoundException();
		
	}

	@PutMapping("/updateProduct")
	public ResponseEntity<AppResponse> updateProduct(@RequestBody ProductsDto productDto) {
		ProductEntity product = service.updateProduct(productDto);
		if (product != null) {
			response.setMessage("sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}



	@DeleteMapping("/deletedepartment")
	private ResponseEntity<AppResponse> deletedepartment(@RequestBody DepartmentsDto departmentDto) {
		if (service.deletedepartment(departmentDto)) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}

	@DeleteMapping("/deleteCategories")
	private ResponseEntity<AppResponse> deleteCategories(@RequestBody CategoriesDto categoriesDto) {
		if (service.deleteCategories(categoriesDto)) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}

	@DeleteMapping("/deleteVariationType")
	public ResponseEntity<AppResponse> deleteVariationType(@RequestBody VariationTypesDto variationTypeDto) {
		if (service.deleteVariationType(variationTypeDto)) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}

	@DeleteMapping("/deleteoptionType")
	public ResponseEntity<AppResponse> deleteoptionType(@RequestBody OptionTypes optionTypeDto) {
		if (service.deleteoptionType(optionTypeDto)) {
			response.setMessage("sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;
	}

	@DeleteMapping("/deleteProduct")
	public ResponseEntity<AppResponse> deleteProduct(@RequestBody ProductsDto productDto) {
		if (service.deleteProduct(productDto)) {
			response.setMessage(" sucessful");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response, HttpStatus.ACCEPTED);
		}
		return null;

	}
	
	@PostMapping("/registerCategory")
	public ResponseEntity<AppResponse> registorCategories(@RequestBody CategoriesDto categoriesDto ){
		if(((PcmService) service).registerCategories(categoriesDto)){
			response.setMessage(" Data is registered");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}

	@PostMapping("/registorVariationType")
	public ResponseEntity<AppResponse> registorVariationType(@RequestBody VariationTypesDto variationTypeDto ){
		if(service.registerVariationType(variationTypeDto)){
			response.setMessage("Data is registered");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}

	
	@PostMapping("/registeroptionType")
	public ResponseEntity<AppResponse> registoroptionType(@RequestBody OptionTypes optionTypeDto ){
		if(service.registeroptionType(optionTypeDto)){
			response.setMessage(" Data is registeredl");
			response.setStatus("200");
			return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}

		@PostMapping("/registerProduct")
		public ResponseEntity<AppResponse> registorProduct(@RequestBody ProductsDto productDto ){
			if(service.registerProduct(productDto)){
				response.setMessage("Data is registered");
				response.setStatus("200");
				return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
			}
			return null;
		}

		@PostMapping("/registerProductvariation")
		public ResponseEntity<AppResponse> registorProductvariation(@RequestBody ProductVariationsDto productVariationDto ){
			if(service.registerProductvariation(productVariationDto)){
				response.setMessage(" Data is registered");
				response.setStatus("200");
				return new ResponseEntity<AppResponse>(response,HttpStatus.ACCEPTED);
			}
			return null;
		
	}
		
	
	
	
	
	
}


