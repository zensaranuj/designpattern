package com.anuj.simpleMethod;

import com.anuj.simpleFactory.InfTV;
/**
 * It creates\produces same type of objects
 * 
 * Sub classes are responsible to create\produce objects
 * 
 * @author  
 *
 */
public interface TVFactory {

	InfTV createTV();
	
}
