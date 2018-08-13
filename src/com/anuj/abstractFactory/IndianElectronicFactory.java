package com.anuj.abstractFactory;

import com.anuj.simpleFactory.InfTV;
import com.anuj.simpleFactory.LEDTV;
/**
 * 
 * We use abstract factory method for grouping of different kind of related objects
 * 
 * Like TV and remote for Indian market, will fall in to one factory
 * US TV and TV remote for US market will fall in to another factory
 * 
 * @author  
 *
 */
public class IndianElectronicFactory  implements InfElectronicFactory{

	@Override
	public InfTV getTV() {
		System.out.println("Get Indian LED TV");
		return new LEDTV();
	}

	@Override
	public InfRemote getRemote() {
		System.out.println("Get TV remote for Indian LED TV");
		return new LEDRemote();
	}

}
