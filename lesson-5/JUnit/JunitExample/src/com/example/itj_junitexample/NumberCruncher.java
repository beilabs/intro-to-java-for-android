package com.example.itj_junitexample;


/**
 * Sample class that performs basic math operations.
 * 
 * This is the source project for our JUnit Test Example.
 * 
 * @author Alex Tushinsky (alext@ltmod.com)
 * @version 1.0
 */
public class NumberCruncher {

	private int firstNum;
	private int secondNum;
	private boolean bValue;

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public boolean isbValue() {
		return bValue;
	}

	public void setbValue(boolean bValue) {
		this.bValue = bValue;
	}

	@Override
	public String toString() {
		return firstNum + " + " + secondNum + " = " + (firstNum + secondNum); // "10 + 15 = 25"
	}
	
	public int cubed(int val) {
		return val * val * val;
	}
}
