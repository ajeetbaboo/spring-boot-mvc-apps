package com.demo.task.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.task.model.Employee;
import com.demo.task.service.EmpServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	EmpServiceImpl empServiceImpl;

	@GetMapping(value = {"/","/login"})
	public String loginPage() {
		return "index";
	}
	
	@GetMapping("/registerform")
	public String registerform() {
		return "register";
	}

	@PostMapping("/registerAction")
	public ModelAndView registerAction(@RequestParam Map<String, String> body) {
		Employee employee = new Employee();
		employee.setUsername(body.get("username"));
		employee.setPassword(body.get("password"));
		empServiceImpl.saveEmployee(employee);
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		view.addObject("username", employee.getUsername());
		view.addObject("password", employee.getPassword());
		return view;
	}

	@PostMapping("/loginAction")
	public ModelAndView loginAction(@RequestParam Map<String, String> body) {
		Employee employee = new Employee();
		employee.setUsername(body.get("username"));
		employee.setPassword(body.get("password"));
		Employee emp = empServiceImpl.findEmployeeByUserNamePassword(employee);
		ModelAndView view = new ModelAndView();
		if (emp != null) {
			view.setViewName("home");
			view.addObject("username", employee.getUsername());
			view.addObject("password", employee.getPassword());
		} else
			view.setViewName("index");
		return view;
	}
	
}
