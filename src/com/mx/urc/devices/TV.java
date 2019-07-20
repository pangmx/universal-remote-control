package com.mx.urc.devices;

public class TV extends Device{

	@Override
	public void switchOn() {
		System.out.println("TV switched ON.");
	}

	@Override
	public void switchOff() {
		System.out.println("TV switched OFF.");
		
	}

	@Override
	public String toString() {
		return "TV";
	}
	
	

	
}
