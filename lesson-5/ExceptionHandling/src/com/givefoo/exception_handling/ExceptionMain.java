package com.givefoo.exception_handling;

public class ExceptionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionExamples oEE = new ExceptionExamples();
		try{
			oEE.methodWithException();	
		}
		catch(ArithmeticException ex){
			System.out.println("Exception caught: " + ex.getMessage());
		}
		
		try{
				oEE.doDivisionChecked(0);
		}
		catch(Exception ex){
			System.out.println("Exception caught: " + ex.getMessage());
		}
		try{
			oEE.doDivisionUnchecked(0);
		}
		catch(Exception ex){
			System.out.println("Exception caught: " + ex.getMessage());
		}

		try{
			oEE.doDivisionMultiple(0);
		}
		catch(Exception ex){
			System.out.println("Exception caught: " + ex.getMessage());
		}

		
		try{
			oEE.doDivisionMultiple(-10);
		}
		catch(Exception ex){
			System.out.println("Exception caught: " + ex.getMessage());
		}

		System.out.println("Application Complete!");
		
		
	}

}
