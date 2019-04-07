package com.rizvi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	//binding
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("movie", new Movie());
		return "main-form";
	}
	
	//mengambil data
	@RequestMapping("/processForm")
	public String processForm(
			@Validated
			@ModelAttribute("movie") 
			Movie movie, 
			BindingResult bindingResult,
			ModelMap model) {
		
		if(bindingResult.hasErrors()) {
			return "main-form";
		}else {
			return "output-entry";
		}
	}
}