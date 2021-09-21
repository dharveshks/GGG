package com.morningBatch;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rtm implements IRetryAnalyzer{

	
	
	int count = 1 ,limit = 3;
	public boolean retry(ITestResult result) {
		if (count <= 3)
		{
			count ++ ;
			 return true ;
		}
		return false;
	}

}
