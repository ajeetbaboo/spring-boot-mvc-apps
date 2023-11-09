package com.demo.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.task.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {

	Employee findByUsernameAndPassword(String username,String password);

}
