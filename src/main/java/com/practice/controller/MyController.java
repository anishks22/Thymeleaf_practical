package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
//    http://localhost:8080/about
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Inside about handler");
		model.addAttribute("name","Anish kumar");
		model.addAttribute("currentDate",new Date().toLocaleString());
		
		return "about";
		//about.html
	}
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		//create a list,set collection
		List<String> names = List.of("Anish","manish","suyash","AK");
		m.addAttribute("names", names);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionalHandler(Model m) {
		System.out.println("Conditional Handler Executed");
		m.addAttribute("isActive",false);
		m.addAttribute("gender", "F");
		
		List<Integer> list = List.of(11,23,45,66);
		m.addAttribute("mylist", list);
		
		return "condition";
	}
	
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title","I Like to eat Mango");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}
	@GetMapping("/newabout")
	public String newabout(Model m) {
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact(Model m) {
		return "contact";
	}
}
