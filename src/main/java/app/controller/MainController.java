package app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping(path = "/")
	public String home() {
		logger.info("Endpoint invoked: {}, Method Invoked: {}", "/", "home");
		return "index";
	}
	
}
