package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;

@Controller
@RequestMapping("/display")
public class DisplayController {
	
	@GetMapping("/about")
	public String showAboutpage(Model model) {
		
		Student student1=new Student();
		student1.setName("DURGA");
		student1.setAge("70");
		student1.setPhno("88965824");
		student1.setAddress("SALEPUR");
		
		Student student2=new Student();
		student2.setName("BIKASH");
		student2.setAge("60");
		student2.setPhno("9788965824");
		student2.setAddress("BALESWAR");
		
		List<Student> studentList =new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		
		model.addAttribute("students",studentList);
		return "about";
		
	}
	
	

}

