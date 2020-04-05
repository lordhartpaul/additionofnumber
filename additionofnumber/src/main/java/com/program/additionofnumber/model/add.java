package com.program.additionofnumber.model;

public class add {
	
	private int operand1;
	private int operand2;
	private int result;
	private int okresult;
	
	
	public int getOkresult() {
		return okresult;
	}

	public void setOkresult(int okresult) {
		this.okresult = okresult;
	}

	public add() {
		
	}
	
	public add(int operand1, int operand2, int result, int okresult) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.result = result;
		this.okresult = okresult;
	}
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

}
