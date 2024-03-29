package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import index.dao.indexDAO;

@Controller
public class WelcomeController {
@Autowired
	private indexDAO indexdao;
	
	@RequestMapping("/index")
	public String index() {
		return "helloworld";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	@RequestMapping("/insert2")
	public String insert2(@RequestParam Map<String,String>map) {
		indexdao.insert(map);
		return "index";
	}
	

}
