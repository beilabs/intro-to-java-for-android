package com.givefoo.oop;

public class NotebookPC extends Computer implements IComputer{

	@Override
	public String runDiagnostics() {		
		String output = "";
		output += "================\n";
		output += "Notebook Diagnostics!\n";
		output += this.getOsName() + "\n";
		output += (this.getCpuSpeedMhz() / 1000) + " GHz\n";
		output += this.getHdSizeMB() + " MB\n";
		output += (this.getRamInGB() * 1024) + "\n";
		output += "Currently running: " + getIsRunning() + "\n";
		output += "================\n";

		setIsRunning(true);
		output += "Shutdown initiated!\n";
		return output;
	}

}
