package com.anuj.abstractFactory;

import com.anuj.simpleFactory.InfTV;

public class Client {

	public static void main(String[] args) {
		
		InfElectronicFactory electronicFactory = new IndianElectronicFactory();
		InfTV ledtvInd =   electronicFactory.getTV();
		System.out.println(ledtvInd.oNTV());
		
		electronicFactory = new USElectronicFactory();
		InfTV ledtvUS = electronicFactory.getTV();
		System.out.println(ledtvUS.offTV());
		
	}

}
