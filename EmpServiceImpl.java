package com.te.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.entity.Employee;
import com.te.ems.repo.MyRepository;
import com.te.ems.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private MyRepository repository;
	

	public Employee addEmployee(Employee employee) {// return type can be void too.
		// TODO Auto-generated method stub
		return repository.save(employee);
	}


	@Override
	public void  deleteEmployee(Employee employee) {
		
		 repository.delete(employee);
		// TODO Auto-generated method stub
		
	}
	

}
