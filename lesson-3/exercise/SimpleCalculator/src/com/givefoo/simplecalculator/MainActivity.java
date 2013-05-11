package com.givefoo.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txtOutput = (TextView) findViewById(R.id.textOutput);
		String sOut = "";
		
		Calculate oDesktop1 = new Calculate(10, 15);
		sOut += oDesktop1.toString();
		
		Calculate oDesktop2 = new Calculate(100, 50);
		sOut += oDesktop2.toString();
		
		txtOutput.setText(sOut);
	}
}
