package com.example.petshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/")
	public String welcome() {
		return "index";
	}
}
