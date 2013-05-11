package com.givefoo.helloworldjava;

import android.os.Bundle;
import android.app.Activity;
// import android.view.Menu;
import android.widget.TextView;

public class Variables extends Activity {

	int iGlobal = 0;
	static final double PI = 3.141593;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);
        
       	//Set text property
        
        TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
        String sOutput = "";
        
        //declaring variables
        char capitcalC = 'C';
        int iCount = 0;
        
        short a,b,c;
        
        a=10;
        b=20;
        c=5;
        
        String sHello = "Hello";
        String sWorld = "World";
        
        sOutput += "iCount "+ iCount + "\n"; //0 - Current value
        sOutput += "iCount++ = " + (iCount++) + "\n"; //0 - then incremented to 1
        sOutput += "iCount "+ iCount + "\n"; //1
        sOutput += "iCount++ = " + (++iCount) + "\n"; //2
        
        
        sOutput += "a + b = " + a + b + "\n"; //a+b = 1020
        sOutput += "(a + b) = " + (a + b) + "\n"; //(a + b) = 30
        sOutput += "(a + b / c) = " + (a + b / c) + "\n"; //(a + b / c)  = 14
        sOutput += "((a + b) / c) = " + ((a + b) / c) + "\n"; //((a + b) / c) =  6 
        
        String sNum1 = "10";
        String sNum2 = "20";
        
        sOutput += "sNum1 + sNum2 = " + sNum1 + sNum2 + "\n"; // sNum1 + sNum2 = 1020
        sOutput += "sNum1 + sNum2 = " + (Integer.parseInt(sNum1) + Integer.parseInt(sNum2)) + "\n"; //sNum1 + sNum2 = 30
        
        sOutput += "addNumbers(a,b) = " + addNumbers(a,b) + "\n"; // 30
        sOutput += "addNumbers(a,b,c) = " + addNumbers(a,b,c) + "\n"; // 35
        sOutput += "addNumbers(a,b,c) = " + addNumbers(100,25,55) + "\n"; // 1080

        iGlobal += 100;
        sOutput += "iGlobal = " + iGlobal + "\n";
        sOutput += "PI = " + PI + "\n";
        createOutput(sOutput);
    }

    private int addNumbers(int a, int b){
    	return a+b;    	
    }    
    
    //overloading example; extra input variables
    private int addNumbers(int a, int b, int c){
    	iGlobal += 50;
    	return a+b+c;    	
    }    
    
    
    private void createOutput(String sText){
    	TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
    	txtOutput.setText(sText);	
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.variables, menu);
        return true;
    }
  */  
}
