package com.mx.urc;

import com.mx.urc.controllers.RemoteControl;
import com.mx.urc.devices.Projector;
import com.mx.urc.devices.SoundSystem;
import com.mx.urc.devices.TV;

public class Person {

	public static void main(String[] args) {
		RemoteControl myRemoteControl = RemoteControl.getInstance();
		TV myTV = new TV();
		SoundSystem mySoundSystem = new SoundSystem();
		Projector myProjector = new Projector();
		
		//turn on all devices
		myRemoteControl.selectDevice(myTV);
		myRemoteControl.switchOn();
		
		myRemoteControl.selectDevice(mySoundSystem);
		myRemoteControl.switchOn();
		
		myRemoteControl.selectDevice(myProjector);
		myRemoteControl.switchOn();
		
		//turn off all devices
		myRemoteControl.selectDevice(myTV);
		myRemoteControl.switchOff();
		
		myRemoteControl.selectDevice(mySoundSystem);
		myRemoteControl.switchOff();
		
		myRemoteControl.selectDevice(myProjector);
		myRemoteControl.switchOff();
	}

}
