package com.givefoo.simplecalculator;

public class Calculate {
	
	private int firstNumber;
	private int secondNumber;
	
	public Calculate(){}
	
	public Calculate(int firstNumber, int secondNumber){
		this.setFirstNumber(firstNumber);
		this.setSecondNumber(secondNumber);
	}
	
	public String toString(){
		String output = "";
		output += this.getFirstNumber() + " + " + this.getSecondNumber() + " = " + (this.getFirstNumber() + this.getSecondNumber()) +"\n";
		output += this.getFirstNumber() + " - " + this.getSecondNumber() + " = " + (this.getFirstNumber() - this.getSecondNumber()) +"\n";
		output += this.getFirstNumber() + " * " + this.getSecondNumber() + " = " + (this.getFirstNumber() * this.getSecondNumber()) +"\n";
		output += this.getFirstNumber() + " / " + this.getSecondNumber() + " = " + (this.getFirstNumber() / this.getSecondNumber()) +"\n";

		return output;
	}
	
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
}
