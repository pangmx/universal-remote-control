package com.mx.urc.devices;

public class SoundSystem extends Device{

	@Override
	public void switchOn() {
		System.out.println("Sound System switched ON.");
	}

	@Override
	public void switchOff() {
		System.out.println("Sound System switched OFF.");
		
	}
	
	@Override
	public String toString() {
		return "Sound System";
	}

}
