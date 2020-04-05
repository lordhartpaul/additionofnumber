package com.program.additionofnumber.service;

import org.springframework.stereotype.Service;

@Service
public class addservice {
	
	
	
	public Integer getResult(int operand1, int operand2)
	
	{
        Integer result = null;
		result = (int) (operand1 + operand2);
		
		
		return result;
		
	}
	
	public Integer getOkresult(int operand1, int operand2)
	{
		Integer okresult = null;
		okresult = (int) (operand1 - operand2);
		return okresult;
	}

}
