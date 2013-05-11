package com.givefoo.oop;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
		String sOut = "";
		
		DesktopPC oDesktop1 = new DesktopPC();
		
		oDesktop1.setCpuSpeedMhz(1700);
		oDesktop1.setHdSizeMB(500);
		oDesktop1.setOsName("Windows");
		oDesktop1.setRamInGB(4);
		sOut += oDesktop1.turnPowerOn();
		sOut += oDesktop1.runDiagnostics();
		
		NotebookPC oNote = new NotebookPC();
		oNote.setCpuSpeedMhz(1200);
		oNote.setHdSizeMB(200);
		oNote.setOsName("Linux");
		oNote.setRamInGB(2);
		sOut += oNote.turnPowerOn();
		sOut += oNote.runDiagnostics();
		
		TabletPC oTablet = new TabletPC(500, 16, 1, "osx");
		sOut += oTablet.turnPowerOn();
		sOut += oTablet.turnPowerOff();
		sOut += oTablet.runDiagnostics();

		txtOutput.setText(sOut);
	}
}
