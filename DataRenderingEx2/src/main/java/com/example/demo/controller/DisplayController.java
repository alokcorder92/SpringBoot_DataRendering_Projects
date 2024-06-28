package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
@Controller
@RequestMapping("/display")
public class DisplayController {
    
	@GetMapping("/about")
	public String showAboutPage(Model model) {
		
		Student student=new Student();
		student.setName("RAM");
		student.setAge("30");
		student.setPhno("98562415");
		student.setAddress("BBSR");
		model.addAttribute("student",student);
		return "about";
	}
}
