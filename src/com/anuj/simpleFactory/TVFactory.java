package com.anuj.simpleFactory;


/**
 * 
 * Client does not know how to create object
 * 
 * switch case is responsible for creating objects
 * 
 * It produces/creates same type of objects
 * 
 * 
 * @author  
 *
 */
public class TVFactory {

	enum TVMODE{LED,
				LCD,
				THREED};
	
	public static InfTV getTV(TVMODE tvMode) {
		InfTV tv = null;
		switch (tvMode) {
		case LCD:
			tv =  new LCDTV();
			break;
		case LED:
			tv =  new LEDTV();
			break;
		case THREED:
			tv =  new ThreeDimensionalTV();
			break;
		default:
			tv = null; 
			break;
		}
		
		return tv;
	}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
