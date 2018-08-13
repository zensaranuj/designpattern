package com.anuj.simpleMethod;

import com.anuj.simpleFactory.InfTV;
import com.anuj.simpleFactory.LEDTV;

public class LEDTVFactory  implements TVFactory{

	@Override
	public InfTV createTV() {
		return new LEDTV();
	}
}
