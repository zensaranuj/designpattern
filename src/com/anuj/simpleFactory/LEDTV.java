package com.anuj.simpleFactory;

public class LEDTV implements InfTV{

	@Override
	public boolean oNTV() {
		System.out.println(" Now LED TV is ON");
		return false;
	}

	@Override
	public boolean offTV() {
		System.out.println(" Now LED TV is OFF");
		return false;
	}
	
}
