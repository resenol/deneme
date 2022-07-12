package com.testexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testexam.service.TestService;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
	@Autowired
	TestService service;

	@GetMapping("/test")
	public String test() {
		return "succes";
	}

	@GetMapping("/getData")
	public String getData() {
		return service.getData();
	}

}
