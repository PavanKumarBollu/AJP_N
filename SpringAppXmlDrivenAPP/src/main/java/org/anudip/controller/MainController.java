package org.anudip.controller;

import org.anudip.dto.UserLoginDto;
import org.anudip.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainController {
	
	@Autowired
	private ServiceImpl service;
	
	
	static
	{
		System.out.println("MainController .class file is loaded..");
	}
	
	
	public MainController()
	{
		System.out.println("MainController Object has been created");
	}
	
	
	
	public String saveUser(UserLoginDto dto)
	{		
		return service.saveUser(dto);
	}

}
