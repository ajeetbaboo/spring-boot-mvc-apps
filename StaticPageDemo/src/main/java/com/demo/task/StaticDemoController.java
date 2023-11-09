package com.demo.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticDemoController {

	@GetMapping(value = {"/loginPage"})
	public String login() {
		return "index";
	}
	
	@GetMapping(value = {"/register"})
	public String register() {
		return "login";
	}
}
