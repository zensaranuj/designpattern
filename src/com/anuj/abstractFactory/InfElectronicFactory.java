package com.anuj.abstractFactory;

import com.anuj.simpleFactory.InfTV;

public interface InfElectronicFactory {
	
	InfTV getTV();
	InfRemote getRemote();
}
