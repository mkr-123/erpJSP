package com.textile.erpJSP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
	
	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("message", "maga working");
		return "index";
	}

}
