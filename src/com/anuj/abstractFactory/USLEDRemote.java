package com.anuj.abstractFactory;

public class USLEDRemote implements InfRemote {

	@Override
	public boolean onRemote() {
		System.out.println("US LED remote TV controller is now on");
		return false;
	}

	@Override
	public boolean offRmote() {
		System.out.println("US LED remote TV controller is now off");
		return false;
	}

}
