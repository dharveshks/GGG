package com.morningBatch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_eg {

	
	@Test(dataProvider = "demo")
	private void ab(int a , String b) 
	
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	@DataProvider(name = "demo")
	private Object[][] op() {
		 
		return new Object[][] {
			
			{17,"smith"} ,{20,"starc"}
			};
		
	
	}
	
	
	
}
