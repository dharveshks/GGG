package com.morningBatch;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_eg {

	@Test
	private void arun() {
		
		
		System.out.println("im arun");

	}
	
	
	

	
//	@Test(dependsOnMethods = "arun")
//	private void balu() {
//
//		System.out.println("im balu");
//		
//	}
	
	@Test
	private void chandru() {
		
		System.out.println("im chandru");

	}
	
	
	
	
	
}
