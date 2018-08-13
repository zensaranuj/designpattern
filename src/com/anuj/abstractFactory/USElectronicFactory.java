package com.anuj.abstractFactory;

import com.anuj.simpleFactory.InfTV;
import com.anuj.simpleFactory.LEDTV;

public class USElectronicFactory  implements InfElectronicFactory{

	@Override
	public InfTV getTV() {
		System.out.println("Get US LED TV");
		return new USLEDTV();
	}

	@Override
	public InfRemote getRemote() {
		System.out.println("Get TV remote for US LED TV");
		return new USLEDRemote();
	}

}
