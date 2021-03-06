package com.patel.doctorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConroller {
	
	@GetMapping("/getdoctors")
	public String getDiagnosis()
	{
		return "Doctors service called";
	}
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name)
	{
		return "Hi"+name+" Welcome to Doctors service";
	}

}
