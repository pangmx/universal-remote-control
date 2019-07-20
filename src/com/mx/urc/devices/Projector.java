package com.mx.urc.devices;

public class Projector extends Device{

	@Override
	public void switchOn() {
		System.out.println("Projector switched ON.");
	}

	@Override
	public void switchOff() {
		System.out.println("Projector switched OFF.");
		
	}
	
	@Override
	public String toString() {
		return "Projector";
	}

}
