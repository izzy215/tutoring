package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VaivController{

	@GetMapping("/vaiv")
	public String vaiv(
					@RequestParam(name="name")String name)
			 {
		return "vaiv";
	}
}
