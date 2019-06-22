package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("여기로 왓니");
		return "helloworld";
	}

}
