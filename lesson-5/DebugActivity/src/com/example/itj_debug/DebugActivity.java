/* 
 * This work is licensed under the Creative Commons Attribution 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by/3.0/ 
 * or send a letter to Creative Commons, 444 Castro Street, Suite 900, 
 * Mountain View, California, 94041, USA.
 * 
 * You are free:
 *   to Share � to copy, distribute and transmit the work
 *   to Remix � to adapt the work
 *   to make commercial use of the work
 *   
 * Under the following conditions:
 *   Attribution � You must attribute the work in the manner specified by the author or 
 *   licensor (but not in any way that suggests that they endorse you or your use of the work.  
 */

package com.example.itj_debug;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

/**
 * Application to demonstrate the use of debugging features in Eclipse.
 * 
 * There are several bugs in the application, including an uncaught exception,
 * as well as a logical error.
 * 
 * @author Alex Tushinsky (alext@ltmod.com)
 * @version 1.1
 */

public class DebugActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debug);

		final TextView txtOut = (TextView) findViewById(R.id.txtOutput);

		int firstNumber = 2;
		int secondNumber = 3;

		firstNumber--;

		secondNumber += 2;

		for (int i = 0; i < 25; i++) {
			secondNumber += i;
		}

		// secondNumber = secondNumber / 0;

		String sOut = "";

		sOut = GetResult(firstNumber, secondNumber);

		txtOut.setText(sOut);
	}

	String GetResult(int Num1, int Num2) {
		NumberCruncher oProc = new NumberCruncher();
		oProc.setFirstNum(Num1);
		oProc.setSecondNum(Num2);

		return oProc.toString();
	}

}
