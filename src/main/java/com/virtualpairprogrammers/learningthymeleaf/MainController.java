package com.virtualpairprogrammers.learningthymeleaf;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("username", "Matt Greencroft");
		model.put("id", 173);
		return new ModelAndView("homepage", "model", model);
	}
	
	@RequestMapping("/profile")
	public ModelAndView viewProfile() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("title", "Mr");
		model.put("firstName", "Matt");
		model.put("surname", "Greencroft");
		model.put("dateOfBirth", new GregorianCalendar(2006,3,9).getTime());
		model.put("description", "a <strong>fantastic</strong> Java Programmer");
		
		List<String> languages = new ArrayList<String>();
		languages.add("English");
		languages.add("French");
		languages.add("Spanish");
		languages.add("Danish");
		
		model.put("languages", languages);
		
		model.put("color", "#ccc");
		
		return new ModelAndView("profile", "model", model);
	}
}
