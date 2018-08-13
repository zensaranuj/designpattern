package com.anuj.simpleFactory;

public class ThreeDimensionalTV implements InfTV {

	@Override
	public boolean oNTV() {
		System.out.println(" Now ThreeDimensional TV is ON");
		return false;
	}

	@Override
	public boolean offTV() {
		System.out.println(" Now ThreeDimensional TV is OFF");
		return false;
	}
}
