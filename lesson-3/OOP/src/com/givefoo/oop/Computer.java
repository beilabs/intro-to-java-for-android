package com.givefoo.oop;

public abstract class Computer {
	private float cpuSpeedMhz = 0;
	private float hdSizeMB = 0;
	private float ramInGB = 0;
	private String osName = "";
	private boolean isRunning = false;

	public float getCpuSpeedMhz() {
		return cpuSpeedMhz;
	}

	public void setCpuSpeedMhz(float cpuSpeedMhz) {
		this.cpuSpeedMhz = cpuSpeedMhz;
	}

	public float getHdSizeMB() {
		return hdSizeMB;
	}

	public void setHdSizeMB(float hdSizeMB) {
		this.hdSizeMB = hdSizeMB;
	}

	public float getRamInGB() {
		return ramInGB;
	}

	public void setRamInGB(float ramInGB) {
		this.ramInGB = ramInGB;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public boolean getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public String turnPowerOn() {
		String output = "";
		setIsRunning(true);
		output += "Startup Initiated!\n";		
		return output;
	}

	public String turnPowerOff() {
		String output = "";
		setIsRunning(false);
		output += "Shutdown Initiated!\n";
		return output;
	}
	
//	public String runDiagnostics() {
//		String output = "";
//		output += "================\n";
//		output += "Computer Diagnostics!\n";
//		output += this.getOsName() + "\n";
//		output += (this.getCpuSpeedMhz() / 1000) + " GHz\n";
//		output += this.getHdSizeMB() + " MB\n";
//		output += (this.getRamInGB() * 1024) + "\n";
//		output += "Currently running: " + getIsRunning() + "\n";
//		output += "================\n";
//
//		setIsRunning(true);
//		output += "Shutdown initiated!\n";
//		return output;
//	}

}
