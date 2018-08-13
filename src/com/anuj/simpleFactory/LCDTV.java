package com.anuj.simpleFactory;

public class LCDTV implements InfTV {

	@Override
	public boolean oNTV() {
		System.out.println(" Now LCD TV is ON");
		return false;
	}

	@Override
	public boolean offTV() {
		System.out.println(" Now LCD TV is OFF");
		return false;
	}
	
}
