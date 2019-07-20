package com.mx.urc.controllers;
import com.mx.urc.devices.Device;

public class RemoteControl {
	
	private Device selectedDevice = null;	
	private static RemoteControl INSTANCE = new RemoteControl();
	private static int counter = 0;
	
	private RemoteControl() {	
		counter++;
		System.out.println(counter);
	}
	
	public static RemoteControl getInstance() {
		return INSTANCE;
	}
	
	public void selectDevice(Device selectedDevice) {
		this.selectedDevice = selectedDevice;
		System.out.println(selectedDevice.toString() + " selected.");
	}
	
	public void switchOn() {
		this.selectedDevice.switchOn();
	}
	
	public void switchOff() {
		this.selectedDevice.switchOff();
	}

}
