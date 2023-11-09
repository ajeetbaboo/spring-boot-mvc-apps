package com.demo.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.task.model.Employee;
import com.demo.task.repository.EmpRepository;

@Service
public class EmpServiceImpl {

	@Autowired
	EmpRepository empRepository;
	
	public Employee saveEmployee(Employee emp) {
		return empRepository.save(emp);
	}
	
	public Employee findEmployeeByIdPassword(Long eid) {
		return empRepository.getReferenceById(eid);
	}
	
	public Employee findEmployeeByUserNamePassword(Employee employee) {
		return empRepository.findByUsernameAndPassword(employee.getUsername(),employee.getPassword());
	}
	
	
}
