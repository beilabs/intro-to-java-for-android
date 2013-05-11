/*
Create a new Android application, using the default UI we built in class. The application will take two 
variable values (integers) and output the addition, subtraction, multiplication, and division of those 
values.

Output format:
FirstNumber + SecondNumber = Answer
FirstNumber - SecondNumber = Answer
FirstNumber * SecondNumber = Answer
FirstNumber / SecondNumber = Answer

The FirstNumber and SecondNumber values should come from variables, allowing the programmer to 
specify which values to use.

 * */

package com.givefoo.simplecalculator;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class SimpleCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_calculator);
        TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
        
        int firstNumber = 10;
        int secondNumber = 15;
        
        createOutput(calculateAllTheThings(firstNumber, secondNumber));
	}
	
	private String calculateAllTheThings(int a, int b){
		String sOutput = "";
		sOutput += a + " + " + b + " = " + (a+b) + "\n";
		sOutput += a + " - " + b + " = " + (a-b) + "\n";
		sOutput += a + " * " + b + " = " + (a*b) + "\n";
		sOutput += a + " / " + b + " = " + (a/b) + "\n";
		return sOutput;
	}
	
	private void createOutput(String sText){
		TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
		txtOutput.setText(sText);	
    }

}
