package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayController {
	
	@GetMapping("/about")
	public String ShowAboutPage(Model model) {
		
		   model.addAttribute("name","RAM");
		   model.addAttribute("age","30");
		   model.addAttribute("phno","9875428");
		   model.addAttribute("address","CTC");
		   return "about";
	}

}
