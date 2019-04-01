package com.insags.framework.test;

import org.junit.Assert;
import org.junit.Test;

import com.insags.framework.java.HolaMundo;







public class HolaMundoTest  {

	@Test
	public  void mainTest() {
		// TODO Auto-generated method stub
		//primera prueba le pasamos valores 
		String[] argumeno= {"sadek","jesus"};
		HolaMundo.main(argumeno);
		Assert.assertTrue(true);
		
		//segunda prueba le pasamos null 
		HolaMundo.main(null);
		Assert.assertTrue(true);
		
		
		
		
		
		
	
	}

}
