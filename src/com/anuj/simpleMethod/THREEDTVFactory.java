package com.anuj.simpleMethod;

import com.anuj.simpleFactory.InfTV;
import com.anuj.simpleFactory.ThreeDimensionalTV;

public class THREEDTVFactory  implements TVFactory{

	@Override
	public InfTV createTV() {
		return new ThreeDimensionalTV();
	}
}
