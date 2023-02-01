package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.tool.schema.internal.IndividuallySchemaMigratorImpl;
import org.hibernate.type.NTextType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employeeRepository.employeeRepo;
import com.demo.entity.employee;


@Service
public class employeeService {

	  @Autowired
	  employeeRepo employeeRepo;
	
	  
   	  public void addEmp(employee employee) {
		  System.out.println("employee : "+ employee);
		  employeeRepo.save(employee);
	  }
	  
   	  public List<employee> getAllEmployees(){
   		  return employeeRepo.findAll();
   	  }
   	  
	  public employee getEmployee(int id ) {
		  Optional<employee> employee = employeeRepo.findById(id);
		  
		  if(employee.isEmpty()) {
			  return null;
		  }else {
			  return employee.get();
		  }
	  }
   	  
	  
	  public void delete(int id ) {
		  employeeRepo.deleteById(id);
	  }
	 
   	  
	  
}
