package com.te.ems.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.te.ems.entity.Employee;
import com.te.ems.response.MyResponse;
import com.te.ems.service.EmpService;
@Controller
public class EmsController {
	@Autowired
	private MyResponse myResponse;
	@Autowired
	private EmpService empService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<MyResponse> addEmployee(@RequestBody Employee employee) {
		Employee employee2 = empService.addEmployee(employee);
		if(employee2!=null) {
			myResponse.setError(false);
			myResponse.setMsg("Employee added successfully");
			myResponse.setStatus(200);
			myResponse.setData(Arrays.asList(employee2));
			return new ResponseEntity<MyResponse>(myResponse,HttpStatus.OK);
			
		}
		else {
			myResponse.setError(true);
			myResponse.setMsg("Failure");
			myResponse.setStatus(400);
			
		}
		return null;
	}
	
	
	@PostMapping("/deleteEmployee")
	public ResponseEntity<MyResponse> deleteEmployee(@RequestBody Employee employee) {
		empService.deleteEmployee(employee);
		if(employee!=null) {
			myResponse.setError(false);
			myResponse.setMsg("Employee deleted successfully");
			myResponse.setStatus(200);
			myResponse.setData(Arrays.asList(employee));
			return new ResponseEntity<MyResponse>(myResponse,HttpStatus.OK);
			
		}
		else {
			myResponse.setError(true);
			myResponse.setMsg("Failure");
			myResponse.setStatus(400);
			
		}
		return null;
	}
	
	
	
	
	

}
