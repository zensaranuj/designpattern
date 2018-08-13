package com.anuj.simpleMethod;

import com.anuj.simpleFactory.InfTV;
import com.anuj.simpleFactory.LCDTV;

public class LCDTVFactory implements TVFactory{

	@Override
	public InfTV createTV() {
		return new LCDTV();
	}

}
