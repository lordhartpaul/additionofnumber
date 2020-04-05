package com.program.additionofnumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.additionofnumber.service.addservice;

@RestController
@ComponentScan
public class additionController {
	
	@Autowired
	addservice addserv;
	
	@RequestMapping("/addition")
	public int getHello()
	{
		
		int resultvalue = addserv.getResult(2,4);
		
		return resultvalue;
		
	}

	@RequestMapping("/subtraction")
	public int getJello()
	{
		
		int resultvalue = addserv.getOkresult(5, 4);
		
		return resultvalue;
		
	}
}
