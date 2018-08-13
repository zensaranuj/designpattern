package com.anuj.abstractFactory;

import com.anuj.simpleFactory.InfTV;

public class USLEDTV implements InfTV {

	@Override
	public boolean oNTV() {
		System.out.println("US LED TV is now ON");
		return false;
	}

	@Override
	public boolean offTV() {
		System.out.println("US LED TV is now OFF");
		return false;
	}

}
