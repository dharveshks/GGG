package com.morningBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tt {
	
	@DataProvider
	private Object[][] hi() {
		  return new Object[][] {
			  {"emailid1710@gmail.com","Music1710"},
				{"emailid1710@gmail.com","Music171"}
			  
			  
	};
	}
	
	
	

	@Test(dataProvider = "hi")
	
	
	private void pw(String un ,String pw) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\Desktop\\New folder (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		WebElement en_email = driver.findElement(By.xpath("//*[@id=\'email\']"));

		en_email.sendKeys(un);

		WebElement en_pass = driver.findElement(By.xpath("//*[@id=\'passwd\']"));

		en_pass.sendKeys(pw);

		WebElement login = driver.findElement(By.xpath("//*[@id=\'SubmitLogin\']/span"));

		login.click();
		

	}
	
}
