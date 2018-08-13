package com.anuj.simpleMethod;

import com.anuj.simpleFactory.LCDTV;

public class Client {

	public static void main(String[] args) {

		TVFactory tvFactory = new LCDTVFactory();
		LCDTV lcdtv = (LCDTV) tvFactory.createTV();
		
	}

}
