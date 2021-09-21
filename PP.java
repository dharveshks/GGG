package com.morningBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PP {

	@Test
	private void google() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\Desktop\\New folder (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		driver.close();
	}
	
	
	@Test
	private void yahoo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\Desktop\\New folder (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.yahoo.com/");
		
		driver.close();
		

	}
	
	
}
