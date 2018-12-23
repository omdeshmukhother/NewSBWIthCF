package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String landing(Model model)
	{
		System.out.println("In MyController");
		
		model.addAttribute("name", "omkar deshmukh");
		return "home";
	}

}
