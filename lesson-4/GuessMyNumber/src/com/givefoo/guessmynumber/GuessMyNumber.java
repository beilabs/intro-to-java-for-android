package com.givefoo.guessmynumber;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class GuessMyNumber extends Activity {

	private short numberOfTries = -1;
	private int computerNumber = 0;
	private int[] oldNumbers = new int[10];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guess_my_number);
		
		generateRandomNumber();
		setTries();


		final Button btnOK = (Button) findViewById(R.id.btnOK);
		
		btnOK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				processGuess();
			}
		});
		
		final Button btnReset = (Button) findViewById(R.id.btnReset);
		btnReset.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				reset();
			}
		});
	}
	
	private void generateRandomNumber(){
		computerNumber = (int) (Math.random() * 10) + 1; //between 1 and 10		
		Log.d("APP", "Generating Random Number: " + computerNumber);
	}
	
	private void setTries(){
		numberOfTries += 1;
		final TextView txtTries = (TextView) findViewById(R.id.txtTries);
		Log.d("APP", "Number of tries: " + numberOfTries);
		txtTries.setText("Number of tries: " + numberOfTries);
	}
	
	private void processGuess(){
		final EditText txtInput = (EditText) findViewById(R.id.txtNumber);
		final TextView txtOutput = (TextView) findViewById(R.id.txtAnswer);
		
		short userNumber = 0;		
		
		 //if length is greater than 0, user provided input
		if(txtInput.getText().length() > 0){
			userNumber = Short.parseShort(txtInput.getText().toString());
			Log.d("APP", "User entered "+userNumber);
		}
		else{	
			return;
		}
		
		txtInput.setText(""); //create the edittext field for the next guess

		
		setTries();
		if (userNumber == computerNumber) {
			Log.d("APP", "You got it! It took you " + numberOfTries + " tries!");
			txtOutput.setText("You got it! It took you " + numberOfTries + " tries!");
			reset();
		}else{
			Log.d("APP", "Sorry, it wasn't " + getNumberText(userNumber) + "!");
			txtOutput.setText("Sorry, it wasn't " + getNumberText(userNumber) + "!");
		}
		
		for(int i=0; i < oldNumbers.length; i++){
			if(oldNumbers[i] == userNumber){
				Log.d("APP", "You've used " + getNumberText(userNumber) + " before!");
				txtOutput.setText("You've used " + getNumberText(userNumber) + " before!");
			}
		}
		oldNumbers[numberOfTries] = userNumber;
	}
	
	private void reset() {
		numberOfTries = -1;
		generateRandomNumber();
		setTries();
		oldNumbers = new int[10];
	}
	
	private String getNumberText(short userInput){
		String strOutput = "";
		
		switch(userInput){
			case 1: strOutput = "one"; break;
			case 2: strOutput = "two"; break;
			case 3: strOutput = "three"; break;
			case 4: strOutput = "four"; break;
			case 5: strOutput = "five"; break;
			case 6: strOutput = "six"; break;
			case 7: strOutput = "seven"; break;
			case 8: strOutput = "eight"; break;
			case 9: strOutput = "nine"; break;
			case 10: strOutput = "ten"; break;
			default: strOutput = ""+userInput; break;
		}
		return strOutput;
	}

}
