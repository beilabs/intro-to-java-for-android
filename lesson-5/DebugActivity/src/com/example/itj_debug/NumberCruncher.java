package com.example.itj_debug;

/**
 * Sample class that performs basic math operations.
 * 
 * This is the part of the source project for our debug example.
 * 
 * @author Alex Tushinsky (alext@ltmod.com)
 * @version 1.1
 */

public class NumberCruncher {
	private int FirstNum;
	private int SecondNum;

	public int getFirstNum() {
		return FirstNum;
	}

	public void setFirstNum(int firstNum) {
		FirstNum = firstNum;
	}

	public int getSecondNum() {
		return SecondNum;
	}

	public void setSecondNum(int secondNum) {
		SecondNum = secondNum;
	}

	@Override
	public String toString() {
		return FirstNum + " + " + SecondNum + " = " + (FirstNum + SecondNum);
	}

}
