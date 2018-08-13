package com.anuj.simpleFactory;

import com.anuj.simpleFactory.TVFactory.TVMODE;

public class Client {

	public static void main(String[] args) {
		
		InfTV infTV = TVFactory.getTV(TVMODE.THREED);
		System.out.println(infTV.oNTV());
		System.out.println(infTV.offTV());

	}

}
