package com.givefoo.exception_handling;

public class ExceptionExamples {

	public void methodWithException(){
		int a = 10;
		a = a/0; // causes ArithmeticException
	}
	
	//Checked Exception example
	public void doDivisionChecked(int a) throws Exception{
		//Throws a checked exception.  We must wrap the doDivision method in a try/catch
		if(a==0){
			throw new Exception("Divide by Zero error in doDivisionChecked!");
		}
		a = 10 / a;
		System.out.println("From doDivision checked: "+ a);
	}

	//Unchecked Exception example
	public void doDivisionUnchecked(int a) throws RuntimeException{
		//Throws a checked exception.  We must wrap the doDivision method in a try/catch
		if(a==0){
			throw new RuntimeException("Divide by Zero error in doDivisionUnchecked!");
		}
		a = 10 / a;
		System.out.println("From doDivisionUnchecked: "+ a);
	}
	
	public void doDivisionMultiple(int a) throws ArithmeticException, IllegalArgumentException{
		if(a==0){
			throw new ArithmeticException("Divide by zero error in doDivisionMultiple!");
		}
		if(a<0){
			throw new IllegalArgumentException("Value is not allowed in doDivisionMultiple!");
		}
		a = 10 / a;
		System.out.println("From doDivisionMultiple: "+ a);
	}
	
}
