package com.morningBatch;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rt implements IRetryAnalyzer{

	int count = 1 , limit = 10 ;
	public boolean retry(ITestResult result) {
	if (count <= limit) 
	
	{
		count ++ ;
		return true ;
	}
		
		
		return false;
	}

}
