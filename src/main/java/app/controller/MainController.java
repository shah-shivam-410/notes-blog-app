package app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.utility.RuntimeDataStorage;

@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	RuntimeDataStorage str = new RuntimeDataStorage();
	
	@RequestMapping(path = "/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(path = "/notes")
	public String notes(Model model) {
		model.addAttribute("notes", str.getAllNotes());
		return "notes";
	}
	
	@GetMapping(path = "/blogs")
	public String blogs() {
		return "blogs";
	}

}
