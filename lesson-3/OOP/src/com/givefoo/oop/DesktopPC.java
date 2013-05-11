package com.givefoo.oop;

public class DesktopPC extends Computer implements IComputer{
	
	public String turnPowerOn() {
		String output = "";
		output += super.turnPowerOn();
		output += "Desktop PC is starting up!\n";
		output += "Bootup Sequence.\n";
		output += "Ready!\n";
		return output;
	}

	public String turnPowerOff() {
		String output = "";
		output += super.turnPowerOff();
		output += "Desktop PC is shuting down!\n";
		output += "Shutdown Sequence.\n";
		output += "Good Bye!\n";
		return output;
	}

	@Override
	public String runDiagnostics() {
		String output = "";
		output += "================\n";
		output += "Desktop Diagnostics!\n";
		output += this.getOsName() + "\n";
		output += (this.getCpuSpeedMhz() / 1000) + " GHz\n";
		output += this.getHdSizeMB() + " MB\n";
		output += (this.getRamInGB() * 1024) + "\n";
		output += "Currently running: " + getIsRunning() + "\n";
		output += "================\n";
		return output;
	}
}
