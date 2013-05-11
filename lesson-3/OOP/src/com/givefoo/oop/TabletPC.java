package com.givefoo.oop;

public class TabletPC extends Computer implements IComputer {

	public TabletPC(){}
	
	public TabletPC(float cpuSpeedMhz, float hdSizeMB, int ramInGB, String osName){
		this.setCpuSpeedMhz(cpuSpeedMhz);
		this.setHdSizeMB(hdSizeMB);
		this.setRamInGB(ramInGB);
		this.setOsName(osName);
	}
	
	public String turnPowerOn() {
		String output = "";
		output += super.turnPowerOn();
		output += "Tablet PC is starting up!\n";
		output += "Bootup Sequence.\n";
		output += "Ready!\n";
		return output;
	}

	public String turnPowerOff() {
		String output = "";
		output += super.turnPowerOff();
		output += "Tablet PC is shuting down!\n";
		output += "Shutdown Sequence.\n";
		output += "Good Bye!\n";
		return output;
	}
	
	@Override
	public String runDiagnostics() {
		
		String output = "";
		output += "================\n";
		output += "Tablet Diagnostics!\n";
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
